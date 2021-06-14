/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.Modelo;

import java.sql.Date;


/**
 *
 * @author GRUPO5
 * @since 14-06-2021
 * @version 1.0 
 */
public class Organizacion {
    
    /*
    * Nombre de la organizacion
    */
    private String nombre;
    /*
    * NIF de la organizacion
    */
    private String NIF;
    /*
    * El capital invertido de la organizacion
    */
    private double capitalInvertido;
    /*
    *Numero de trbajadores de la organizacion
    */
    private int numTrabajadores;
    /*
    *Indica si la organizacion es privada o no
    */
    private int privada;
    /*
    *Codigo de la organizacion
    */
    private int codigo;
    /*
    *Codigo del pais
    */
    private int codPais;
    /*
    *Nombre de la vacuna
    */
    private String nombreVacuna;
    /*
    *Cantidad de dosis fabricadas
    */
    private int dosisFabricadas;
    /*
    *Cantidad de dosis fabricas de una vacuna
    */
    private Date fechaHoy;
    /*
    *Fecha prevista de la vacuna
    */
    private Date fechaPrevista;
    
    /*
    *@param nombre
    *@param NIF
    *@param capitalInvertido
    *@param numTrabajadores
    *@param privada
    *@param codigo
    *@param codPais
    *@param nombreVacuna
    *@param dosisFabricadas
    *@param fechaHoy
    *@param fechaPrevista
    */
    public Organizacion(String nombre, String NIF, double capitalInvertido, int numTrabajadores, int privada, int codigo, int codPais, String nombreVacuna, int dosisFabricadas, Date fechaHoy, Date fechaPrevista) {
        this.nombre = nombre;
        this.NIF = NIF;
        this.capitalInvertido = capitalInvertido;
        this.numTrabajadores = numTrabajadores;
        this.privada = privada;
        this.codigo = codigo;
        this.codPais = codPais;
        this.nombreVacuna = nombreVacuna;
        this.dosisFabricadas = dosisFabricadas;
        this.fechaHoy = fechaHoy;
        this.fechaPrevista = fechaPrevista;
    }
    
    /*
    *Constructor vacio
    */
    public Organizacion() {
    }
    
    /*
    * @return nombre
    */
    public String getNombre() {
        return nombre;
    }
    
    /*
    * @param nombre para establecer el nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /*
    * @return NIF
    */
    public String getNIF() {
        return NIF;
    }
    
    /*
    * @param nombre para establecer el nombre
    */
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    /*
    * @return capitalInvertido
    */
    public double getCapitalInvertido() {
        return capitalInvertido;
    }
    
    /*
    * @param nombre para establecer el nombre
    */
    public void setCapitalInvertido(double capitalInvertido) {
        this.capitalInvertido = capitalInvertido;
    }

    /*
    * @return numTrabajadores
    */
    public int getNumTrabajadores() {
        return numTrabajadores;
    }
    
    /*
    * @param nombre para establecer el nombre
    */
    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }

    /*
    * @return privada
    */
    public int getPrivada() {
        return privada;
    }
    
    /*
    * @param nombre para establecer el nombre
    */
    public void setPrivada(int privada) {
        this.privada = privada;
    }

    /*
    * @return codigo
    */
    public int getCodigo() {
        return codigo;
    }
    
    /*
    * @param nombre para establecer el nombre
    */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    /*
    * @return codPais
    */
    public int getCodPais() {
        return codPais;
    }

    /*
    * @param nombre para establecer el nombre
    */
    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    /*
    * @return nombreVacuna
    */
    public String getNombreVacuna() {
        return nombreVacuna;
    }

    /*
    * @param nombre para establecer el nombre
    */
    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    /*
    * @return dosisFabricadas
    */
    public int getDosisFabricadas() {
        return dosisFabricadas;
    }

    /*
    * @param nombre para establecer el nombre
    */
    public void setDosisFabricadas(int dosisFabricadas) {
        this.dosisFabricadas = dosisFabricadas;
    }
    
    /*
    *@return fechaHoy
    */
    public Date getFechaHoy() {
        return fechaHoy;
    }

    /*
    * @param nombre para establecer el nombre
    */
    public void setFechaHoy(Date fechaHoy) {
        this.fechaHoy = fechaHoy;
    }

    /*
    * @return fechaPrevista
    */
    public Date getFechaPrevista() {
        return fechaPrevista;
    }

    /*
    * @param nombre para establecer el nombre
    */
    public void setFechaPrevista(Date fechaPrevista) {
        this.fechaPrevista = fechaPrevista;
    }

}
