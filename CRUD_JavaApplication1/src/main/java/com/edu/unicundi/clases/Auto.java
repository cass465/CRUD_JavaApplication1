/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unicundi.clases;

/**
 *
 * @author cass465
 */
public class Auto {
    private Integer id;
    private String marca;
    private String modelo;
    private String servicio;

    public Auto() {
        
    }

    public Auto(Integer id, String marca, String modelo, String servicio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.servicio = servicio;
    }
    
    public Auto(String marca, String modelo, String servicio) {
        this.marca = marca;
        this.modelo = modelo;
        this.servicio = servicio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    
    
}
