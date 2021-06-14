/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.Modelo;

/**
 *
 * @author GRUPO5
 * @since 14-06-2021
 * @version 1.0  
 */
public class Usuarios {
    /*
    * Nombre del usuario
    */
    private String nombre;
    /*
    * Contraseña del usuario
    */
    private String contrasena;
    /*
    * Pais de origen del usuario
    */
    private String pais;

    /*
    * Constructor
    * @param nombre
    * @param contraseña
    */
    public Usuarios(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    /*
    * Constructor sin parametros
    */
    public Usuarios() {
    }
    
    /*
    * Constructor
    * @param nombre
    * @param contraseña
    * @param pais
    */   
    public Usuarios(String nombre, String contrasena, String pais) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.pais = pais;
    }
    
    /*
    * @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /*
    * @param nombre para dar valor al nombre del usuario
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /*
    * @return contrasena
    */
    public String getContrasena() {
        return contrasena;
    }
    /*
    * @param contrasena para dar valor a la contraseña del usuario
    */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /*
    * @return pais
    */
    public String getPais() {
        return pais;
    }
    /*
    * @param pais para establecer el pais del usuario
    */
    public void setPais(String pais) {
        this.pais = pais;
    }
    
            
}
