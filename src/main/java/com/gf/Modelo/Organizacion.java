/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.Modelo;

import java.sql.Date;


/**
 *
 * @author Dani 
 * 
 */
public class Organizacion {

    private String nombre;
    private String NIF;
    private double capitalInvertido;
    private int numTrabajadores;
    private int privada;
    private int codigo;
    private int codPais;
    private String nombreVacuna;
    private int dosisFabricadas;
    private Date fechaHoy;
    private Date fechaPrevista;

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

    public Organizacion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public double getCapitalInvertido() {
        return capitalInvertido;
    }

    public void setCapitalInvertido(double capitalInvertido) {
        this.capitalInvertido = capitalInvertido;
    }

    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }

    public int getPrivada() {
        return privada;
    }

    public void setPrivada(int privada) {
        this.privada = privada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodPais() {
        return codPais;
    }

    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public int getDosisFabricadas() {
        return dosisFabricadas;
    }

    public void setDosisFabricadas(int dosisFabricadas) {
        this.dosisFabricadas = dosisFabricadas;
    }

    public Date getFechaHoy() {
        return fechaHoy;
    }

    public void setFechaHoy(Date fechaHoy) {
        this.fechaHoy = fechaHoy;
    }

    public Date getFechaPrevista() {
        return fechaPrevista;
    }

    public void setFechaPrevista(Date fechaPrevista) {
        this.fechaPrevista = fechaPrevista;
    }

}
