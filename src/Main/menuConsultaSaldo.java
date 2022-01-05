package Main;

import javax.swing.JOptionPane;

public class menuConsultaSaldo extends javax.swing.JFrame {

    public menuConsultaSaldo() {
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
        jMenuSaldo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tarjeta = new javax.swing.JLabel();
        ultimaConexion = new javax.swing.JLabel();
        Saldo = new javax.swing.JLabel();
        Euro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jFondoCuadrado = new javax.swing.JLabel();
        fondo1 = new javax.swing.JButton();

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
        jLabel19.setText("NOMBRE EMPRESA");
        jMenu.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 4, 360, 40));

        getContentPane().add(jMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        jMenuSaldo.setBackground(new java.awt.Color(255, 255, 255));
        jMenuSaldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jMenuSaldo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EL SALDO ACTUAL DE SU CUENTA");
        jMenuSaldo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, 40));

        Tarjeta.setForeground(new java.awt.Color(153, 153, 153));
        Tarjeta.setText("TARJETA XXXX-XXXX-XXXX-XXXX");
        jMenuSaldo.add(Tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        ultimaConexion.setForeground(new java.awt.Color(153, 153, 153));
        ultimaConexion.setText("Ultima conexión <FECHA><HORA>");
        jMenuSaldo.add(ultimaConexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        Saldo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Saldo.setForeground(new java.awt.Color(255, 255, 255));
        Saldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Saldo.setText("1000,00");
        jMenuSaldo.add(Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 210, 50));

        Euro.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Euro.setForeground(new java.awt.Color(255, 255, 255));
        Euro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Euro.setText("€");
        jMenuSaldo.add(Euro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 60, 50));
        jMenuSaldo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 270, 20));

        jFondoCuadrado.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jFondoCuadrado.setForeground(new java.awt.Color(255, 255, 255));
        jFondoCuadrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFondoCuadrado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jMenuSaldo.add(jFondoCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 400, 140));

        fondo1.setBackground(new java.awt.Color(204, 0, 0));
        fondo1.setForeground(new java.awt.Color(204, 0, 0));
        fondo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo1.setBorderPainted(false);
        fondo1.setEnabled(false);
        jMenuSaldo.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 420, 160));

        getContentPane().add(jMenuSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCerrarVentanaMouseClicked
        int mensaje = JOptionPane.YES_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "¿Desea cerrar sesion?", "Salir", mensaje);
        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jCerrarVentanaMouseClicked

    private void jMinimizarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizarVentanaMouseClicked
        setState(menuMainCajero.ICONIFIED);
    }//GEN-LAST:event_jMinimizarVentanaMouseClicked

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
                if ("wINDOWS".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuConsultaSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuConsultaSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuConsultaSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuConsultaSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuConsultaSaldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Euro;
    private javax.swing.JLabel Saldo;
    private javax.swing.JLabel Tarjeta;
    private javax.swing.JButton fondo1;
    private javax.swing.JLabel jCerrarVentana;
    private javax.swing.JLabel jFondoCuadrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jMenu;
    private javax.swing.JPanel jMenuSaldo;
    private javax.swing.JLabel jMinimizarVentana;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel ultimaConexion;
    // End of variables declaration//GEN-END:variables
}