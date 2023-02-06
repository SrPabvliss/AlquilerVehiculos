/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author sebas
 */
public class frmEleccionAdmin extends javax.swing.JFrame {

    /**
     * Creates new form frmEleccionAdmin
     */
    public frmEleccionAdmin() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgencias = new javax.swing.JLabel();
        lblSelecciona = new javax.swing.JLabel();
        lblCoche = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblAgen = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgencias.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        lblAgencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgencias.setText("MENU");
        lblAgencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblSelecciona.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblSelecciona.setText("Selecciona una opción:");

        lblCoche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-configuración-del-administrador-96.png"))); // NOI18N
        lblCoche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCocheMouseClicked(evt);
            }
        });

        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usuario-90.png"))); // NOI18N
        lblCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCliente.setPreferredSize(new java.awt.Dimension(96, 96));
        lblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClienteMouseClicked(evt);
            }
        });

        lblAgen.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        lblAgen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-invitado-masculino-96.png"))); // NOI18N
        lblAgen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgenMouseClicked(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Coche");

        lbl2.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("Cliente");

        lbl3.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("Agencias");

        btnClose.setText("Cerrar");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(lblAgen, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblAgencias, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSelecciona))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnClose)
                .addContainerGap(257, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblAgencias)
                    .addGap(7, 7, 7)
                    .addComponent(lblSelecciona)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAgen, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl1)
                        .addComponent(lbl2)
                        .addComponent(lbl3))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCocheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCocheMouseClicked
        this.setVisible(false);
        mdiAdministradorCoche mde = new mdiAdministradorCoche();
        mde.setVisible(true);
    }//GEN-LAST:event_lblCocheMouseClicked

    private void lblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClienteMouseClicked
        this.setVisible(false);
        mdiAdministradorCliente mdc = new mdiAdministradorCliente();
        mdc.setVisible(true);
    }//GEN-LAST:event_lblClienteMouseClicked

    private void lblAgenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgenMouseClicked
          this.setVisible(false);
        frmAgencia agn = new frmAgencia();
        agn.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_lblAgenMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
      this.setVisible(false);   
      frmLogin logine = new frmLogin();
       logine.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnCloseMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmEleccionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEleccionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEleccionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEleccionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEleccionAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblAgen;
    private javax.swing.JLabel lblAgencias;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCoche;
    private javax.swing.JLabel lblSelecciona;
    // End of variables declaration//GEN-END:variables
}