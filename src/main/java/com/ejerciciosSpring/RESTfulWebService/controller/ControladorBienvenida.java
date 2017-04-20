package com.ejerciciosSpring.RESTfulWebService.controller;

import com.ejerciciosSpring.RESTfulWebService.dto.Bienvenida;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ccastillov on 17/04/2017.
 */
@RestController
public class ControladorBienvenida {
    private static final String plantilla = "Hola, %s!";
    private final AtomicLong contador = new AtomicLong();

    @RequestMapping("/BienvenidaRESTful")
    public Bienvenida BienvenidaRESTful(@RequestParam(value = "nombre", defaultValue = "MunditoRESTful") String nombre)
    {
        return new Bienvenida(contador.incrementAndGet(), String.format(plantilla, nombre));
    }
}