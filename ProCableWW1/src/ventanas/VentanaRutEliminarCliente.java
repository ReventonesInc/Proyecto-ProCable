/**
 * Ventana que contiene las opciones para agregar, eliminar, modificar y mostrar clientes.
 * @author GrupoN°14
 */
package ventanas;

import javax.swing.ImageIcon;
import clasesproyecto.listas.ProCable;
import javax.swing.JOptionPane;

public class VentanaRutEliminarCliente extends javax.swing.JFrame {
    
    private ProCable procable;
    /**
     * Crear un nuevo formulario SubMenuCliente
     * Constructor SubMenuCliente
     */
    public VentanaRutEliminarCliente(ProCable procable) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.procable = procable;
        /*Para poder cargar la imagen del icono*/
        this.setIconImage(new ImageIcon(getClass().getResource("/Imágenes/network.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblText = new javax.swing.JLabel();
        jTextRut = new javax.swing.JTextField();
        jbAceptar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 120));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/FondoMoradoMenu.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        if(jTextRut.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Porfavor, ingrese un RUT!");
        }
        else{
            if((this.procable).buscarCliente(jTextRut.getText()) == true){
                VentanaClienteEliminar submenu = new VentanaClienteEliminar(procable,jTextRut.getText());
                submenu.setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "El RUT que ingresó no existe!");
            }
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        OpcionClientes menuClientes = new OpcionClientes(procable);
        menuClientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void lblTextAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblTextAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTextAncestorAdded

    private void jTextRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextRut;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables
}
