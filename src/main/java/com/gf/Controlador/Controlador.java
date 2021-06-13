/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.Controlador;

import com.gf.DAO.OrganizacionDAO;
import com.gf.DAO.PaisDAO;
import com.gf.DAO.UsuariosDAO;
import com.gf.DAO.VacunaDAO;
import com.gf.vista.DatosPais;
import com.gf.vista.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dani
 */
public class Controlador implements ActionListener{
    
    private DatosPais datosPaisView;
    private Login loginView;
    private OrganizacionDAO organizacionDAO;
    private PaisDAO paisDAO;
    private VacunaDAO vacunaDAO;
    private UsuariosDAO usuariosDAO;

    public Controlador(DatosPais datosPaisView, Login loginView, OrganizacionDAO organizacionDAO, PaisDAO paisDAO, VacunaDAO vacunaDAO, UsuariosDAO usuariosDAO) {
        this.datosPaisView = datosPaisView;
        this.loginView = loginView;
        this.organizacionDAO = organizacionDAO;
        this.paisDAO = paisDAO;
        this.vacunaDAO = vacunaDAO;
        this.usuariosDAO = usuariosDAO;
        this.loginView.setVisible(true);
        this.loginView.getLabelTextoIncorrect().setVisible(false);
        this.loginView.getBotonInicioSesion().addActionListener(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
}
