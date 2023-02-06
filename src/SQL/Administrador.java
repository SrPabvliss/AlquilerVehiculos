/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sebas
 */
public class Administrador {
    
    Conexion conn = new Conexion ();
    Connection con = conn.conection();
    
    
public void agregarVehiculo (){}

public void completarTabla(JTable tbl, String filtro, String Similitud) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tbl.setModel(modelo);
            tbl.setEnabled(false);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = conn.conection();
            
            String sql = "SELECT MARCA, MODELO, COLOR, MATRICULA, ANO, PRECIO, agencia.NOMBRE, garage.NOMBRE FROM alquiler.coche "
                    + "inner join garage ON coche.ID_GARAGE = garage.ID_GARAGE inner join agencia ON coche.ID_AGENCIA = agencia.ID_AGENCIA where "+filtro+" like '" +Similitud+ "%' order by " +filtro+ " asc;";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("Marca");
            modelo.addColumn("Modelo");
            modelo.addColumn("color");
            modelo.addColumn("Matricula");
            modelo.addColumn("Año");
            modelo.addColumn("Precio");
            modelo.addColumn("Agencia");
            modelo.addColumn("Garage");
            
            while (rs.next()) {
                Object [] filas = new Object [cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
                  
        } catch (SQLException ex) {
            Logger.getLogger(Invitado.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
public void completarCliente(JTable tbl, String filtro, String Similitud) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tbl.setModel(modelo);
            tbl.setEnabled(false);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = conn.conection();
            
            String sql = "SELECT CI, NOMBRE, APELLIDO, EDAD, SEXO, DIRECCION, TELEFONO, FECHA_NACIMIENTO, ESTADO_CIVIL, NACIONALIDAD FROM alquiler.cliente "
                    + "where "+filtro+" like '" +Similitud+ "%' order by " +filtro+ " asc;";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("Cedula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Edad");
            modelo.addColumn("Sexo");
            modelo.addColumn("Direccion");
            modelo.addColumn("Telefono");
            modelo.addColumn("Fecha de Nacimiento");
            modelo.addColumn("Estado civil");
            modelo.addColumn("Nacionalidad");
            
            while (rs.next()) {
                Object [] filas = new Object [cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
                  
        } catch (SQLException ex) {
            Logger.getLogger(Invitado.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

}
