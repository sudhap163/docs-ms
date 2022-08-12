package com.mydocstore.docs;

@Controller
public class AppController {

    @GetMapping("/")
    public String viewHomePage() {
        
        return "home"
    }
}