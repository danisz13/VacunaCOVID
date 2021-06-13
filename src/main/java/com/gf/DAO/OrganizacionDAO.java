/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.DAO;

import com.gf.Conexion.Conexion;
import com.gf.Modelo.Organizacion;
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
public class OrganizacionDAO {

    public int insert(Organizacion organizacion) {
        String sql = "Insert into organizacion values (?,?,?,?,?,?,?,?,?,?,?)";
        int filasAfectadas = 0;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {
            ps.setString(1, organizacion.getNombre());
            ps.setString(2, organizacion.getNIF());
            ps.setDouble(3, organizacion.getCapitalInvertido());
            ps.setInt(4, organizacion.getNumTrabajadores());
            ps.setInt(5, organizacion.getPrivada());
            ps.setInt(6, organizacion.getCodigo());
            ps.setInt(7, organizacion.getCodPais());
            ps.setString(8, organizacion.getNombreVacuna());
            ps.setDate(9, organizacion.getFechaHoy());
            ps.setInt(10, organizacion.getDosisFabricadas());
            ps.setDate(11, organizacion.getFechaPrevista());
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return filasAfectadas;
    }

    public int delete(Organizacion organizacion) {
        String sql = "delete from organizacion where cod_pais=?";
        int filasAfectadas = 0;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {
            ps.setInt(1, organizacion.getCodigo());
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return filasAfectadas;
    }

    public int update(Organizacion organizacion) {
        String sql = "update organizacion set nombre=?, nif=?, capital_invertido=?, num_trabajadores=?, "
                + "privada=?, cod_pais=?, nombre_vacuna=?, fecha_actual=? dosis_fabricadas=?, fecha_prevista=? where cod_organizacion=?";
        int filasAfectadas = 0;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {

            ps.setString(1, organizacion.getNombre());
            ps.setString(2, organizacion.getNIF());
            ps.setDouble(3, organizacion.getCapitalInvertido());
            ps.setInt(4, organizacion.getNumTrabajadores());
            ps.setInt(5, organizacion.getPrivada());
            ps.setInt(6, organizacion.getCodPais());
            ps.setString(7, organizacion.getNombreVacuna());
            ps.setDate(8, organizacion.getFechaHoy());
            ps.setInt(9, organizacion.getDosisFabricadas());
            ps.setDate(10, organizacion.getFechaPrevista());
            ps.setInt(11, organizacion.getCodigo());
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return filasAfectadas;
    }

    public Organizacion get(Integer codigo) {
        String sql = "select * from organizacion where cod_organizacion=?";
        Organizacion organizacion = null;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                organizacion = new Organizacion(rs.getString(1), rs.getString(2), rs.getDouble(3),
                        rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7),
                        rs.getString(8), rs.getInt(9), rs.getDate(10), rs.getDate(11));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return organizacion;
    }

    public ArrayList<Organizacion> getAll() {
        String sql = "select * from organizacion";
        ArrayList<Organizacion> lista = new ArrayList<>();
        try (Statement st = Conexion.abrirConexion().createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lista.add(new Organizacion(rs.getString(1), rs.getString(2), rs.getDouble(3),
                        rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7),
                        rs.getString(8), rs.getInt(9), rs.getDate(10), rs.getDate(11)));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return lista;
    }
}
