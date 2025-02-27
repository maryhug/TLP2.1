package com.example.demo.Controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Usuario;

@Controller
@RequestMapping("/app")
//ruta base http://localhost:3030/app/listar

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
    
    @GetMapping("/listar")
    public String listar(Model model) {
        
        List<Usuario> usuarios=new ArrayList<>();
        usuarios.add(new Usuario("PEPITO","PEREZ","PP@GMAIL.COM"));
        usuarios.add(new Usuario("CARA","PEZ","PAP@GMAIL.COM"));
        usuarios.add(new Usuario("PETO","REZ","PPR@GMAIL.COM"));

        model.addAttribute("usuarios",usuarios);
        model.addAttribute("titulo","listado de usuarios");

        return "listar";
    }

}
