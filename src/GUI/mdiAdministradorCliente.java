/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package GUI;

/**
 *
 * @author sebas
 */
public class mdiAdministradorCliente extends javax.swing.JFrame {

    /**
     * Creates new form mdiAdministradorCliente
     */
    public mdiAdministradorCliente() {
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

        Escritorio1 = new javax.swing.JDesktopPane();
        lblFlecha = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuAgr = new javax.swing.JMenu();
        mnuAct = new javax.swing.JMenu();
        mnuCons = new javax.swing.JMenu();
        mnuCerrarS = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFlecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-izquierda-círculo-60.png"))); // NOI18N
        lblFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFlecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFlechaMouseClicked(evt);
            }
        });
        Escritorio1.add(lblFlecha);
        lblFlecha.setBounds(10, 10, 60, 60);

        menuBar.setPreferredSize(new java.awt.Dimension(400, 40));

        mnuAgr.setMnemonic('f');
        mnuAgr.setText("Agregar");
        mnuAgr.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        mnuAgr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuAgrMouseClicked(evt);
            }
        });
        menuBar.add(mnuAgr);

        mnuAct.setMnemonic('e');
        mnuAct.setText("Modificar");
        mnuAct.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        mnuAct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuActMouseClicked(evt);
            }
        });
        menuBar.add(mnuAct);

        mnuCons.setText("Consultar");
        mnuCons.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        mnuCons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuConsMouseClicked(evt);
            }
        });
        menuBar.add(mnuCons);

        mnuCerrarS.setText("Cerrar Sesion");
        mnuCerrarS.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        mnuCerrarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCerrarSMouseClicked(evt);
            }
        });
        menuBar.add(mnuCerrarS);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFlechaMouseClicked
        this.setVisible(false);
        frmEleccionAdmin ad = new frmEleccionAdmin();
        ad.setVisible(true);
    }//GEN-LAST:event_lblFlechaMouseClicked

    private void mnuAgrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuAgrMouseClicked
       
        ifrmAgregarCliente agregar = new ifrmAgregarCliente();     
       Escritorio1.add(agregar);
       agregar.toFront();
       agregar.show(); // TODO add your handling code here:
    }//GEN-LAST:event_mnuAgrMouseClicked

    private void mnuActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuActMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuActMouseClicked

    private void mnuConsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuConsMouseClicked
       ifrmConsultarCliente   cliente1 = new ifrmConsultarCliente();
        Escritorio1.add(cliente1);
        cliente1.show();
        cliente1.toFront();  // TODO add your handling code here:
    }//GEN-LAST:event_mnuConsMouseClicked

    private void mnuCerrarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCerrarSMouseClicked
        this.setVisible(false);
        frmLogin log = new frmLogin();
        log.setVisible(true);
     // TODO add your handling code here:
    }//GEN-LAST:event_mnuCerrarSMouseClicked

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
            java.util.logging.Logger.getLogger(mdiAdministradorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mdiAdministradorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mdiAdministradorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mdiAdministradorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mdiAdministradorCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio1;
    private javax.swing.JLabel lblFlecha;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuAct;
    private javax.swing.JMenu mnuAgr;
    private javax.swing.JMenu mnuCerrarS;
    private javax.swing.JMenu mnuCons;
    // End of variables declaration//GEN-END:variables

}
