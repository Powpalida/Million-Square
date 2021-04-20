package th.ac.ku.MillionSquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.MillionSquare.model.Payment;
import th.ac.ku.MillionSquare.service.CustomerService;

@Controller
@RequestMapping("/payment")
public class PaymentController {

    private CustomerService service;
    private int check = 0;
    public PaymentController(CustomerService service){
        this.service = service;
    }

    @GetMapping
    public String getHomePage(Model model){
        if(check == 2){
            model.addAttribute("greeting","Sucess");
        }
        if(check == 1){
            model.addAttribute("greeting","Sorry you have to register first");
        }
        return "payment";
    }

    @PostMapping
    public String submitPayment(@ModelAttribute Payment payment,Model model) {
        try {
            if(service.findCustomer(payment.getId()) == null){

            }
            else {
                check = 2;
            }
        }catch (Exception e){
            check = 1;
        }
        return "redirect:payment";
    }
}
