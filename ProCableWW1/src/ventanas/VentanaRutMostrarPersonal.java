/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clasesproyecto.listas.ProCable;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author XavierKrostya
 */
public class VentanaRutMostrarPersonal extends javax.swing.JFrame {
    
    private ProCable procable;
    /**
     * Creates new form VentanaRutMostrarPersonal
     */
    public VentanaRutMostrarPersonal(ProCable procable) {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.procable = procable;
        /*Para poder cargar la imagen del icono*/
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/network.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblText = new javax.swing.JLabel();
        jTextRut = new javax.swing.JTextField();
        jbAceptar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("Ingrese el rut: ");
        lblText.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblTextAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTextRut.setBackground(new java.awt.Color(51, 51, 51));
        jTextRut.setForeground(new java.awt.Color(255, 255, 255));
        jTextRut.setSelectionColor(new java.awt.Color(102, 0, 102));
        jTextRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRutActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 150, -1));

        jbAceptar.setBackground(new java.awt.Color(102, 0, 102));
        jbAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, 30));

        jbSalir.setBackground(new java.awt.Color(102, 0, 102));
        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Cancelar");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTextAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblTextAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTextAncestorAdded

    private void jTextRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRutActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed

        if(jTextRut.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Porfavor, ingrese un RUT!");
        }
        else{
            if(((this.procable).buscarPersonal(jTextRut.getText())) == true){
                VentanaMostrarPersonal submenu = new VentanaMostrarPersonal(procable,jTextRut.getText());
                submenu.setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "El RUT que ingresó no existe!");
            }
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        OpcionPersonal submenu = new OpcionPersonal(procable);
        submenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextRut;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables
}