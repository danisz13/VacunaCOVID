/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.App;

import com.gf.Controlador.ControladorVistaLogin;
import com.gf.DAO.OrganizacionDAO;
import com.gf.DAO.PaisDAO;
import com.gf.DAO.UsuariosDAO;
import com.gf.DAO.VacunaDAO;
import com.gf.vista.Login;

/**
 *
 * @author GRUPO5
 * @since 14-06-2021
 * @version 1.0
 */
public class App {

    public static void main(String[] args) {

        Login loginView = new Login();
        OrganizacionDAO organizacionDAO = new OrganizacionDAO();
        PaisDAO paisDAO = new PaisDAO();
        VacunaDAO vacunaDAO = new VacunaDAO();
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        ControladorVistaLogin controlador = new ControladorVistaLogin(loginView, organizacionDAO, paisDAO, vacunaDAO, usuariosDAO);
    }
}
