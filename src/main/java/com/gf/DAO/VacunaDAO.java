/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.DAO;

import com.gf.Conexion.Conexion;
import com.gf.Modelo.Usuarios;
import com.gf.Modelo.Vacuna;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class VacunaDAO {
    public int insert(Vacuna vacuna) {
        String sql = "Insert into vacuna values (?,?,?)";
        int filasAfectadas = 0;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {
            ps.setString(1, vacuna.getNombre());
            ps.setInt(2, vacuna.getFase());
            ps.setString(3, vacuna.getVariante());
            
            
            
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return filasAfectadas;
    }

    public int delete(Vacuna vacuna) {
        String sql = "delete from vacuna where nombre_vacuna=?";
        int filasAfectadas = 0;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {
            ps.setString(1, vacuna.getNombre());
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return filasAfectadas;
    }

    public int update(Vacuna vacuna) {
        String sql = "update vacuna set variante_covid=?, fase=? where nombre_vacuna=?";
        int filasAfectadas = 0;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {

            ps.setString(1, vacuna.getVariante());
            ps.setInt(2, vacuna.getFase());
            ps.setString(3, vacuna.getNombre());
            
           
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return filasAfectadas;
    }

    public Vacuna get(String nombre) {
        String sql = "select * from vacuna where nombre_vacuna=?";
        Vacuna vacuna = null;
        try (PreparedStatement ps = Conexion.abrirConexion().prepareStatement(sql)) {
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                vacuna = new Vacuna(rs.getString(1), rs.getInt(2), rs.getString(3));
                
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return vacuna;
    }

    public ArrayList<Vacuna> getAll() {
        String sql = "select * from vacuna";
        ArrayList<Vacuna> lista = new ArrayList<>();
        try (Statement st = Conexion.abrirConexion().createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lista.add(new Vacuna(rs.getString(1), rs.getInt(2), rs.getString(3)));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return lista;
    }
    
    public Object[][] getDatos() {
        Object[][] datos = null;
        String sql = "SELECT * FROM vacuna";
        try (Statement st = Conexion.abrirConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            ResultSet rs = st.executeQuery(sql);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.last();
            
            int numColumnas = rsmd.getColumnCount();
            int numFilas = rs.getRow();
            datos = new Object[numFilas][numColumnas];
            
            //Procesamos el resultado
            rs.beforeFirst();
            int i=0; //Indicador de fila de la matriz
            int j=0; //Indicador de columna de la matriz
            
            while(rs.next()){
                for (j=0; j < numColumnas; j++) {
                    datos[i][j]=rs.getObject(j+1);
                }
                i++;
            }
            
            
            return datos;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
        return datos;
    }
    
    public Object[] getColumnas() {
        Object[] titulosColumnas=null;
        String sql = "SELECT * FROM vacuna";
        try (Statement st = Conexion.abrirConexion().createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumnas = rsmd.getColumnCount();
            
            titulosColumnas=new Object[numColumnas];
            
            //Obtenemos los titulos de las columnas
            for (int i = 0; i < numColumnas; i++) {
                titulosColumnas[i]=rsmd.getColumnName(i+1);
            }
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return titulosColumnas;
    }
}
