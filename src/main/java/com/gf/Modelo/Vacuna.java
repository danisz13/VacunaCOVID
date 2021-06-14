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
public class Vacuna {
    private String nombre;
    private int fase;
    private String variante;

    public Vacuna(String nombre, int fase, String variante) {
        this.nombre = nombre;
        this.fase = fase;
        this.variante = variante;
    }

    public Vacuna() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }
    
    
            
            
}
