/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.DAO;

import com.gf.Conexion.Conexion;
import com.gf.Modelo.Pais;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class PaisDAO {
     public int insert(Pais pais) {
        String sql = "Insert into pais values (?,?,?,?)";
        int filasAfectadas = 0;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {
            ps.setDouble(1, pais.getCapitalInvertido());
            ps.setString(2, pais.getNombre());
            ps.setInt(3, pais.getNumHabitantes());
            ps.setInt(4, pais.getCodigo());
            
            
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return filasAfectadas;
    }

    public int delete(Pais pais) {
        String sql = "delete from pais where cod_pais=?";
        int filasAfectadas = 0;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {
            ps.setInt(1, pais.getCodigo());
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return filasAfectadas;
    }

    public int update(Pais pais) {
        String sql = "update pais set capital_invertido=?, nombre=?, n_habitantes=? where cod_pais=?";
        int filasAfectadas = 0;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {

            ps.setDouble(1, pais.getCapitalInvertido());
            ps.setString(2, pais.getNombre());
            ps.setDouble(3, pais.getNumHabitantes());
            ps.setDouble(4, pais.getCodigo());
           
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return filasAfectadas;
    }

    public Pais get(Integer codigo) {
        String sql = "select * from pais where cod_pais=?";
        Pais pais = null;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pais = new Pais(rs.getString(2), rs.getDouble(1), rs.getInt(4), rs.getInt(3));
                
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return pais;
    }

    public ArrayList<Pais> getAll() {
        String sql = "select * from pais";
        ArrayList<Pais> lista = new ArrayList<>();
        try (Statement st = Conexion.abrirConexion().createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lista.add(new Pais(rs.getString(2), rs.getDouble(1), rs.getInt(4), rs.getInt(3)));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return lista;
    }
}
