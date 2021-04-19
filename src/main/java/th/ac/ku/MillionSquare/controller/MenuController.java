package th.ac.ku.MillionSquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.MillionSquare.model.Menu;
import th.ac.ku.MillionSquare.model.Stock;
import th.ac.ku.MillionSquare.service.StockService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {
    private StockService service;

    public MenuController(StockService service) {
        this.service = service;
    }


    @GetMapping
    public String getMenuPage(Model model){
        return "menu";
    }

    @PostMapping
    public String sendContact(@ModelAttribute Menu menu, Model model) {
        System.out.println("okay okay");
        model.addAttribute("name", "SALTED EGG LAVA CROISSANT");
        return "redirect:menu";
    }
}
