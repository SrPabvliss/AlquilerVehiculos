/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Det-Pc
 */
public class frmAgencia extends javax.swing.JFrame {

    /**
     * Creates new form frmAgencia
     */
    public frmAgencia() {
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

        fondo = new javax.swing.JPanel();
        lblAgencias = new javax.swing.JLabel();
        lblSelecciona = new javax.swing.JLabel();
        lblAgenciaNorte = new javax.swing.JLabel();
        lblAgenciaSur = new javax.swing.JLabel();
        lblAgenciaCentro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblFlecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgencias.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        lblAgencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgencias.setText("Agencias");
        lblAgencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fondo.add(lblAgencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        lblSelecciona.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblSelecciona.setText("Selecciona una opción:");
        fondo.add(lblSelecciona, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 60, -1, -1));

        lblAgenciaNorte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgenciaNorte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-configuración-del-administrador-96.png"))); // NOI18N
        lblAgenciaNorte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgenciaNorte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgenciaNorteMouseClicked(evt);
            }
        });
        fondo.add(lblAgenciaNorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 93, 112, 116));

        lblAgenciaSur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgenciaSur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usuario-90.png"))); // NOI18N
        lblAgenciaSur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgenciaSur.setPreferredSize(new java.awt.Dimension(96, 96));
        lblAgenciaSur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgenciaSurMouseClicked(evt);
            }
        });
        fondo.add(lblAgenciaSur, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 93, 113, 116));

        lblAgenciaCentro.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        lblAgenciaCentro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgenciaCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-invitado-masculino-96.png"))); // NOI18N
        lblAgenciaCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgenciaCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgenciaCentroMouseClicked(evt);
            }
        });
        fondo.add(lblAgenciaCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 93, 113, 116));

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agencia Norte");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 221, 112, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Agencia Sur");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 221, 113, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Agencia centro");
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 221, 113, -1));

        lblFlecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-izquierda-círculo-60.png"))); // NOI18N
        lblFlecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFlecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFlechaMouseClicked(evt);
            }
        });
        fondo.add(lblFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAgenciaNorteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgenciaNorteMouseClicked
        
    }//GEN-LAST:event_lblAgenciaNorteMouseClicked

    private void lblAgenciaSurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgenciaSurMouseClicked
        
    }//GEN-LAST:event_lblAgenciaSurMouseClicked

    private void lblFlechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFlechaMouseClicked
        this.setVisible(false);
        frmEleccionAdmin ad = new frmEleccionAdmin();
        ad.setVisible(true);
    }//GEN-LAST:event_lblFlechaMouseClicked

    private void lblAgenciaCentroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgenciaCentroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAgenciaCentroMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmAgencia().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAgenciaCentro;
    private javax.swing.JLabel lblAgenciaNorte;
    private javax.swing.JLabel lblAgenciaSur;
    private javax.swing.JLabel lblAgencias;
    private javax.swing.JLabel lblFlecha;
    private javax.swing.JLabel lblSelecciona;
    // End of variables declaration//GEN-END:variables
}
