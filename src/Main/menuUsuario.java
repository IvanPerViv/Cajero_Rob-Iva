package Main;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class menuUsuario extends JFrame {
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    Date date = new Date();
    final String mensaje = "Hora actual: ";
    
    public menuUsuario() {
        initComponents();
        setLocationRelativeTo(null);    
        jHoraFecha.setText(mensaje + formatter.format(date));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu = new javax.swing.JPanel();
        jCerrarVentana = new javax.swing.JLabel();
        jMinimizarVentana = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanelUsuario = new javax.swing.JPanel();
        j_RetirarDinero = new javax.swing.JTextField();
        j_IngresarDinero = new javax.swing.JTextField();
        jSacarDinero = new javax.swing.JButton();
        jIngresarDinero = new javax.swing.JButton();
        jUser = new javax.swing.JLabel();
        jHoraFecha = new javax.swing.JLabel();
        jPagosImpuestosDevol = new javax.swing.JLabel();
        jConsultaSaldo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jVolverMenu = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        fondo = new javax.swing.JButton();
        fondo1 = new javax.swing.JButton();
        fondo2 = new javax.swing.JButton();
        fondo3 = new javax.swing.JButton();
        fondo4 = new javax.swing.JButton();

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
        jMenu.add(jCerrarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        jMinimizarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-minimizar-la-ventana-50.png"))); // NOI18N
        jMinimizarVentana.setToolTipText("Minimizar ventana");
        jMinimizarVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMinimizarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinimizarVentanaMouseClicked(evt);
            }
        });
        jMenu.add(jMinimizarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        jLabel19.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("BANCO ROVAN");
        jMenu.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 4, 360, 40));

        getContentPane().add(jMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        jPanelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jPanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j_RetirarDinero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        j_RetirarDinero.setForeground(new java.awt.Color(153, 153, 153));
        j_RetirarDinero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelUsuario.add(j_RetirarDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 160, 50));

        j_IngresarDinero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        j_IngresarDinero.setForeground(new java.awt.Color(153, 153, 153));
        j_IngresarDinero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j_IngresarDinero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelUsuario.add(j_IngresarDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 160, 50));

        jSacarDinero.setBackground(new java.awt.Color(204, 0, 0));
        jSacarDinero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jSacarDinero.setForeground(new java.awt.Color(204, 0, 0));
        jSacarDinero.setText("Retirar dinero");
        jSacarDinero.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jSacarDinero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelUsuario.add(jSacarDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 140, 30));

        jIngresarDinero.setBackground(new java.awt.Color(204, 0, 0));
        jIngresarDinero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jIngresarDinero.setForeground(new java.awt.Color(204, 0, 0));
        jIngresarDinero.setText("Ingresar Dinero");
        jIngresarDinero.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jIngresarDinero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelUsuario.add(jIngresarDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 140, 30));

        jUser.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jUser.setForeground(new java.awt.Color(153, 153, 153));
        jUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jUser.setText("<USER>");
        jPanelUsuario.add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 230, 30));

        jHoraFecha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jHoraFecha.setForeground(new java.awt.Color(153, 153, 153));
        jHoraFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanelUsuario.add(jHoraFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 220, 20));

        jPagosImpuestosDevol.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jPagosImpuestosDevol.setForeground(new java.awt.Color(255, 255, 255));
        jPagosImpuestosDevol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPagosImpuestosDevol.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPagosImpuestosDevol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelUsuario.add(jPagosImpuestosDevol, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 180, 140));

        jConsultaSaldo.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jConsultaSaldo.setForeground(new java.awt.Color(255, 255, 255));
        jConsultaSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jConsultaSaldo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jConsultaSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jConsultaSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jConsultaSaldoMouseClicked(evt);
            }
        });
        jPanelUsuario.add(jConsultaSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 180, 140));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPanelUsuario/icons8-logotipo-mastercard-25.png"))); // NOI18N
        jPanelUsuario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 30, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" €");
        jPanelUsuario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 40, 50));

        jLabel3.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("y devoluciones");
        jPanelUsuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 200, 50));

        jLabel9.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Importe:");
        jPanelUsuario.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 120, 40));

        jLabel10.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("IMPORTE A INGRESAR");
        jPanelUsuario.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 180, 30));

        jLabel7.setBackground(new java.awt.Color(141, 108, 159));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Indique la operación que desea hacer");
        jPanelUsuario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 420, -1));

        jLabel12.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Pagos, impuestos");
        jPanelUsuario.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 200, 50));

        jLabel18.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Importe:");
        jPanelUsuario.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 120, 40));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" €");
        jPanelUsuario.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 40, 50));

        jLabel11.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Consultar saldo");
        jPanelUsuario.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 180, 30));

        jVolverMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-volver-24.png"))); // NOI18N
        jVolverMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVolverMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVolverMenuMouseClicked(evt);
            }
        });
        jPanelUsuario.add(jVolverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 30, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("VOLVER...");
        jPanelUsuario.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 70, -1));

        jLabel20.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("IMPORTE A RETIRAR");
        jPanelUsuario.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 180, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPanelUsuario/icons8-dinero-50 (1).png"))); // NOI18N
        jPanelUsuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesPanelUsuario/icons8-billetera-50 (1).png"))); // NOI18N
        jPanelUsuario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jLabel13.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanelUsuario.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 310, 140));

        jLabel21.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanelUsuario.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 310, 140));

        fondo.setBackground(new java.awt.Color(204, 0, 0));
        fondo.setForeground(new java.awt.Color(204, 0, 0));
        fondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo.setBorderPainted(false);
        fondo.setEnabled(false);
        jPanelUsuario.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 70, 60));

        fondo1.setBackground(new java.awt.Color(204, 0, 0));
        fondo1.setForeground(new java.awt.Color(204, 0, 0));
        fondo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo1.setBorderPainted(false);
        fondo1.setEnabled(false);
        jPanelUsuario.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 330, 160));

        fondo2.setBackground(new java.awt.Color(204, 0, 0));
        fondo2.setForeground(new java.awt.Color(204, 0, 0));
        fondo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo2.setBorderPainted(false);
        fondo2.setEnabled(false);
        jPanelUsuario.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 200, 160));

        fondo3.setBackground(new java.awt.Color(204, 0, 0));
        fondo3.setForeground(new java.awt.Color(204, 0, 0));
        fondo3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo3.setBorderPainted(false);
        fondo3.setEnabled(false);
        jPanelUsuario.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 330, 160));

        fondo4.setBackground(new java.awt.Color(204, 0, 0));
        fondo4.setForeground(new java.awt.Color(204, 0, 0));
        fondo4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo4.setBorderPainted(false);
        fondo4.setEnabled(false);
        jPanelUsuario.add(fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 200, 160));

        getContentPane().add(jPanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCerrarVentanaMouseClicked
        int mensaje = JOptionPane.YES_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "¿Desea cerrar sesion?", "Salir", mensaje);
        if (resultado == 0) {
            this.setVisible(false);
            dispose();
            new menuMainCajero().setVisible(true);
        }
    }//GEN-LAST:event_jCerrarVentanaMouseClicked

    private void jMinimizarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizarVentanaMouseClicked
        setState(menuMainCajero.ICONIFIED);
    }//GEN-LAST:event_jMinimizarVentanaMouseClicked

    private void jConsultaSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jConsultaSaldoMouseClicked
        // BOTON CONSULTA DE SALDO.
        new menuConsultaSaldo().setVisible(true);
        dispose();
    }//GEN-LAST:event_jConsultaSaldoMouseClicked

    private void jVolverMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVolverMenuMouseClicked
        new menuMainCajero().setVisible(true);
        dispose();
    }//GEN-LAST:event_jVolverMenuMouseClicked

    
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
            java.util.logging.Logger.getLogger(menuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fondo;
    private javax.swing.JButton fondo1;
    private javax.swing.JButton fondo2;
    private javax.swing.JButton fondo3;
    private javax.swing.JButton fondo4;
    private javax.swing.JLabel jCerrarVentana;
    private javax.swing.JLabel jConsultaSaldo;
    private javax.swing.JLabel jHoraFecha;
    private javax.swing.JButton jIngresarDinero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jMenu;
    private javax.swing.JLabel jMinimizarVentana;
    private javax.swing.JLabel jPagosImpuestosDevol;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JButton jSacarDinero;
    private javax.swing.JLabel jUser;
    private javax.swing.JLabel jVolverMenu;
    private javax.swing.JTextField j_IngresarDinero;
    private javax.swing.JTextField j_RetirarDinero;
    // End of variables declaration//GEN-END:variables
}
