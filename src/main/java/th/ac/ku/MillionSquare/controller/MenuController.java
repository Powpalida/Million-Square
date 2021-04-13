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
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu(01,"CAKE",200));
        menuList.add(new Menu(02,"CROISSANT",80));
        menuList.add(new Menu(03,"BROWNIES",65));
        model.addAttribute("menu","menus");
        return "menu";
    }

}
