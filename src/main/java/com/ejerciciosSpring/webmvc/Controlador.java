package com.ejerciciosSpring.webmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ccastillov on 11/04/2017.
 */
@Controller
public class Controlador {
@RequestMapping("/bienvenida")
    public String bienvenida(@RequestParam(value = "nombre" , required = false, defaultValue = "mundito" ) String nombre,
                             Model modelo)
    {
        modelo.addAttribute("nombre", nombre);
        System.out.println("Pasando:"+nombre);
        return "bienvenida";
    }
}
