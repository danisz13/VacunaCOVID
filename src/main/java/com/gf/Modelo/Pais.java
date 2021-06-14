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
public class Pais {
    private String nombre;
    private double capitalInvertido;
    private int numHabitantes;
    private int codigo;

    public Pais(String nombre, double capitalInvertido, int numHabitantes, int codigo) {
        this.nombre = nombre;
        this.capitalInvertido = capitalInvertido;
        this.numHabitantes = numHabitantes;
        this.codigo = codigo;
    }

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapitalInvertido() {
        return capitalInvertido;
    }

    public void setCapitalInvertido(double capitalInvertido) {
        this.capitalInvertido = capitalInvertido;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
