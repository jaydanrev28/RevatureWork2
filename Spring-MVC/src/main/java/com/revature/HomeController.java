package com.revature;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("this is hoe page");
        return "home";
    }
}