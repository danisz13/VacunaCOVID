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
import com.gf.Modelo.Pais;
import com.gf.Modelo.Usuarios;
import com.gf.vista.DatosPais;
import com.gf.vista.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author GRUPO5
 * @since 14-06-2021
 * @version 1.0
 */
public class ControladorVistaLogin implements ActionListener {

    /*
    * Instancia de la clase Login
    */
    private Login loginView;
    /*
    * Instancia de la clase OrganizacionDAO
    */
    private OrganizacionDAO organizacionDAO;
    /*
    * Instancia de la clase PaisDAO
    */
    private PaisDAO paisDAO;
    /*
    * Instancia de la clase VacunaDAO
    */
    private VacunaDAO vacunaDAO;
    /*
    * Instancia de la clase UsuariosDAO
    */
    private UsuariosDAO usuariosDAO;
    /*
    * Instancia de la clase ControladorDatosPais
    */
    private ControladorDatosPais controladorDatosPais;
    /*
    * Instancia de la clase DatosPais
    */
    private DatosPais datosPaisView;
    
    /*
    *@param loginView 
    *@param organizacionDAO
    *@param organizacionDAO
    *@param vacunaDAO
    *@param usuariosDAO
    */
    public ControladorVistaLogin(Login loginView, OrganizacionDAO organizacionDAO, PaisDAO paisDAO, VacunaDAO vacunaDAO, UsuariosDAO usuariosDAO) {
        this.datosPaisView=new DatosPais();
        this.controladorDatosPais=new ControladorDatosPais(datosPaisView, vacunaDAO);
        
        this.loginView = loginView;
        this.organizacionDAO = organizacionDAO;
        this.paisDAO = paisDAO;
        this.vacunaDAO = vacunaDAO;
        this.usuariosDAO = usuariosDAO;
        this.loginView.setVisible(true);
        this.loginView.getLabelTextoIncorrect().setVisible(false);
        this.loginView.getBotonInicioSesion().addActionListener(this);
        this.loginView.getLabelCrear().addMouseListener(new MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegistroMouseClicked(evt);
            }
        ;
        });
        this.loginView.getRegistroView().getBotonCrearCuenta().addActionListener(this);
        this.loginView.getRegistroView().getComboListaPaises().setModel(getCombo());

    }
    
    /*
    * @return DefaultComboBoxModel
    */
    private DefaultComboBoxModel getCombo() {
        DefaultComboBoxModel<Pais> combo = new DefaultComboBoxModel<>();

        ArrayList<Pais> paises = paisDAO.getAll();
        for (int i = 0; i < paises.size(); i++) {
            combo.addElement(paises.get(i));
        }
        return combo;
    }
    
    /*
    * Metodo para la pulsacion de teclado, donde la ventana de registro se hará visible 
    */
    private void labelRegistroMouseClicked(java.awt.event.MouseEvent evt) {
        this.loginView.getRegistroView().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.loginView.getBotonInicioSesion()) {

            Usuarios usuario = usuariosDAO.get(this.loginView.getTextNombre().getText());
            if (usuario != null) {
                if (!usuario.getContrasena().equals(this.loginView.getTextContraseña().getText())) {
                    this.loginView.getLabelTextoIncorrect().setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null, "Usuario Correcto");
                    controladorDatosPais.getDatosPaisView().setVisible(true);
                    
                }
            } else {
                this.loginView.getLabelTextoIncorrect().setVisible(true);
            }
            
        } else if (e.getSource() == this.loginView.getRegistroView().getBotonCrearCuenta()) {
            Usuarios usuario = usuariosDAO.get(this.loginView.getTextNombre().getText());
            if (usuario == null) {
                if ((this.loginView.getTextNombre().getText()).equals("")) {
                    if(this.loginView.getRegistroView().getTextContraseña().getText().equals(this.loginView.getRegistroView().getTextRepiteContraseña().getText())){
                        usuariosDAO.insert(new Usuarios(this.loginView.getRegistroView().getTextNombre().getText(), this.loginView.getRegistroView().getTextContraseña().getText(), this.loginView.getRegistroView().getComboListaPaises().getSelectedItem().toString()));
                        JOptionPane.showMessageDialog(null, "Usuario insertado");
                    }else{
                        JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                        this.loginView.getRegistroView().getTextContraseña().requestFocus();
                        this.loginView.getRegistroView().getTextRepiteContraseña().setText("");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El usuario esta vacio");
                    this.loginView.getRegistroView().getTextNombre().requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ya existe");
                this.loginView.getRegistroView().getTextNombre().requestFocus();
            }
        }

    }

}
