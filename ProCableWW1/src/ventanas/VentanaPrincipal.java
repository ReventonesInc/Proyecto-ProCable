/**
 * Ventana Principal de "ProCable"
 * @author GrupoN°14
 */
package ventanas;

import clasesproyecto.listas.*;
import javax.swing.ImageIcon;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    private ProCable procable;
    /**
     * Crea una nueva ventana principal
     * Constructor ventana Principal
     */
    public VentanaPrincipal(ProCable procable) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.procable = procable;
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/network.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFondoImagen = new javax.swing.JLabel();
        jbConsutar = new javax.swing.JButton();
        jbIngresar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        lblbienvenido = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFondoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/network.png"))); // NOI18N
        getContentPane().add(lblFondoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jbConsutar.setBackground(new java.awt.Color(102, 0, 102));
        jbConsutar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbConsutar.setForeground(new java.awt.Color(255, 255, 255));
        jbConsutar.setText("Consultar Cliente");
        getContentPane().add(jbConsutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 200, 40));

        jbIngresar.setBackground(new java.awt.Color(102, 0, 102));
        jbIngresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jbIngresar.setText("Ingresar");
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 200, 40));

        jbSalir.setBackground(new java.awt.Color(102, 0, 102));
        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        lblbienvenido.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        lblbienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblbienvenido.setText("Bienvenido a ProCable!");
        getContentPane().add(lblbienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 310, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/FondoMoradoMenu.jpg"))); // NOI18N
        lblFondo.setPreferredSize(new java.awt.Dimension(430, 370));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0); //Salir del Login
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        Login login = new Login(procable);
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbIngresarActionPerformed

    public static void main(String args[]) {
        ProCable procable = new ProCable();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(procable).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbConsutar;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondoImagen;
    private javax.swing.JLabel lblbienvenido;
    // End of variables declaration//GEN-END:variables
}
