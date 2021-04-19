package th.ac.ku.MillionSquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentController {

    @RequestMapping("/payment")
    public String getHomePage(Model model){
        model.addAttribute("payment","hi");
        return "payment";
    }
}
