/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class CrudJoyeriaPrincipal extends javax.swing.JFrame {
    TdaListaDoble tld = new TdaListaDoble();
    int num;
    /**
     * Creates new form CrudJoyeriaPrincipal
     */
    public CrudJoyeriaPrincipal() {
        initComponents();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setTitle("CRUD de joyas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mniAcercaDe = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();
        mnuJoyas = new javax.swing.JMenu();
        mniAlta = new javax.swing.JMenuItem();
        mniConsultaIndividual = new javax.swing.JMenuItem();
        mniConsultaGeneral = new javax.swing.JMenuItem();
        mniModificacion = new javax.swing.JMenuItem();
        mniBaja = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuArchivo.setText("Archivo");

        mniAcercaDe.setText("Acerca de");
        mniAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAcercaDeActionPerformed(evt);
            }
        });
        mnuArchivo.add(mniAcercaDe);

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mniSalir);

        jMenuBar1.add(mnuArchivo);

        mnuJoyas.setText("Joyas");

        mniAlta.setText("Alta");
        mniAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAltaActionPerformed(evt);
            }
        });
        mnuJoyas.add(mniAlta);

        mniConsultaIndividual.setText("ConsultaIndividual");
        mniConsultaIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConsultaIndividualActionPerformed(evt);
            }
        });
        mnuJoyas.add(mniConsultaIndividual);

        mniConsultaGeneral.setText("Consulta general");
        mniConsultaGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConsultaGeneralActionPerformed(evt);
            }
        });
        mnuJoyas.add(mniConsultaGeneral);

        mniModificacion.setText("Modificacion");
        mniModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniModificacionActionPerformed(evt);
            }
        });
        mnuJoyas.add(mniModificacion);

        mniBaja.setText("Baja");
        mniBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBajaActionPerformed(evt);
            }
        });
        mnuJoyas.add(mniBaja);

        jMenuBar1.add(mnuJoyas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAcercaDeActionPerformed
        JOptionPane.showMessageDialog(null, "Programa: CRUD DE OBJECTOS\n"
                + "Version: 1.0\n"
                + "PROGRAMADORES: Morales Prado Erik Rodrigo\n"
                + "Albor Villalobos Geovanni Santiago\n"
                + "Jose Armando Sandoval Santana", "Acerca de....", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mniAcercaDeActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniAltaActionPerformed

    private void mniConsultaIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConsultaIndividualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniConsultaIndividualActionPerformed

    private void mniConsultaGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConsultaGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniConsultaGeneralActionPerformed

    private void mniModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniModificacionActionPerformed
        dlgModificar modificar = new dlgModificar(this, true);
        modificar.setVisible(true);
    }//GEN-LAST:event_mniModificacionActionPerformed

    private void mniBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniBajaActionPerformed

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
            java.util.logging.Logger.getLogger(CrudJoyeriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudJoyeriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudJoyeriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudJoyeriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudJoyeriaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniAcercaDe;
    private javax.swing.JMenuItem mniAlta;
    private javax.swing.JMenuItem mniBaja;
    private javax.swing.JMenuItem mniConsultaGeneral;
    private javax.swing.JMenuItem mniConsultaIndividual;
    private javax.swing.JMenuItem mniModificacion;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuJoyas;
    // End of variables declaration//GEN-END:variables
}
