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
public class Vacuna {
    
    /*
    * Nombre de la vacuna
    */
    private String nombre;
    
    /*
    * Fase de la vacuna
    */
    private int fase;
    
    /*
    * Nombre de la variante para la cual actua la vacuna
    */
    private String variante;

    /*
    * Constructor
    * @param nombre
    * @param fase
    * @param variante
    */
    public Vacuna(String nombre, int fase, String variante) {
        this.nombre = nombre;
        this.fase = fase;
        this.variante = variante;
    }

    /*
    * Constructor sin parametros
    */
    public Vacuna() {
    }
    
    /*
    * @return nombre
    */
    public String getNombre() {
        return nombre;
    }
    
    /*
    * @param nombre para dar valor al nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
    * @return fase
    */
    public int getFase() {
        return fase;
    }

    /*
    * @param nombre para dar valor a la fase de la vacuna
    */
    public void setFase(int fase) {
        this.fase = fase;
    }

    /*
    * @return variante
    */
    public String getVariante() {
        return variante;
    }

    /*
    * @param variante para dar valor a la variante a la que la vacuna hace efecto
    */
    public void setVariante(String variante) {
        this.variante = variante;
    }
    
    
            
            
}
