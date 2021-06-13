/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dani
 */
public class Conexion {
    private static final String url = "jdbc:mysql://localhost:3306/vacunacovid";
    private static final String user = "root";
    private static final String password = "";
    
    public static Connection abrirConexion() throws SQLException {    
        return DriverManager.getConnection(url, user, password);
    }
}
