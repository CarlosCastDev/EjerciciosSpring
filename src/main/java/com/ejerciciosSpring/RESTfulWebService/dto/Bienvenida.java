package com.ejerciciosSpring.RESTfulWebService.dto;

/**
 * Created by ccastillov on 17/04/2017.
 */
public class Bienvenida {
    private final long id;
    private final String content;

    public Bienvenida(long id, String content)
    {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}