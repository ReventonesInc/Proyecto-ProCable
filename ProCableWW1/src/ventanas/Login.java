/**
 * Login del programa "ProCable".
 * @author GrupoN°14
 */
package ventanas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import clasesproyecto.listas.*;

public class Login extends javax.swing.JFrame {
    
    private ProCable procable;
    /**
     * Crea un nuevo formulario llamado Login.
     * Constructor Login.
     */
    public Login(ProCable procable) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        this.procable = procable;
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/network.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSalir = new javax.swing.JButton();
        lblWorld = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jbIniciar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
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
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        lblWorld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/WorldF.png"))); // NOI18N
        getContentPane().add(lblWorld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 320, 310));

        lblWelcome.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Ingresar Sesión");
        getContentPane().add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 200, -1));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Usuario :");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña :");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jTextFieldUser.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUser.setSelectionColor(new java.awt.Color(102, 0, 102));
        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 160, -1));

        jPassword.setBackground(new java.awt.Color(51, 51, 51));
        jPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPassword.setSelectionColor(new java.awt.Color(102, 0, 102));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 160, -1));

        jbIniciar.setBackground(new java.awt.Color(102, 0, 102));
        jbIniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbIniciar.setForeground(new java.awt.Color(255, 255, 255));
        jbIniciar.setText("Iniciar Sesión");
        jbIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbIniciarMouseClicked(evt);
            }
        });
        jbIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(jbIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/FondoMoradoMenu.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*Instrucción al presionar el botón jbSalir*/
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0); //Salir del Login
    }//GEN-LAST:event_jbSalirActionPerformed
    
    /*Texto para escribir el usuario*/
    private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserActionPerformed
    
    /*Boton iniciar sesion*/
    private void jbIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIniciarActionPerformed
        
    }//GEN-LAST:event_jbIniciarActionPerformed
    
    /*Texto para escribir contraseña*/
    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    /*Instrucción al presionar el botón jbIniciar (Iniciar Sesion)*/
    private void jbIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbIniciarMouseClicked
        String usuario = "admin";    //Nombre de usuario correcto
        String contrasena = "123";   //Contraseña correcta
        
        /*Se lee la contraseña ingresada por el usuario*/
        String password = new String(jPassword.getPassword());
        
        /*Comparar los datos correctos con los datos ingresados por el usuario*/
        if((jTextFieldUser.getText().equals(usuario))&&(password.equals(contrasena))){
            /*Si los datos son correctos, se creará y abrirá el menú principal*/
            JOptionPane.showMessageDialog(null, "Bienvenido Administrador.");
            MenuPrincipal menu = new MenuPrincipal(procable);
            menu.setVisible(true);
            dispose();
        }
        else{
            /*Si los datos son incorrectos, se imprimira un mensaje por pantalla*/
            JOptionPane.showMessageDialog(null, "Usuario ó Contraseña incorrecta.");
        }
    }//GEN-LAST:event_jbIniciarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JButton jbIniciar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblWorld;
    // End of variables declaration//GEN-END:variables
}
