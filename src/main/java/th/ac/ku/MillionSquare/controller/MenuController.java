package th.ac.ku.MillionSquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.MillionSquare.model.Menu;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MenuController {

    @RequestMapping("/menu")
    public String getMenuPage(Model model){
        return "menu";
    }
}
