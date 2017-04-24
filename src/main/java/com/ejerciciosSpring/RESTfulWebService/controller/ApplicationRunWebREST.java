package com.ejerciciosSpring.RESTfulWebService.controller;

import com.ejerciciosSpring.RESTfulWebService.dto.Bienvenida;
import com.ejerciciosSpring.RESTfulWebService.dto.BienvenidaREST;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ccastillov on 20/04/2017.
 */
@SpringBootApplication
public class ApplicationRunWebREST {
    private static final Logger log = LoggerFactory.getLogger(ApplicationRunWebREST.class);

/*        public static void main(String args[])
        {
            SpringApplication.run(ApplicationRunWebREST.class);
        }

        @Bean
        public RestTemplate restTemplate(RestTemplateBuilder builder) {
            return builder.build();
        }

        @Bean
        public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
            return args -> {
                for (int i=0;i<10;i++)
                {
                    BienvenidaREST saludo = restTemplate.getForObject("http://localhost:8080/BienvenidaRESTful", BienvenidaREST.class);
                    log.info(saludo.toString());
                }
            };
        }*/
}