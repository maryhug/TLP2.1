package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Usuario;

@Controller
public class usuarioController {

    // http://localhost:3030/formulario
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario("", "", ""));
        return "Formulario/Formulario";
    }

    @PostMapping("/mostrar")
    public String mostrarUsuario(@ModelAttribute Usuario usuario, Model model) {
        model.addAttribute("usuario", usuario);
        return "Formulario/Mostrar";
    }
}
