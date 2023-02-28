package com.clothsgalaxy.clothsgalaxy.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.clothsgalaxy.clothsgalaxy.Service.ClothsService;
import com.clothsgalaxy.clothsgalaxy.beans.Contact;
import com.clothsgalaxy.clothsgalaxy.beans.Image;
import com.clothsgalaxy.clothsgalaxy.beans.User;

@Controller
public class ClothsController {

    @Autowired
    private ClothsService clothsservice;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("all_Images", clothsservice.showImages());
        
        return "index";
    }

     @GetMapping("/cart")
     public String getcartdetails() {
        return "cart";
     }

    @GetMapping("/contact/index")
    public String contactReturn() {
        return "index";
    }

    
    @GetMapping("/image")
    public String imageReturn() {
        return "index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @PostMapping("/contact/enquiry")
    public String contact(@ModelAttribute Contact contact) {
        clothsservice.addContact(contact);
        return "contact";
    }

    @GetMapping("/login")
    public String indexlogin() {
        return "login";
    }

    @PostMapping("/user")
    public String adduser(@ModelAttribute User user) {
        clothsservice.adduser(user);
        return "index";
    }

    @PostMapping("/checklogin")
    public String checklogin(String email, String password) {

        if (email.equals("jitendra0764@gmail.com") && password.equals("9076229768")) {
            return "image";
        } else {
            String message = clothsservice.searchUser(email, password);
            return "index";
        }
    }

    @PostMapping("/addimage")
    public String addimage(@ModelAttribute Image image) {
        clothsservice.addImages(image);
        return "image";

    }

    @GetMapping("/showimages")
    public String showImages(Model model) {
        model.addAttribute("all_Images", clothsservice.showImages());
        return "index";
    }

    
    @GetMapping("/showimages/{id}")
    public String showImagesid(Model model,Integer id) {
        model.addAttribute("all_Images", clothsservice.showImagesid(id));
        return "cart";
    }

}
