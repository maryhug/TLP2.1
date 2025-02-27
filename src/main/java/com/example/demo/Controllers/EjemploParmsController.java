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

    //http://localhost:3030/params/mix-params?texto=jajajjaja&num=7
    //El texto enviado es: MENSAJE POR DEFECTO y el numero es: 7
    //http://localhost:3030/params/mix-params?saludo=jajajjaja&num=7
    //El texto enviado es: jajajjaja y el numero es: 7
    @GetMapping("/mix-params")
    public String variables(@RequestParam (name = "saludo", required = false, defaultValue= "MENSAJE POR DEFECTO")String texto, 
                            @RequestParam Integer num, Model model) {

        model.addAttribute("Titulo", "Recibir parametros Parametro URL");
        model.addAttribute("Resultado", "El texto enviado es: " + texto + " y el numero es: " + num);

        return "Parametros/ver";
    }

}
