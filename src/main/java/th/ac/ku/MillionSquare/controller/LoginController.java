package th.ac.ku.MillionSquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.MillionSquare.model.Ad_min;
import th.ac.ku.MillionSquare.model.Customer;
import th.ac.ku.MillionSquare.service.AdminService;
import th.ac.ku.MillionSquare.service.CustomerService;

@Controller
@RequestMapping("/login")
public class LoginController {

    private CustomerService customerService;
    private AdminService adminService;

    public LoginController(CustomerService customerService,AdminService adminService) {
        this.customerService = customerService;
        this.adminService = adminService;
    }

    @GetMapping
    public String getLoginPage(){
        return "login";
    }


    @PostMapping
    public  String login(@ModelAttribute Customer customer, Model model) {
        try {
            if(customerService.checkPin(customer) == null){

            }
            else{
                model.addAttribute("greeting", "Welcome, " + customerService.checkPin(customer).getName());
            }
        } catch (Exception e) {
            model.addAttribute("greeting","Can't find customer");
        }
        try {
            Ad_min ad_min = new Ad_min(customer.getId(),customer.getName(),customer.getPin(),customer.getTel());
            if(adminService.checkPin(ad_min) == null){

            }
            else{
                model.addAttribute("greeting", "Welcome, " + customer.getName());
                return "contact";
            }
        } catch (Exception e) {
            model.addAttribute("greeting","Can't find customer");
        }
        return "home";
    }
}
