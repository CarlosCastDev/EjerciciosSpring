package com.ejerciciosSpring.hola;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ccastillov on 07/04/2017.
 */
@Component
public class ImpresoraMensaje {
    final private ServicioMansaje servicio = null;

    @Autowired
    public void ImpresoraMensajes(ServicioMansaje servicio)
    {
        servicio = servicio;
    }

    public void imprimeMensaje(){
        System.out.println(this.servicio.getMensaje());
    }

}
