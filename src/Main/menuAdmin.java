package Main;

import javax.swing.JOptionPane;

public class menuAdmin extends javax.swing.JFrame {

    public menuAdmin() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu = new javax.swing.JPanel();
        jCerrarVentana = new javax.swing.JLabel();
        jMinimizarVentana = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jFondoCuadrado = new javax.swing.JLabel();
        jFondoCuadrado1 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JButton();
        fondo2 = new javax.swing.JButton();
        jVolverMenu = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fondo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu.setBackground(new java.awt.Color(204, 0, 0));
        jMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jMenu.setForeground(new java.awt.Color(204, 0, 0));
        jMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCerrarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-cerrar-ventana-50.png"))); // NOI18N
        jCerrarVentana.setToolTipText("Cerrar ventana.");
        jCerrarVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCerrarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCerrarVentanaMouseClicked(evt);
            }
        });
        jMenu.add(jCerrarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        jMinimizarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-minimizar-la-ventana-50.png"))); // NOI18N
        jMinimizarVentana.setToolTipText("Minimizar ventana");
        jMinimizarVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMinimizarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinimizarVentanaMouseClicked(evt);
            }
        });
        jMenu.add(jMinimizarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        jLabel19.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ADMIN_");
        jMenu.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 4, 360, 40));

        getContentPane().add(jMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("MOVIMIENTOS");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 380, 60));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("VALIDAR OPERACION");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 380, 60));

        jFondoCuadrado.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jFondoCuadrado.setForeground(new java.awt.Color(255, 255, 255));
        jFondoCuadrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFondoCuadrado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jFondoCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 400, 80));

        jFondoCuadrado1.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jFondoCuadrado1.setForeground(new java.awt.Color(255, 255, 255));
        jFondoCuadrado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFondoCuadrado1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jFondoCuadrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 400, 80));

        fondo1.setBackground(new java.awt.Color(204, 0, 0));
        fondo1.setForeground(new java.awt.Color(204, 0, 0));
        fondo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo1.setBorderPainted(false);
        fondo1.setEnabled(false);
        jPanel1.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 420, 100));

        fondo2.setBackground(new java.awt.Color(204, 0, 0));
        fondo2.setForeground(new java.awt.Color(204, 0, 0));
        fondo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo2.setBorderPainted(false);
        fondo2.setEnabled(false);
        jPanel1.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 420, 100));

        jVolverMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-volver-24.png"))); // NOI18N
        jVolverMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVolverMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVolverMenuMouseClicked(evt);
            }
        });
        jPanel1.add(jVolverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 30, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("VOLVER...");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 70, -1));

        fondo.setBackground(new java.awt.Color(204, 0, 0));
        fondo.setForeground(new java.awt.Color(204, 0, 0));
        fondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo.setBorderPainted(false);
        fondo.setEnabled(false);
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 70, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCerrarVentanaMouseClicked
        int mensaje = JOptionPane.YES_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "¿Desea cerrar sesion?", "Salir", mensaje);
        if (resultado == 0) {
           setVisible(false);
           dispose();
           new menuMainCajero().setVisible(true);
        }
    }//GEN-LAST:event_jCerrarVentanaMouseClicked

    private void jMinimizarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizarVentanaMouseClicked
        setState(menuMainCajero.ICONIFIED);
    }//GEN-LAST:event_jMinimizarVentanaMouseClicked

    private void jVolverMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVolverMenuMouseClicked
        // BOTON VOLVER MENU USUARIO.
        new menuMainCajero().setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jVolverMenuMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fondo;
    private javax.swing.JButton fondo1;
    private javax.swing.JButton fondo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jCerrarVentana;
    private javax.swing.JLabel jFondoCuadrado;
    private javax.swing.JLabel jFondoCuadrado1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jMenu;
    private javax.swing.JLabel jMinimizarVentana;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jVolverMenu;
    // End of variables declaration//GEN-END:variables
}
