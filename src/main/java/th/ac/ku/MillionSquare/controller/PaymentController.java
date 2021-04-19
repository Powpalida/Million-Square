package th.ac.ku.MillionSquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.MillionSquare.model.Menu;

@Controller
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping
    public String getHomePage(){ ;
        return "payment";
    }

    @PostMapping
    public String sendContact() {
        System.out.println("okay okay");
        return "redirect:payment";
    }
}
