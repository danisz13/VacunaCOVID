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
public class Pais {
    private String nombre;
    private double capitalInvertido;
    private int numHabitantes;
    private int codigo;

    /*
    *@param nombre
    *@param capitalInvertido
    *@param numHabitantes
    *@param codigo
    */
    public Pais(String nombre, double capitalInvertido, int numHabitantes, int codigo) {
        this.nombre = nombre;
        this.capitalInvertido = capitalInvertido;
        this.numHabitantes = numHabitantes;
        this.codigo = codigo;
    }

    /*
    * Contructor sin parametros
    */
    public Pais() {
    }

    /*
    * @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /*
    *@param nombre para esteblecer el nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
    * @return capitalInvertido
    */
    public double getCapitalInvertido() {
        return capitalInvertido;
    }

    /*
    *@param capitalInvertido para esteblecer el capitalInvertido
    */
    public void setCapitalInvertido(double capitalInvertido) {
        this.capitalInvertido = capitalInvertido;
    }

    /*
    * @return numHabitantes
    */
    public int getNumHabitantes() {
        return numHabitantes;
    }

    /*
    *@param numHabitantes para esteblecer el numHabitantes
    */
    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    /*
    * @return codigo
    */
    public int getCodigo() {
        return codigo;
    }

    /*
    *@param codigo para esteblecer el codigo
    */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
