/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.DAO;

import com.gf.Conexion.Conexion;
import com.gf.Modelo.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author GRUPO5
 * @since 14-06-2021
 * @version 1.0
 */
public class UsuariosDAO {
    
    /*
    *Insertar un nuevo Usuario
    */
    public int insert(Usuarios usuario) {
        String sql = "Insert into registrados values (?,?,?)";
        int filasAfectadas = 0;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getContrasena());
            ps.setString(3, usuario.getPais());
            
            
            
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return filasAfectadas;
    }
    
    /*
    *Borrar un Usuario
    */
    public int delete(Usuarios usuario) {
        String sql = "delete from registrados where nombre_usuario=?";
        int filasAfectadas = 0;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {
            ps.setString(1, usuario.getNombre());
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return filasAfectadas;
    }
    
    /*
    *Actualizar un Usuario
    */
    public int update(Usuarios usuario) {
        String sql = "update registrados set contrasena=?, pais=? where nombre_usuario=?";
        int filasAfectadas = 0;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {

            ps.setString(1, usuario.getContrasena());
            ps.setString(2, usuario.getPais());
            ps.setString(3, usuario.getNombre());
            
           
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return filasAfectadas;
    }
    
    /*
    *Recuperar un Usuario
    */
    public Usuarios get(String nombre) {
        String sql = "select * from registrados where nombre_usuario=?";
        Usuarios usuario = null;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                usuario = new Usuarios(rs.getString(1), rs.getString(2), rs.getString(3));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
            ex.printStackTrace();
        }
        return usuario;
    }
    
    /*
    *Recuperar todos los Usuarios
    */
    public ArrayList<Usuarios> getAll() {
        String sql = "select * from registrados";
        ArrayList<Usuarios> lista = new ArrayList<>();
        try (Statement st = Conexion.abrirConexion().createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lista.add(new Usuarios(rs.getString(1), rs.getString(2), rs.getString(3)));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return lista;
    }
}
