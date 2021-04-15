package th.ac.ku.MillionSquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.MillionSquare.model.Ad_min;
import th.ac.ku.MillionSquare.model.Customer;
import th.ac.ku.MillionSquare.model.Stock;
import th.ac.ku.MillionSquare.service.AdminService;
import th.ac.ku.MillionSquare.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

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
                model.addAttribute("stocks","ALL PRODUCTS");
                List<Stock> products = new ArrayList<>();
                products.add(new Stock(1,"Salted egg lava croissant",80,100));
                products.add(new Stock(2,"Donut",40,100));
                products.add(new Stock(3,"Sandwich",70,100));
                products.add(new Stock(4,"Choco cupcake",65,100));
                products.add(new Stock(5,"Strawberry cupcake",75,120));
                products.add(new Stock(6,"Lemon meringue pie",110,80));
                products.add(new Stock(7,"Berry cake",470,5));
                products.add(new Stock(8,"Chocolate cake",520,4));
                products.add(new Stock(9,"Brownie",120,80));
                products.add(new Stock(10,"Biscuit",60,120));
                products.add(new Stock(11,"Mint macaron",140,30));
                products.add(new Stock(12,"macaron",120,40));
                model.addAttribute("allProducts",products);
                return "stock";
            }
        } catch (Exception e) {
            model.addAttribute("greeting","Can't find customer");
        }
        return "home";
    }
}
