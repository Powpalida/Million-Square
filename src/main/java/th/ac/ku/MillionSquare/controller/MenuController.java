package th.ac.ku.MillionSquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.MillionSquare.model.Menu;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @GetMapping
    public String getHomePage(Model model){
        return "menu";
    }

    @PostMapping
    public String sendContact(@ModelAttribute Menu menu, Model model) {
        System.out.println("okay okay");
        model.addAttribute("name", "SALTED EGG LAVA CROISSANT");
        return "redirect:menu";
    }
}
