/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

// ARREGLAR LA SELECCION DE SEXO Y QUE APAREZCA SOLAMENTE CUANDO SE APALSTE PERSONALIZADO Y NO ELEGIR MAS DE UNO
import SQL.Usuario;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class frmRegistro extends javax.swing.JFrame {

    Usuario us = new Usuario();
    
    public frmRegistro() {
        initComponents();
        txtEscribirG.setVisible(false);
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        fondo = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblPrimerNombre = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        lblSegundoNombre = new javax.swing.JLabel();
        txtSegundoNombre = new javax.swing.JTextField();
        lblPrimerApellido = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        lblSegundoApellido = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblFlecha = new javax.swing.JLabel();
        lblRegistroUsuario = new javax.swing.JLabel();
        lblRegistrarse = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        rbtMujer = new javax.swing.JRadioButton();
        rbtHombre = new javax.swing.JRadioButton();
        Personalizado = new javax.swing.JRadioButton();
        txtEscribirG = new javax.swing.JTextField();
        cmbDia = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();
        cmbAnio = new javax.swing.JComboBox<>();

        jTextField3.setPreferredSize(new java.awt.Dimension(150, 20));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setPreferredSize(new java.awt.Dimension(630, 360));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCedula.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblCedula.setText("Cédula: ");
        fondo.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 76, -1, -1));

        txtCedula.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        txtCedula.setPreferredSize(new java.awt.Dimension(150, 30));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        fondo.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        lblPrimerNombre.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblPrimerNombre.setText("Primer Nombre:");
        fondo.add(lblPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 116, -1, -1));

        txtPrimerNombre.setPreferredSize(new java.awt.Dimension(150, 30));
        txtPrimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerNombreActionPerformed(evt);
            }
        });
        fondo.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        lblSegundoNombre.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblSegundoNombre.setText("Segundo Nombre:");
        fondo.add(lblSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 156, -1, -1));

        txtSegundoNombre.setPreferredSize(new java.awt.Dimension(150, 30));
        txtSegundoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoNombreActionPerformed(evt);
            }
        });
        fondo.add(txtSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        lblPrimerApellido.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblPrimerApellido.setText("Primer Apellido:");
        fondo.add(lblPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 196, -1, -1));

        txtPrimerApellido.setPreferredSize(new java.awt.Dimension(150, 30));
        txtPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerApellidoActionPerformed(evt);
            }
        });
        fondo.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        lblSegundoApellido.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblSegundoApellido.setText("Segundo Apellido:");
        fondo.add(lblSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 236, -1, -1));

        txtSegundoApellido.setPreferredSize(new java.awt.Dimension(150, 30));
        txtSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoApellidoActionPerformed(evt);
            }
        });
        fondo.add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblTelefono.setText("Telefono:");
        fondo.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 276, -1, -1));

        txtTelefono1.setPreferredSize(new java.awt.Dimension(150, 30));
        txtTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono1ActionPerformed(evt);
            }
        });
        fondo.add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        lblSexo.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblSexo.setText("Sexo:");
        fondo.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, 20));

        lblEstadoCivil.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblEstadoCivil.setText("Estado Civil:");
        fondo.add(lblEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 156, -1, -1));

        lblFechaNacimiento.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblFechaNacimiento.setText("Fecha de nacimiento:");
        fondo.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 196, -1, -1));

        lblDia.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblDia.setText("Dia:");
        fondo.add(lblDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        lblMes.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblMes.setText("Mes:");
        fondo.add(lblMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        lblAnio.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblAnio.setText("Año:");
        fondo.add(lblAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblDireccion.setText("Direccion:");
        fondo.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 276, -1, -1));

        txtDireccion.setPreferredSize(new java.awt.Dimension(150, 30));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        fondo.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 200, -1));

        lblFlecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-izquierda-círculo-60.png"))); // NOI18N
        lblFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFlecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFlechaMouseClicked(evt);
            }
        });
        fondo.add(lblFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        lblRegistroUsuario.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        lblRegistroUsuario.setText("Registro de Usuario");
        fondo.add(lblRegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        lblRegistrarse.setText("Registrarse");
        lblRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblRegistrarseActionPerformed(evt);
            }
        });
        fondo.add(lblRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorciado", "Viudo" }));
        fondo.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 110, -1));

        rbtMujer.setText("Mujer");
        rbtMujer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtMujerMouseClicked(evt);
            }
        });
        rbtMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMujerActionPerformed(evt);
            }
        });
        fondo.add(rbtMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 70, -1));

        rbtHombre.setText("Hombre");
        rbtHombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtHombreMouseClicked(evt);
            }
        });
        fondo.add(rbtHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        Personalizado.setText("Personalizado");
        Personalizado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PersonalizadoMouseClicked(evt);
            }
        });
        Personalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonalizadoActionPerformed(evt);
            }
        });
        fondo.add(Personalizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        txtEscribirG.setToolTipText("Genero (Opcional)");
        txtEscribirG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEscribirGActionPerformed(evt);
            }
        });
        fondo.add(txtEscribirG, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 260, -1));

        cmbDia.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        fondo.add(cmbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 60, 20));

        cmbMes.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        fondo.add(cmbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        cmbAnio.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        cmbAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930" }));
        fondo.add(cmbAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 700, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtPrimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerNombreActionPerformed

    private void txtSegundoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundoNombreActionPerformed

    private void txtPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerApellidoActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundoApellidoActionPerformed

    private void txtTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono1ActionPerformed

    private void lblRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblRegistrarseActionPerformed
      int conf = us.registro(txtPrimerNombre, txtSegundoNombre, txtPrimerApellido, txtSegundoApellido,txtTelefono1,txtCedula,txtDireccion);
      us.almacenarBase(conf);
      if (conf == 7) {
        this.setVisible(false); 
        mdiUsuario menuuser = new mdiUsuario ();
        menuuser.setVisible(true);
      }
// TODO add your handling code here:
    }//GEN-LAST:event_lblRegistrarseActionPerformed

    private void lblFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFlechaMouseClicked
        this.setVisible(false);
        frmUsuario user = new frmUsuario();
        user.setVisible(true);
    }//GEN-LAST:event_lblFlechaMouseClicked

    private void rbtMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtMujerActionPerformed

    private void txtEscribirGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEscribirGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEscribirGActionPerformed

    private void PersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonalizadoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_PersonalizadoActionPerformed

    private void PersonalizadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonalizadoMouseClicked
        rbtMujer.setSelected(false);
        rbtHombre.setSelected(false);
        txtEscribirG.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_PersonalizadoMouseClicked

    private void rbtHombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtHombreMouseClicked
        txtEscribirG.setVisible(false);
        Personalizado.setSelected(false);
        rbtMujer.setSelected(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtHombreMouseClicked

    private void rbtMujerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtMujerMouseClicked
        txtEscribirG.setVisible(false);
        rbtHombre.setSelected(false);
        Personalizado.setSelected(false);// TODO add your handling code here:

    }//GEN-LAST:event_rbtMujerMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
////        FlatLightLaf.setup();
////        UIManager.put("Button.arc", 999);
////        UIManager.put("Component.arc", 999);
////        UIManager.put("ProgressBar.arc", 999);
////        UIManager.put("TextComponent.arc", 999);
////        
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmRegistro().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton Personalizado;
    private javax.swing.JComboBox<String> cmbAnio;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbMes;
    public static javax.swing.JPanel fondo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblFlecha;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblPrimerApellido;
    private javax.swing.JLabel lblPrimerNombre;
    private javax.swing.JToggleButton lblRegistrarse;
    private javax.swing.JLabel lblRegistroUsuario;
    private javax.swing.JLabel lblSegundoApellido;
    private javax.swing.JLabel lblSegundoNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JRadioButton rbtHombre;
    private javax.swing.JRadioButton rbtMujer;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtEscribirG;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtTelefono1;
    // End of variables declaration//GEN-END:variables
}
