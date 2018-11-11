/*
 * Ventana que contiene el formulario de clientes suscritos
 * @author GrupoN°14
 */
package ventanas;

import javax.swing.ImageIcon;
import clasesproyecto.listas.*;
import javax.swing.JOptionPane;

public class OpcionClientes extends javax.swing.JFrame {
    private ProCable procable;

    public OpcionClientes(ProCable procable) {
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

        jbSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblWorld1 = new javax.swing.JLabel();
        BtnAgregarCliente = new javax.swing.JButton();
        BtnEliminarCliente = new javax.swing.JButton();
        BtnModificarCliente = new javax.swing.JButton();
        BtnMostrarCliente = new javax.swing.JButton();
        BtnVolverAlMenu = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbSalir.setBackground(new java.awt.Color(102, 0, 102));
        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 70, 50));

        lblTitulo.setFont(new java.awt.Font("Cordia New", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Menú Clientes");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 210, -1));

        lblWorld1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/clients.png"))); // NOI18N
        lblWorld1.setText("jLabel1");
        getContentPane().add(lblWorld1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, 120));

        BtnAgregarCliente.setBackground(new java.awt.Color(102, 0, 102));
        BtnAgregarCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BtnAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregarCliente.setText("Agregar");
        BtnAgregarCliente.setBorder(null);
        BtnAgregarCliente.setContentAreaFilled(false);
        BtnAgregarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAgregarCliente.setOpaque(true);
        BtnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 190, 40));

        BtnEliminarCliente.setBackground(new java.awt.Color(102, 0, 102));
        BtnEliminarCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BtnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarCliente.setText("Eliminar");
        BtnEliminarCliente.setBorder(null);
        BtnEliminarCliente.setContentAreaFilled(false);
        BtnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEliminarCliente.setOpaque(true);
        BtnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 190, 40));

        BtnModificarCliente.setBackground(new java.awt.Color(102, 0, 102));
        BtnModificarCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BtnModificarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificarCliente.setText("Modificar");
        BtnModificarCliente.setBorder(null);
        BtnModificarCliente.setContentAreaFilled(false);
        BtnModificarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnModificarCliente.setOpaque(true);
        getContentPane().add(BtnModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 190, 40));

        BtnMostrarCliente.setBackground(new java.awt.Color(102, 0, 102));
        BtnMostrarCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BtnMostrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnMostrarCliente.setText("Mostrar Lista");
        BtnMostrarCliente.setBorder(null);
        BtnMostrarCliente.setContentAreaFilled(false);
        BtnMostrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMostrarCliente.setOpaque(true);
        BtnMostrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMostrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 190, 40));

        BtnVolverAlMenu.setBackground(new java.awt.Color(102, 0, 102));
        BtnVolverAlMenu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BtnVolverAlMenu.setForeground(new java.awt.Color(255, 255, 255));
        BtnVolverAlMenu.setText("Volver al Inicio");
        BtnVolverAlMenu.setBorder(null);
        BtnVolverAlMenu.setContentAreaFilled(false);
        BtnVolverAlMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVolverAlMenu.setOpaque(true);
        BtnVolverAlMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverAlMenuActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVolverAlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 190, 40));

        lblFondo.setForeground(new java.awt.Color(102, 102, 102));
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/fondoMoradoP.jpg"))); // NOI18N
        lblFondo.setPreferredSize(new java.awt.Dimension(760, 590));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void BtnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarClienteActionPerformed
        
        if((this.procable).clientes.estaVacio()){
            JOptionPane.showMessageDialog(null, "No hay clientes por eliminar!");
        }
        else{
            VentanaRutEliminarCliente ventanarut = new VentanaRutEliminarCliente(procable);
            ventanarut.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_BtnEliminarClienteActionPerformed

    private void BtnMostrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMostrarClienteActionPerformed

    private void BtnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarClienteActionPerformed
        
        if((this.procable).planes.estaVacio()){
            JOptionPane.showMessageDialog(null, "No hay planes registrados, agregue un plan antes de agregar un cliente!");
        }
        else{
            SubVentanaFormularioCliente formulario = new SubVentanaFormularioCliente(procable);
            formulario.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_BtnAgregarClienteActionPerformed

    private void BtnVolverAlMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverAlMenuActionPerformed
        MenuPrincipal principal = new MenuPrincipal(procable);
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnVolverAlMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarCliente;
    private javax.swing.JButton BtnEliminarCliente;
    private javax.swing.JButton BtnModificarCliente;
    private javax.swing.JButton BtnMostrarCliente;
    private javax.swing.JButton BtnVolverAlMenu;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblWorld1;
    // End of variables declaration//GEN-END:variables
}
