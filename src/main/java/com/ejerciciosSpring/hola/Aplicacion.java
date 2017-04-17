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
    ServicioMensaje mockMensaje()
    {
        return new ServicioMensaje() {
            @Override
            public String getMensaje() {
                return "Hola Spring";
            }
        };
    }
    @Bean
    ServicioSumadora mockSumadora()
    {
        return new ServicioSumadora() {
            @Override
            public int dameSuma(int digito1, int digito2) {
                return digito1+digito2;
            }
        };
    }

     public static void main(String arghhh[]){
         ApplicationContext context = new AnnotationConfigApplicationContext(Aplicacion.class);
         ImpresoraDatos impresora = context.getBean(ImpresoraDatos.class);
         impresora.imprimeMensaje();
         System.out.println("Probando suma::::");
         impresora.imprimeSuma("1",new Double(2));
     }
}