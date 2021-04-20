package th.ac.ku.MillionSquare.controller;

import javafx.scene.chart.ScatterChart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.MillionSquare.data.CustomerRepository;
import th.ac.ku.MillionSquare.model.Ad_min;
import th.ac.ku.MillionSquare.model.Customer;
import th.ac.ku.MillionSquare.service.AdminService;
import th.ac.ku.MillionSquare.service.CustomerService;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;
    private AdminService adminService;
    private int check = 0;
    public CustomerController(CustomerService customerService,AdminService adminService) {
        this.customerService = customerService;
        this.adminService = adminService;
    }

    @GetMapping
    public String getCustomerPage(Model model) {
        if(check == 2)
            model.addAttribute("check", "this id is already exists");
        else
            model.addAttribute("check", "");
        return "customer";
    }

    @PostMapping
    public String registerCustomer(@ModelAttribute Customer customer, Model model) {
        try {
            if(customerService.checkPin(customer) == null){

            }
            else{
                check = 2;
            }
        } catch (Exception e) {
            try{
                Ad_min ad_min = new Ad_min(customer.getId(),customer.getName(),customer.getPin(),customer.getTel());
                if(adminService.checkPin(ad_min) == null){

                }
                else {
                    check = 2;
                    return "redirect:customer";
                }
            }catch (Exception ex){

            }
            check = 1;
            customerService.createCustomer(customer);
        }
        return "redirect:customer";
    }

}
