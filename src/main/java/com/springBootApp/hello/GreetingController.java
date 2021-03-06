package com.springBootApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luis on 4/27/2017.
 */
//http://localhost:8081/greeting
// http://localhost:8081/greeting?name=luis
@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam (value = "name" ,  required = false, defaultValue = "World")String name, Model model   ){
        model.addAttribute("name",name);
        return "greeting";
    }
}
