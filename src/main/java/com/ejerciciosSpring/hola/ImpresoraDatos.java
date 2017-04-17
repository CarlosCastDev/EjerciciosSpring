package com.ejerciciosSpring.hola;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ccastillov on 07/04/2017.
 */
@Component
public class ImpresoraDatos {
    private ServicioMensaje servicioMensaje = null;
    @Autowired
    private ServicioSumadora servicioSumadora;

    @Autowired
    public void ImpresoraDatos(ServicioMensaje servicioMensaje)
    {
        this.servicioMensaje = servicioMensaje;
    }

    public void imprimeMensaje(){
        System.out.println(this.servicioMensaje.getMensaje());
    }

    public void imprimeSuma(String agr1,  Double agr2)
    {
        System.out.println(this.servicioSumadora.dameSuma(Integer.parseInt(agr1), agr2.intValue()));
    }

}
