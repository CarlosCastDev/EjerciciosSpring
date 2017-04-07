package com.ejerciciosSpring.hola;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ccastillov on 07/04/2017.
 */
@Configuration
@ComponentScan
public class Aplicacion {
    @Bean
    ServicioMansaje mockMensaje()
    {
        return new ServicioMansaje() {
            @Override
            public String getMensaje() {
                return "Hola Spring";
            }
        };
    }
     public static void main(String arghhh[]){
         ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);
         ImpresoraMensaje impresora = context.getBean(ImpresoraMensaje.class);
         impresora.imprimeMensaje();
     }
}
