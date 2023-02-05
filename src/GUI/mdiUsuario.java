/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package GUI;

/**
 *
 * @author sebas
 */
public class mdiUsuario extends javax.swing.JFrame {

    /**
     * Creates new form mdiUsuario
     */
    public mdiUsuario() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();
        cuenta = new javax.swing.JMenu();
        mnuCerrarSesion1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Escritorio.setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        menuBar.setPreferredSize(new java.awt.Dimension(300, 40));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Consulta");
        fileMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fileMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fileMenu.setMinimumSize(new java.awt.Dimension(70, 22));
        fileMenu.setPreferredSize(new java.awt.Dimension(70, 22));
        fileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileMenuMouseClicked(evt);
            }
        });
        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Reservas");
        editMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editMenu.setPreferredSize(new java.awt.Dimension(70, 22));
        menuBar.add(editMenu);

        cuenta.setMnemonic('h');
        cuenta.setText("Cuenta");
        cuenta.setAutoscrolls(true);
        cuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cuenta.setDelay(130);
        cuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cuenta.setPreferredSize(new java.awt.Dimension(70, 32));
        cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuentaMouseClicked(evt);
            }
        });
        menuBar.add(cuenta);

        mnuCerrarSesion1.setText("Cerrar sesion");
        mnuCerrarSesion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuCerrarSesion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnuCerrarSesion1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnuCerrarSesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCerrarSesion1MouseClicked(evt);
            }
        });
        menuBar.add(mnuCerrarSesion1);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCerrarSesion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCerrarSesion1MouseClicked
        this.setVisible(false);
        frmLogin login = new frmLogin();
        login.setVisible(true);
    }//GEN-LAST:event_mnuCerrarSesion1MouseClicked

    private void fileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMenuMouseClicked
        ifrmVehiculosUsuario vehiculo = new ifrmVehiculosUsuario();
        Escritorio.add(vehiculo);
        vehiculo.show();
        vehiculo.toFront();
    }//GEN-LAST:event_fileMenuMouseClicked

    private void cuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuentaMouseClicked
        ifrmCuentaUsuario info = new ifrmCuentaUsuario();
        Escritorio.add(info);
        info.show();
        info.toFront();      
    }//GEN-LAST:event_cuentaMouseClicked

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
            java.util.logging.Logger.getLogger(mdiUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mdiUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mdiUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mdiUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mdiUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu cuenta;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuCerrarSesion1;
    // End of variables declaration//GEN-END:variables

}
