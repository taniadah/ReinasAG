/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reinasag;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*;
import java.io.*;
/**
 *
 * @author tania
 */
public class Interfaz extends javax.swing.JFrame {
    public AlgoritmoEvolutivo aE;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setBounds(0,0,586,685);
        this.setLocationRelativeTo(null);

        //this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        btnInicia = new javax.swing.JButton();
        lblNumR = new javax.swing.JLabel();
        jtfNumR = new javax.swing.JTextField();
        jtaElMejor = new java.awt.TextArea();
        lblNumGen = new javax.swing.JLabel();
        jtfNumGen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfPob = new javax.swing.JTextField();
        btnLimpia = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.setBackground(new java.awt.Color(0, 0, 0));
        p1.setPreferredSize(new java.awt.Dimension(570, 70));

        btnInicia.setText("Inicia");
        btnInicia.setEnabled(false);
        btnInicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciaActionPerformed(evt);
            }
        });

        lblNumR.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        lblNumR.setForeground(new java.awt.Color(255, 255, 255));
        lblNumR.setText("Numero de reinas:");

        jtfNumR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNumRKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumRKeyTyped(evt);
            }
        });

        jtaElMejor.setEditable(false);

        lblNumGen.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        lblNumGen.setForeground(new java.awt.Color(255, 255, 255));
        lblNumGen.setText("Numero de generaciones: ");

        jtfNumGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumGenActionPerformed(evt);
            }
        });
        jtfNumGen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNumGenKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumGenKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Poblacion:");

        jtfPob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPobKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPobKeyTyped(evt);
            }
        });

        btnLimpia.setText("Limpia");
        btnLimpia.setActionCommand("Limpia");
        btnLimpia.setEnabled(false);
        btnLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(lblNumR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNumR))
                    .addComponent(lblNumGen))
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNumGen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpia))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btnInicia)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtaElMejor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtaElMejor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumR)
                    .addComponent(jtfNumR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jtfPob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumGen)
                    .addComponent(jtfNumGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p2.setBackground(new java.awt.Color(153, 153, 153));
        p2.setMinimumSize(new java.awt.Dimension(570, 570));

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNumRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumRKeyReleased
        // TODO add your handling code here:
        boolean ver = false;
        if(jtfNumR.getText().equals("")|| jtfNumGen.getText().equals("")|| jtfPob.getText().equals("")){
            ver = false;
        }else{
            ver = true;
        }
        btnInicia.setEnabled(ver);
        btnLimpia.setEnabled(ver);
    }//GEN-LAST:event_jtfNumRKeyReleased

    private void btnIniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciaActionPerformed
        // TODO add your handling code here:
      int tam = Integer.parseInt(jtfPob.getText());     
      int nGen = Integer.parseInt(jtfNumGen.getText());
      if(tam==0 || nGen==0){
       JOptionPane.showMessageDialog(null, "el tama??o de la poblaci??n y el numero de generaciones no pueden ser 0", "Error", JOptionPane.ERROR_MESSAGE);
      }else{
        //jtfTamPob.setEnabled(false);
        btnInicia.setEnabled(false);
        btnLimpia.setEnabled(false);
        int numR = Integer.parseInt(jtfNumR.getText());
        //String cad = jtfCadena.getText();
        //jtfCadena.setEnabled(false);
        //jtfGeneraciones.setEnabled(true);
        jtfNumR.setEnabled(false);
        btnInicia.setEnabled(false);

        aE = new AlgoritmoEvolutivo(tam, numR, nGen);
        aE.inicializa();
      }
    }//GEN-LAST:event_btnIniciaActionPerformed

    private void jtfNumGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumGenActionPerformed

    private void jtfNumGenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumGenKeyReleased
        // TODO add your handling code here:
                boolean ver = false;
        if(jtfNumR.getText().equals("")|| jtfNumGen.getText().equals("")|| jtfPob.getText().equals("")){
            ver = false;
        }else{
            ver = true;
        }
        btnInicia.setEnabled(ver);
        btnLimpia.setEnabled(ver);
    }//GEN-LAST:event_jtfNumGenKeyReleased

    private void jtfPobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPobKeyReleased
        // TODO add your handling code here:
                boolean ver = false;
        if(jtfNumR.getText().equals("")|| jtfNumGen.getText().equals("")|| jtfPob.getText().equals("")){
            ver = false;
        }else{
            ver = true;
        }
        btnInicia.setEnabled(ver);
        btnLimpia.setEnabled(ver);
    }//GEN-LAST:event_jtfPobKeyReleased

    private void jtfNumRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumRKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (Character.isDigit(c) && jtfNumR.getText().startsWith("0"))) {
            evt.consume();
        }
        if(c == '.' &&  jtfNumR.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_jtfNumRKeyTyped

    private void jtfNumGenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumGenKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (Character.isDigit(c) && jtfNumGen.getText().startsWith("0"))) {
            evt.consume();
        }
        if(c == '.' &&  jtfNumGen.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_jtfNumGenKeyTyped

    private void jtfPobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPobKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (Character.isDigit(c) && jtfPob.getText().startsWith("0"))) {
            evt.consume();
        }
        if(c == '.' &&  jtfPob.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_jtfPobKeyTyped

    private void btnLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaActionPerformed
        // TODO add your handling code here:
        btnInicia.setEnabled(false);
        jtfNumGen.setEnabled(true);
        jtfNumGen.setText("");
        jtfPob.setEnabled(true);
        jtfPob.setText("");
        jtfNumR.setEnabled(true);
        jtfNumR.setText("");
        jtaElMejor.setText("");
        jtfNumR.setText("");
        Graphics g = p2.getGraphics();        
        Graphics2D g2 = (Graphics2D) g;
        //g2.paint();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);       
        
        //g2.setBackground(new Color(153,153,153));
        
        g2.setColor(new Color(153,153,153));
        g2.fillRect(0, 0, p2.getWidth(), p2.getWidth());
    }//GEN-LAST:event_btnLimpiaActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicia;
    public static javax.swing.JButton btnLimpia;
    private javax.swing.JLabel jLabel1;
    public static java.awt.TextArea jtaElMejor;
    private javax.swing.JTextField jtfNumGen;
    private javax.swing.JTextField jtfNumR;
    private javax.swing.JTextField jtfPob;
    private javax.swing.JLabel lblNumGen;
    private javax.swing.JLabel lblNumR;
    private javax.swing.JPanel p1;
    public static javax.swing.JPanel p2;
    // End of variables declaration//GEN-END:variables
}
