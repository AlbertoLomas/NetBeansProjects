/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author Canales-PC
 */

public class Reserva extends javax.swing.JFrame {

    /**
     * Creates new form Reserva
     */
    FormularioReserva miReserva;
    public Reserva() {
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

        bReserva = new javax.swing.JButton();
        miMenu = new javax.swing.JMenuBar();
        Reserva = new javax.swing.JMenu();
        hacerReserva = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bReserva.setText("Hacer Reserva");
        bReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReservaActionPerformed(evt);
            }
        });

        Reserva.setText("Reserva");

        hacerReserva.setText("Hacer Reserva");
        hacerReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacerReservaActionPerformed(evt);
            }
        });
        Reserva.add(hacerReserva);

        miMenu.add(Reserva);

        setJMenuBar(miMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReservaActionPerformed
        miReserva = new FormularioReserva(this, true);
        miReserva.setVisible(true);
        miReserva.setResizable(false);
    }//GEN-LAST:event_bReservaActionPerformed

    private void hacerReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerReservaActionPerformed
        miReserva = new FormularioReserva(this, true);
        miReserva.setVisible(true);
        miReserva.setResizable(false);
    }//GEN-LAST:event_hacerReservaActionPerformed
    private static void disparoVentana(){
        Reserva r1 = new Reserva();
        r1.setVisible(true);
        r1.setResizable(false);
    }
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
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                disparoVentana();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Reserva;
    private javax.swing.JButton bReserva;
    private javax.swing.JMenuItem hacerReserva;
    private javax.swing.JMenuBar miMenu;
    // End of variables declaration//GEN-END:variables
}
