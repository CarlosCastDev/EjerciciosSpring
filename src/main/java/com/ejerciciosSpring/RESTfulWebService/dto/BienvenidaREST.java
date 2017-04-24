package com.ejerciciosSpring.RESTfulWebService.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ccastillov on 17/04/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BienvenidaREST {
    private long id;
    private String content;

    public BienvenidaREST()
    {

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ",content='" + content + '\'' +
                '}';
    }
}