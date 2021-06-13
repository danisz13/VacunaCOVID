/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.Modelo;

/**
 *
 * @author Dani
 */
public class Usuarios {
    private String nombre;
    private String contrasena;
    private String pais;

    public Usuarios() {
    }

    public Usuarios(String nombre, String contrasena, String pais) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
            
}
