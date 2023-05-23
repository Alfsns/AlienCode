package com.aliencode.riomagicstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;


@Controller

public class ControllersBasic {
    @GetMapping("/saludar")
    public String saludar(Model modelo){
        System.out.println("Hola mundo");
        

        //Consulta a la base de datos
        String nombreUsuario ="Homero Simpson";
        modelo.addAttribute("nombre", nombreUsuario);
        return "index";
    }
}
