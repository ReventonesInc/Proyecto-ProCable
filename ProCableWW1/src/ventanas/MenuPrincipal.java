/**
 * Menú principal del programa del manejo de redes de televisión.
 * @author GrupoN°14
 */

package ventanas;

import javax.swing.ImageIcon;
import clasesproyecto.listas.*;

public class MenuPrincipal extends javax.swing.JFrame {
    
    private ProCable procable;
    
    /**
     * Crea un nuevo formulario llamado MenuPrincipal.
     * Constructor MenuPrincipal.
     */
    public MenuPrincipal(ProCable procable) {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.procable = procable;
        /*Para poder cargar la imagen del icono*/
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/network.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSalir = new javax.swing.JButton();
        jMenuToggle = new javax.swing.JPanel();
        jbClientes = new javax.swing.JButton();
        jbSucursales = new javax.swing.JButton();
        jbPaquetes = new javax.swing.JButton();
        jbCerrarSesion = new javax.swing.JButton();
        lblWorld = new javax.swing.JLabel();
        jbAdministradores1 = new javax.swing.JButton();
        jbMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbSalir.setBackground(new java.awt.Color(102, 0, 102));
        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 70, 50));

        jMenuToggle.setBackground(new java.awt.Color(51, 51, 51));
        jMenuToggle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuToggle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbClientes.setBackground(new java.awt.Color(102, 0, 102));
        jbClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbClientes.setForeground(new java.awt.Color(255, 255, 255));
        jbClientes.setText("Clientes");
        jbClientes.setBorder(null);
        jbClientes.setContentAreaFilled(false);
        jbClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbClientes.setOpaque(true);
        jbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClientesActionPerformed(evt);
            }
        });
        jMenuToggle.add(jbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 50));

        jbSucursales.setBackground(new java.awt.Color(102, 0, 102));
        jbSucursales.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbSucursales.setForeground(new java.awt.Color(255, 255, 255));
        jbSucursales.setText("Sucursales");
        jbSucursales.setBorder(null);
        jbSucursales.setContentAreaFilled(false);
        jbSucursales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSucursales.setOpaque(true);
        jbSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSucursalesActionPerformed(evt);
            }
        });
        jMenuToggle.add(jbSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, 50));

        jbPaquetes.setBackground(new java.awt.Color(102, 0, 102));
        jbPaquetes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbPaquetes.setForeground(new java.awt.Color(255, 255, 255));
        jbPaquetes.setText("Planes");
        jbPaquetes.setToolTipText("");
        jbPaquetes.setBorder(null);
        jbPaquetes.setContentAreaFilled(false);
        jbPaquetes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPaquetes.setOpaque(true);
        jMenuToggle.add(jbPaquetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 190, 50));

        jbCerrarSesion.setBackground(new java.awt.Color(102, 0, 102));
        jbCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbCerrarSesion.setText("Cerrar Sesión");
        jbCerrarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCerrarSesion.setOpaque(true);
        jbCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSesionActionPerformed(evt);
            }
        });
        jMenuToggle.add(jbCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 190, 50));

        lblWorld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/WorldMenu.png"))); // NOI18N
        lblWorld.setText("jLabel1");
        jMenuToggle.add(lblWorld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 120));

        jbAdministradores1.setBackground(new java.awt.Color(102, 0, 102));
        jbAdministradores1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbAdministradores1.setForeground(new java.awt.Color(255, 255, 255));
        jbAdministradores1.setText("Administradores");
        jbAdministradores1.setBorder(null);
        jbAdministradores1.setContentAreaFilled(false);
        jbAdministradores1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAdministradores1.setOpaque(true);
        jbAdministradores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdministradores1ActionPerformed(evt);
            }
        });
        jMenuToggle.add(jbAdministradores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 190, 50));

        getContentPane().add(jMenuToggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 10, 210, 560));

        jbMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/icono menu.png"))); // NOI18N
        jbMenu.setText("jButton1");
        jbMenu.setBorder(null);
        jbMenu.setContentAreaFilled(false);
        jbMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jbMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario conectado con exito!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Escoja algunas de las opciones.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/fondoMoradoP.jpg"))); // NOI18N
        lblFondo.setPreferredSize(new java.awt.Dimension(760, 590));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 760, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuActionPerformed
        int posicion = jbMenu.getX();
        
        if(posicion > 10){
            Animacion.Animacion.mover_izquierda(210, 10, 2, 2, jbMenu);
            Animacion.Animacion.mover_izquierda(10, -200, 2, 2, jMenuToggle);
        }
        else{
            Animacion.Animacion.mover_derecha(10, 210, 2, 2, jbMenu);
            Animacion.Animacion.mover_derecha(-200, 10, 2, 2, jMenuToggle);
        }
    }//GEN-LAST:event_jbMenuActionPerformed

    private void jbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClientesActionPerformed
        OpcionClientes menuClientes = new OpcionClientes(procable);
        menuClientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbClientesActionPerformed

    private void jbSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSucursalesActionPerformed

    }//GEN-LAST:event_jbSucursalesActionPerformed

    private void jbCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarSesionActionPerformed
        VentanaPrincipal principal = new VentanaPrincipal(procable);
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbCerrarSesionActionPerformed

    private void jbAdministradores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdministradores1ActionPerformed
        OpcionPersonal menuPersonal = new OpcionPersonal(procable);
        menuPersonal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbAdministradores1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jMenuToggle;
    private javax.swing.JButton jbAdministradores1;
    private javax.swing.JButton jbCerrarSesion;
    private javax.swing.JButton jbClientes;
    private javax.swing.JButton jbMenu;
    private javax.swing.JButton jbPaquetes;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbSucursales;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblWorld;
    // End of variables declaration//GEN-END:variables
}
