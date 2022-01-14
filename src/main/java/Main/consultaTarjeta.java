package Main;

import javax.swing.JOptionPane;

public class consultaTarjeta extends javax.swing.JFrame {

    String nombre, apellidos, tarjeta;

    public consultaTarjeta(String nombre, String apellidos, String tarjeta) {
        initComponents();
        setLocationRelativeTo(this);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tarjeta = tarjeta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu = new javax.swing.JPanel();
        jCerrarVentana = new javax.swing.JLabel();
        jMinimizarVentana = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jMenuSaldo = new javax.swing.JPanel();
        Tarjeta = new javax.swing.JLabel();
        nombreTarjeta = new javax.swing.JLabel();
        caducidad = new javax.swing.JLabel();
        caducidad4 = new javax.swing.JLabel();
        nombreApellidos = new javax.swing.JLabel();
        caducidad3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jVolverMenu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        CCV = new javax.swing.JLabel();
        CCV1 = new javax.swing.JLabel();
        fondo5 = new javax.swing.JButton();
        fondo1 = new javax.swing.JButton();
        fondo2 = new javax.swing.JButton();
        fondo4 = new javax.swing.JButton();
        fondo3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

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
        jMenu.add(jCerrarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        jMinimizarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-minimizar-la-ventana-50.png"))); // NOI18N
        jMinimizarVentana.setToolTipText("Minimizar ventana");
        jMinimizarVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMinimizarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinimizarVentanaMouseClicked(evt);
            }
        });
        jMenu.add(jMinimizarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("BANCO ROVAN");
        jMenu.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 4, 360, 40));

        getContentPane().add(jMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        jMenuSaldo.setBackground(new java.awt.Color(255, 255, 255));
        jMenuSaldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jMenuSaldo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tarjeta.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Tarjeta.setForeground(new java.awt.Color(255, 255, 255));
        Tarjeta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tarjeta.setText("XXXX-XXXX-XXXX-XXXX");
        jMenuSaldo.add(Tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 240, 30));

        nombreTarjeta.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        nombreTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        nombreTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreTarjeta.setText("VISA CLASSIC");
        jMenuSaldo.add(nombreTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 240, 30));

        caducidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        caducidad.setForeground(new java.awt.Color(255, 255, 255));
        caducidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caducidad.setText("12/41");
        jMenuSaldo.add(caducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 50, 30));

        caducidad4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        caducidad4.setForeground(new java.awt.Color(255, 255, 255));
        caducidad4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caducidad4.setText("hasta");
        jMenuSaldo.add(caducidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 40, 20));

        nombreApellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nombreApellidos.setForeground(new java.awt.Color(255, 255, 255));
        nombreApellidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreApellidos.setText("NOMBRE APELLIDOS");
        jMenuSaldo.add(nombreApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 190, 30));

        caducidad3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        caducidad3.setForeground(new java.awt.Color(255, 255, 255));
        caducidad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caducidad3.setText("Valido");
        jMenuSaldo.add(caducidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 40, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesTarjeta/icons8-mastercard-50.png"))); // NOI18N
        jMenuSaldo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        jMenuSaldo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jVolverMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesMenuCajero/icons8-volver-50.png"))); // NOI18N
        jVolverMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVolverMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVolverMenuMouseClicked(evt);
            }
        });
        jMenuSaldo.add(jVolverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, -1, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesTarjeta/icons8-visa-50.png"))); // NOI18N
        jMenuSaldo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jLabel21.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jMenuSaldo.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 320, 140));

        CCV.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CCV.setForeground(new java.awt.Color(204, 0, 0));
        CCV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CCV.setText("CCV");
        jMenuSaldo.add(CCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 60, 30));

        CCV1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        CCV1.setForeground(new java.awt.Color(255, 255, 255));
        CCV1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CCV1.setText("El numero de su tarjeta es");
        jMenuSaldo.add(CCV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 200, 20));

        fondo5.setBackground(new java.awt.Color(255, 255, 255));
        fondo5.setForeground(new java.awt.Color(255, 255, 255));
        fondo5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 5, true));
        fondo5.setBorderPainted(false);
        fondo5.setEnabled(false);
        jMenuSaldo.add(fondo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 60, 30));

        fondo1.setBackground(new java.awt.Color(204, 0, 0));
        fondo1.setForeground(new java.awt.Color(204, 0, 0));
        fondo1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 5, true));
        fondo1.setBorderPainted(false);
        fondo1.setEnabled(false);
        jMenuSaldo.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 340, 160));

        fondo2.setBackground(new java.awt.Color(153, 0, 0));
        fondo2.setForeground(new java.awt.Color(153, 0, 0));
        fondo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 5, true));
        fondo2.setBorderPainted(false);
        fondo2.setEnabled(false);
        jMenuSaldo.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 340, 40));

        fondo4.setBackground(new java.awt.Color(255, 255, 255));
        fondo4.setForeground(new java.awt.Color(255, 255, 255));
        fondo4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 5, true));
        fondo4.setBorderPainted(false);
        fondo4.setEnabled(false);
        jMenuSaldo.add(fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 200, 30));

        fondo3.setBackground(new java.awt.Color(204, 0, 0));
        fondo3.setForeground(new java.awt.Color(204, 0, 0));
        fondo3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 5, true));
        fondo3.setBorderPainted(false);
        fondo3.setEnabled(false);
        jMenuSaldo.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 340, 160));

        jLabel7.setBackground(new java.awt.Color(141, 108, 159));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("La información de su tarjeta es");
        jMenuSaldo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 420, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("VOLVER...");
        jMenuSaldo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, 60, -1));

        getContentPane().add(jMenuSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCerrarVentanaMouseClicked
        int mensaje = JOptionPane.YES_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "¿Desea cerrar la ventana?", "Salir", mensaje);
        if (resultado == 0) {
            new menuUsuario(nombre, apellidos, tarjeta).setVisible(true);
            dispose();
            //new menuUsuario().setVisible(true);
        }
    }//GEN-LAST:event_jCerrarVentanaMouseClicked

    private void jMinimizarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizarVentanaMouseClicked
        setState(menuMainCajero.ICONIFIED);
    }//GEN-LAST:event_jMinimizarVentanaMouseClicked

    private void jVolverMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVolverMenuMouseClicked
        // BOTON VOLVER MENU USUARIO.
        new menuUsuario(nombre, apellidos, tarjeta).setVisible(true);
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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(consultaTarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaTarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaTarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaTarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CCV;
    private javax.swing.JLabel CCV1;
    private javax.swing.JLabel Tarjeta;
    private javax.swing.JLabel caducidad;
    private javax.swing.JLabel caducidad3;
    private javax.swing.JLabel caducidad4;
    private javax.swing.JButton fondo1;
    private javax.swing.JButton fondo2;
    private javax.swing.JButton fondo3;
    private javax.swing.JButton fondo4;
    private javax.swing.JButton fondo5;
    private javax.swing.JLabel jCerrarVentana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jMenu;
    private javax.swing.JPanel jMenuSaldo;
    private javax.swing.JLabel jMinimizarVentana;
    private javax.swing.JLabel jVolverMenu;
    private javax.swing.JLabel nombreApellidos;
    private javax.swing.JLabel nombreTarjeta;
    // End of variables declaration//GEN-END:variables
}
