package th.ac.ku.MillionSquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.MillionSquare.model.Customer;
import th.ac.ku.MillionSquare.model.Stock;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StockController {

    @RequestMapping("/stock")
    public String getStockPage(Model model){
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

//    @GetMapping("/edit/{id}")
//    public String getEditStockPage(@PathVariable int id, Model model){
//        Stock product = accountService.getBankAccount(id);
//        model.addAttribute("allProducts",product);
//        return "stock-edit";
//    }
//
//    @PostMapping("/edit/{id}")
//    public String editProduct(@PathVariable int id, @ModelAttribute Stock product, Model model){
//        accountService.editBankAccount(product);
//        model.addAttribute("allProducts",accountService.getBankAccounts());
//        return "redirect:/stock";
//    }
}
