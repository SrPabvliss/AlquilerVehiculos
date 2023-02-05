/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import GUI.frmLogin;
import GUI.frmUsuario;
import GUI.mdiUsuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Det-Pc
 */
public class Usuario {

    Conexion conn = new Conexion();
    Connection con = conn.conection();
    int ci;

    public int validarAcceso(String usuario, int passwd) {

        int resultado = 0;
        try {
            String sql = "SELECT * FROM alquiler.cliente WHERE cliente.NOMBRE ='" + usuario + "' AND cliente.CI = " + passwd + ";";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = 1;
            }
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
        }
        return resultado;

    }

    public void completarTabla(JTable tbl, String filtro, String Similitud) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tbl.setModel(modelo);
            tbl.setEnabled(false);
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT MARCA, MODELO, COLOR, MATRICULA, ANO, PRECIO, agencia.NOMBRE, garage.NOMBRE FROM alquiler.coche "
                    + "inner join garage ON coche.ID_GARAGE = garage.ID_GARAGE inner join agencia ON coche.ID_AGENCIA = agencia.ID_AGENCIA where " + filtro + " like '" + Similitud + "%' order by " + filtro + " asc;";

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
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Invitado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void Consultar(JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtDireccion, JTextField txtFechaNacimiento, 
            JTextField txtCedula,JTextField txtEstado,JTextField txtNacionalidad,JTextField txtSexo, int cedula) {
        try {
            ResultSet rs;
            Statement leer = con.createStatement();
            String sql;

            sql = ("SELECT * FROM  cliente WHERE CI = " +cedula+" ;");
            System.out.println("Consulta SQL =" + sql);
            rs = leer.executeQuery(sql);
            rs.next();
            txtNombre.setText(rs.getString(2));
            txtApellido.setText(rs.getString(3));
            txtTelefono.setText(rs.getString(7));
            txtDireccion.setText(rs.getString(6));
            txtFechaNacimiento.setText(rs.getString(8));
            txtCedula.setText(rs.getString(1));
            txtEstado.setText(rs.getString(9));
            txtNacionalidad.setText(rs.getString(10));
            txtSexo.setText(rs.getString(5));
            System.out.println("Consulta exitosa");

        } catch (SQLException ex) {
            System.out.println("Cagaste no se guarda la cedula");
            System.out.println("ex = " + ex);
        }

    }
    
    public void almacenarCedula (int ci){
        this.ci = ci;     
    }
    
    public int DevolverCedula (){
        
    return this.ci;
    }
    


}
