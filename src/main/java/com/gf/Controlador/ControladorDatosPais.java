/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.Controlador;

import com.gf.DAO.VacunaDAO;
import com.gf.vista.DatosPais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author examen
 * @since 14-06-2021
 * @version 1.0
 */
public class ControladorDatosPais implements ActionListener{
        
    private DatosPais datosPaisView;    
    private VacunaDAO vacunaDAO;

    public ControladorDatosPais(DatosPais datosPaisView, VacunaDAO vacunaDAO) {
        this.datosPaisView = datosPaisView;
        this.vacunaDAO=vacunaDAO;
        this.datosPaisView.getjTable1().setModel(getModeloTabla());
    }
    
    /*
    *   @return datosPaisView
    */
    public DatosPais getDatosPaisView() {
        return datosPaisView;
    }
    
    /*
    * Set datosPaisView
    */
    public void setDatosPaisView(DatosPais datosPaisView) {
        this.datosPaisView = datosPaisView;
    }
   
    
    /*
    * @return DefaultTableModel
    */
    private DefaultTableModel getModeloTabla(){
        DefaultTableModel modelo=new DefaultTableModel(vacunaDAO.getDatos(), vacunaDAO.getColumnas());
        return modelo;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
