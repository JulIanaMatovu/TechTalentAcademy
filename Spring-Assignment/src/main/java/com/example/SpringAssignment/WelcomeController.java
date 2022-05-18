package com.example.SpringAssignment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
    @GetMapping("/welcome") //ensures that HTTP GET requests to /greeting are mapped to the greeting() method
    //requestParam puts the value of name into the name parameter of the greeting method
    //if a name is not entered, World is used as the default value; this name value is added to the Model object which makes it accessible to the View template (implemented by Thymeleaf)
    public String welcome(@RequestParam(name="name", required=false, defaultValue="girl-coder") String name, Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }
}
