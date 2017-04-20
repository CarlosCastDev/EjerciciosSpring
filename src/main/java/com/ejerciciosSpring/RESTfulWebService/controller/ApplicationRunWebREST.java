package com.ejerciciosSpring.RESTfulWebService.controller;

import com.ejerciciosSpring.RESTfulWebService.dto.Bienvenida;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ccastillov on 20/04/2017.
 */
@SpringBootApplication
public class ApplicationRunWebREST {
    private static final Logger log = LoggerFactory.getLogger(ApplicationRunWebREST.class);
    public static void main(String[] args) {
        @Bean
        public RestTemplate restTemplate(RestTemplateBuilder builder) {
            return builder.build();
        }

        @Bean
        public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
            return args -> {
                Bienvenida saludo = restTemplate.getForObject(
                        "http://gturnquist-quoters.cfapps.io/api/random", Bienvenida.class);
                log.info(saludo.toString());
            };
        }
    }
}