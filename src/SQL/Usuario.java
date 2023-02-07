/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import GUI.frmLogin;
import GUI.frmUsuario;
import GUI.mdiUsuario;
import java.awt.Color;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

/**
 *
 * @author Det-Pc
 */
public class Usuario {

    Conexion conn = new Conexion();
    Connection con = conn.conection();
    int ci;

    Border border1 = BorderFactory.createLineBorder(Color.RED, 2);
    Border border2 = BorderFactory.createLineBorder(Color.BLACK, 1);

    public int validarAcceso(String usuario, String passwd) {

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

            tbl.setRowSelectionAllowed(true);
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
            JTextField txtCedula, JTextField txtEstado, JTextField txtNacionalidad, JTextField txtSexo, String cedula) {
        try {
            ResultSet rs;
            Statement leer = con.createStatement();
            String sql;

            sql = ("SELECT * FROM  cliente WHERE CI = " + cedula + " ;");
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

    public void almacenarCedula(int ci) {
        this.ci = ci;
    }

    public int DevolverCedula() {

        return this.ci;
    }

    public int registro(JTextField nombre1, JTextField nombre2, JTextField apellido1, JTextField apellido2, JTextField numero, JTextField cedula, JTextField direccion) {
        String comparacion = "^[a-zA-Z\u00E0-\u00FC ]+$";
        String cef = "^[0-9]{10}+$";
        int cont = 0;
        Pattern patron1 = Pattern.compile(comparacion);
        Matcher ma = patron1.matcher(nombre1.getText());
        if (!ma.find()) {
            nombre1.setBorder(border1);
        } else {
            cont++;
            nombre1.setBorder(border2);
        }

        Pattern patron2 = Pattern.compile(comparacion);
        Matcher ma2 = patron2.matcher(nombre2.getText());
        if (!ma2.find()) {
            nombre2.setBorder(border1);
        } else {
            cont++;
            nombre2.setBorder(border2);
        }

        Pattern patron3 = Pattern.compile(comparacion);
        Matcher ma3 = patron3.matcher(apellido1.getText());
        if (!ma3.find()) {
            apellido1.setBorder(border1);

        } else {
            cont++;
            apellido1.setBorder(border2);
        }

        Pattern patron4 = Pattern.compile(comparacion);
        Matcher ma4 = patron4.matcher(apellido2.getText());
        if (!ma4.find()) {
            apellido2.setBorder(border1);
        } else {
            cont++;
            apellido2.setBorder(border2);
        }

        Pattern patron5 = Pattern.compile(cef);
        Matcher ma5 = patron5.matcher(numero.getText());
        if (!ma5.find()) {
            numero.setBorder(border1);
        } else {
            cont++;
            numero.setBorder(border2);
        }

        Pattern patron6 = Pattern.compile(cef);
        Matcher ma6 = patron6.matcher(cedula.getText());
        if (!ma6.find()) {
            cedula.setBorder(border1);
        } else {
            cont++;
            cedula.setBorder(border2);
        }

        Pattern patron7 = Pattern.compile(comparacion);
        Matcher ma7 = patron7.matcher(direccion.getText());
        if (!ma7.find()) {
            direccion.setBorder(border1);
        } else {
            cont++;
            direccion.setBorder(border2);
        }

        return cont;
    }

    public void almacenarBase(int contador) { //Metodo para agregar lo que se tiene del registro a la base de datos

        if (contador == 7) {

            JOptionPane.showMessageDialog(null, "Ha sido registrado con exito");
            System.out.println("Se ha ingresado los datos en la base ");
        } else {
            System.out.println("No se han ingresado los datos en la base");
        }
    }
    
    public void completarInfoCarro(String matricula, JTextField marca, JTextField modelo, JTextField anio, JTextField color, JTextField precio, JTextField placa){
        try {
            ResultSet rs;
            Statement leer = con.createStatement();
            String sql;

            sql = ("SELECT * FROM coche WHERE MATRICULA = '" + matricula + "' ;");
            System.out.println("Consulta SQL =" + sql);
            rs = leer.executeQuery(sql);
            rs.next();
            marca.setText(rs.getString(7));
            modelo.setText(rs.getString(4));
            anio.setText(rs.getString(6));
            color.setText(rs.getString(5));
            precio.setText(rs.getString(8));
            placa.setText(rs.getString(1));
            System.out.println("Consulta exitosa");

        } catch (SQLException ex) {
            System.out.println("Cagaste no se guarda la cedula");
            System.out.println("ex = " + ex);
        }
    }

}
