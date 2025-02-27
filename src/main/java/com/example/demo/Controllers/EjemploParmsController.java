package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")

public class EjemploParmsController {

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("Titulo", "Parametros");

        return "Parametros/index";
    }

    
    
    //http://localhost:3030/params/string?texto=jajajjaja
    @GetMapping("/string")
    public String param (@RequestParam String texto, Model model) {

        model.addAttribute("Titulo", "Recibir parametros del Request HTTP GET - URL");
        model.addAttribute("Resultado", "El texto enviado es: " + texto);

        return "Parametros/ver";
    }

}
