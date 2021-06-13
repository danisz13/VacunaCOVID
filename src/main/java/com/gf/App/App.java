/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.App;

import com.gf.Controlador.Controlador;
import com.gf.DAO.OrganizacionDAO;
import com.gf.DAO.PaisDAO;
import com.gf.DAO.UsuariosDAO;
import com.gf.DAO.VacunaDAO;
import com.gf.vista.DatosPais;
import com.gf.vista.Login;

/**
 *
 * @author Dani
 */
public class App {

    public static void main(String[] args) {

        DatosPais vistaDatosPais = new DatosPais();
        Login loginView = new Login();
        OrganizacionDAO organizacionDAO = new OrganizacionDAO();
        DatosPais datosPaisView= new DatosPais();
        PaisDAO paisDAO=new PaisDAO();
        VacunaDAO vacunaDAO=new VacunaDAO();
        UsuariosDAO usuariosDAO=new UsuariosDAO();
        Controlador controlador = new Controlador(datosPaisView, loginView, organizacionDAO, paisDAO, vacunaDAO, usuariosDAO);
    }
}
