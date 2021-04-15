package th.ac.ku.MillionSquare.controller;

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
    private CustomerRepository repository;
    public CustomerController(CustomerService customerService,CustomerRepository repository) {
        this.customerService = customerService;
        this.repository = repository;
    }

    @GetMapping
    public String getCustomerPage(Model model) {
        model.addAttribute("allCustomers", customerService.getCustomers());
        return "customer";
    }

    @PostMapping
    public String registerCustomer(@ModelAttribute Customer customer, Model model) {
        try {
            if(customerService.checkPin(customer) == null){

            }
            else{
                System.out.println("regis mai dai");
            }
        } catch (Exception e) {
            customerService.createCustomer(customer);
            System.out.println("work2");
        }
        return "redirect:customer";
    }

}
