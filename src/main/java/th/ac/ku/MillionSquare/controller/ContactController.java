package th.ac.ku.MillionSquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.MillionSquare.data.ContactRepository;
import th.ac.ku.MillionSquare.model.Contact;
import th.ac.ku.MillionSquare.model.Customer;
import th.ac.ku.MillionSquare.service.ContactService;
import th.ac.ku.MillionSquare.service.CustomerService;

@Controller

@RequestMapping("/contact")
public class ContactController {

    private ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @GetMapping
    public String getHomePage(Model model){
        model.addAttribute("contact","Contact Us");
        return "contact";
    }

    @PostMapping
    public String sendContact(@ModelAttribute Contact contact, Model model) {
        System.out.println("okay");
        service.saveContact(contact);
        model.addAttribute("allCustomers", service.getContact());
        return "redirect:contact";
    }
}
