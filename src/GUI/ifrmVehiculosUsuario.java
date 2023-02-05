/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import SQL.Usuario;

/**
 *
 * @author Det-Pc
 */
public class ifrmVehiculosUsuario extends javax.swing.JInternalFrame {

    Usuario user = new Usuario();
    public ifrmVehiculosUsuario() {
        initComponents();
        user.completarTabla(tblCocheU, "Marca", "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCocheU = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(864, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel1.setText("Vehiculo disponibles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel2.setText("Busqueda personalizada:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setText("Filtrar por");
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 20));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca", "Color", "Precio", "Agencia" }));
        cmbFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFiltroItemStateChanged(evt);
            }
        });
        cmbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltroActionPerformed(evt);
            }
        });
        getContentPane().add(cmbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 120, -1));

        txtFiltro.setBorder(null);
        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        getContentPane().add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 320, 20));

        tblCocheU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Color", "Matricula", "Año", "Precio", "Agencia", "Garage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblCocheU);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 810, 270));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 320, 20));

        jButton1.setText("Reservar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, -1, -1));

        setBounds(60, 120, 864, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiltroItemStateChanged
        String busqueda = (String)cmbFiltro.getSelectedItem();
        if (((String)cmbFiltro.getSelectedItem()).equals("Agencia")) {
            busqueda = "agencia.NOMBRE";
        }
        user.completarTabla(tblCocheU, busqueda, "");
    }//GEN-LAST:event_cmbFiltroItemStateChanged

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        String busqueda = (String)cmbFiltro.getSelectedItem();
        if (((String)cmbFiltro.getSelectedItem()).equals("Agencia")) {
            busqueda = "agencia.NOMBRE";
        }
        user.completarTabla(tblCocheU, busqueda, txtFiltro.getText());
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void cmbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFiltroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblCocheU;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
