/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.Modelo;

/**
 *
 * @author sanarrda
 */
public class Prueba {
    private String grupoEdad;
    private String nombreVacuna;
    private double porcentajeEfectividad;
    private boolean fatiga;
    private boolean fiebre;
    private boolean mareo;
    private boolean diarrea;
    private String otros;

    public String getGrupoEdad() {
        return grupoEdad;
    }

    public void setGrupoEdad(String grupoEdad) {
        this.grupoEdad = grupoEdad;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public double getPorcentajeEfectividad() {
        return porcentajeEfectividad;
    }

    public void setPorcentajeEfectividad(double porcentajeEfectividad) {
        this.porcentajeEfectividad = porcentajeEfectividad;
    }

    public boolean isFatiga() {
        return fatiga;
    }

    public void setFatiga(boolean fatiga) {
        this.fatiga = fatiga;
    }

    public boolean isFiebre() {
        return fiebre;
    }

    public void setFiebre(boolean fiebre) {
        this.fiebre = fiebre;
    }

    public boolean isMareo() {
        return mareo;
    }

    public void setMareo(boolean mareo) {
        this.mareo = mareo;
    }

    public boolean isDiarrea() {
        return diarrea;
    }

    public void setDiarrea(boolean diarrea) {
        this.diarrea = diarrea;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public Prueba() {
    }

    public Prueba(String grupoEdad, String nombreVacuna, double porcentajeEfectividad, boolean fatiga, boolean fiebre, boolean mareo, boolean diarrea, String otros) {
        this.grupoEdad = grupoEdad;
        this.nombreVacuna = nombreVacuna;
        this.porcentajeEfectividad = porcentajeEfectividad;
        this.fatiga = fatiga;
        this.fiebre = fiebre;
        this.mareo = mareo;
        this.diarrea = diarrea;
        this.otros = otros;
    }
    
    
}
