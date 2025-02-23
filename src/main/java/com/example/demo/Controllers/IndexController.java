package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    //http://localhost:3030/index
    @GetMapping({"/", "/index", "/home"})
    public String index(Model model) {
        model.addAttribute("Titulo", "Hola Spring");      
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {
        model.addAttribute("Titulo", "Perfil");
        model.addAttribute("Nombre", "Mary");       
        model.addAttribute("Apellido", "Duran");       
        model.addAttribute("Correo", "marydur@gmail.com");
        return "perfil";
    }

}
