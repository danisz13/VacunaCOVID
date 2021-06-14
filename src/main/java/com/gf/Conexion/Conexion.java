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
 * @author GRUPO5
 * @since 14-06-2021
 * @version 1.0
 */
public class Conexion {
    /*
    * url de la base de datos
    */
    private static final String url = "jdbc:mysql://localhost:3306/vacunacovid";
    /*
    * usuario de la base de datos
    */
    private static final String user = "root";
    /*
    * contraseña de la base de datos
    */
    private static final String password = "";
    
    /*
    * Metodo para la conaxion a la base de datos
    */
    public static Connection abrirConexion() throws SQLException {    
        return DriverManager.getConnection(url, user, password);
    }
}
