package th.ac.ku.MillionSquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.MillionSquare.model.Customer;
import th.ac.ku.MillionSquare.model.Stock;
import th.ac.ku.MillionSquare.service.StockService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/stock")
public class StockController {
    private StockService service;

    public StockController(StockService service) {
        this.service = service;
    }

    @GetMapping
    public  String getStockPage(Model model){
        model.addAttribute("allProducts", service.getAllStock());
        return "stock";
    }

    @PostMapping
    public String openStockPage(@ModelAttribute Stock stock, Model model){
        service.openStockPage(stock);
        model.addAttribute("allProducts", service.getAllStock());
        return "redirect:stock";
    }

    @GetMapping("/edit/{id}")
    public String getEditStocktPage(@PathVariable int id,Model model){
        Stock stock = service.getStock(id);
        model.addAttribute("stock",stock);
        return "stock-edit";
    }

    @PostMapping("/edit/{id}")
    public String editStock(@PathVariable int id,@ModelAttribute Stock stock,Model model){
        service.editStock(stock,id);
        model.addAttribute("allProducts",service.getAllStock());
        return "redirect:/stock";
    }

    @GetMapping("/delete/{id}")
    public String getDeleteStock(@PathVariable int id,Model model){
        Stock stock = service.getStock(id);
        service.deleteStock(stock,id);
        model.addAttribute("stock",stock);
        return "stock";
    }
    //
    @PostMapping("/delete/{id}")
    public String deleteStock(@PathVariable int id,@ModelAttribute Stock stock,Model model){
        service.deleteStock(stock,id);
        model.addAttribute("allProducts",service.getAllStock());
        return "redirect:/stock";
    }
}
