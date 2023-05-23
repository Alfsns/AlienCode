package com.aliencode.riomagicstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class ControllersBasic {
    @GetMapping("/saludar")
    public String saludar(){
        System.out.println("Hola mundo");
        return "index";
    }
}
