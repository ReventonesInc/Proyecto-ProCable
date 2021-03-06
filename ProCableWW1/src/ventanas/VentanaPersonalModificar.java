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
public class VentanaPersonalModificar extends javax.swing.JFrame {
    
    private ProCable procable;
    private String rut;
    /**
     * Creates new form VentanaPersonalModificar
     * @param procable
     * @param rut
     */
    public VentanaPersonalModificar(ProCable procable, String rut) {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.procable = procable;
        this.rut = rut;
        /*Para poder cargar la imagen del icono*/
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/network.png")).getImage());
        insertarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelForm = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextRut = new javax.swing.JTextField();
        jTextMail = new javax.swing.JTextField();
        jTextPassword = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        jbAceptar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(451, 360));
        setResizable(false);

        jPanelForm.setBackground(new java.awt.Color(51, 51, 51));
        jPanelForm.setPreferredSize(new java.awt.Dimension(451, 350));
        jPanelForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Formulario Empleado");
        jPanelForm.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 46));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("___________________________________________________");
        jPanelForm.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextNombre.setBackground(new java.awt.Color(51, 51, 51));
        jTextNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextNombre.setSelectionColor(new java.awt.Color(102, 0, 102));
        jPanelForm.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 140, -1));

        jTextApellido.setBackground(new java.awt.Color(51, 51, 51));
        jTextApellido.setForeground(new java.awt.Color(255, 255, 255));
        jTextApellido.setSelectionColor(new java.awt.Color(102, 0, 102));
        jPanelForm.add(jTextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 140, -1));

        jTextRut.setBackground(new java.awt.Color(51, 51, 51));
        jTextRut.setForeground(new java.awt.Color(255, 255, 255));
        jTextRut.setSelectionColor(new java.awt.Color(102, 0, 102));
        jTextRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRutActionPerformed(evt);
            }
        });
        jPanelForm.add(jTextRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 140, -1));

        jTextMail.setBackground(new java.awt.Color(51, 51, 51));
        jTextMail.setForeground(new java.awt.Color(255, 255, 255));
        jTextMail.setSelectionColor(new java.awt.Color(102, 0, 102));
        jTextMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMailActionPerformed(evt);
            }
        });
        jPanelForm.add(jTextMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 160, -1));

        jTextPassword.setBackground(new java.awt.Color(51, 51, 51));
        jTextPassword.setForeground(new java.awt.Color(255, 255, 255));
        jTextPassword.setSelectionColor(new java.awt.Color(102, 0, 102));
        jTextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPasswordActionPerformed(evt);
            }
        });
        jPanelForm.add(jTextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 160, -1));

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");
        jPanelForm.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 60, 30));

        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido:");
        jPanelForm.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, 30));

        lblRut.setForeground(new java.awt.Color(255, 255, 255));
        lblRut.setText("Rut:   ");
        jPanelForm.add(lblRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 40, 30));

        lblMail.setForeground(new java.awt.Color(255, 255, 255));
        lblMail.setText("Mail:");
        jPanelForm.add(lblMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 40, 30));

        lblpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblpassword.setText("Contraseña:");
        jPanelForm.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 30));

        jbAceptar.setBackground(new java.awt.Color(102, 0, 102));
        jbAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        jPanelForm.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 130, 30));

        jbSalir.setBackground(new java.awt.Color(102, 0, 102));
        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Cancelar");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanelForm.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRutActionPerformed

    private void jTextMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMailActionPerformed

    private void jTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPasswordActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed

        if(jTextNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Es obligatorio completar el formulario!");
        }
        else{
            if(jTextApellido.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Es obligatorio completar el formulario!");
            }
            else{
                if(jTextRut.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Es obligatorio completar el formulario!");
                }
                else{
                    if(jTextMail.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Es obligatorio completar el formulario!");
                    }
                    else{
                        if(jTextPassword.getText().equals("")){
                            JOptionPane.showMessageDialog(null, "Es obligatorio completar el formulario!");
                        }
                        else{
                            (this.procable).modificarPersonal(jTextNombre.getText(), jTextApellido.getText(), jTextRut.getText(), this.rut, jTextMail.getText(), jTextPassword.getText());
                            JOptionPane.showMessageDialog(null, "Empleado modificado con exito!");
                            (this.procable).mostrarPersonal();
                            OpcionPersonal submenu = new OpcionPersonal(procable);
                            submenu.setVisible(true);
                            dispose();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        JOptionPane.showMessageDialog(null, "No se modificó el empleado!");
        OpcionClientes submenu = new OpcionClientes(procable);
        submenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    public void insertarDatos(){
        jTextNombre.setText((this.procable).obtenerNombreEmpleado(rut));
        jTextApellido.setText((this.procable).obtenerApellidoEmpledo(rut));
        jTextRut.setText(this.rut);
        jTextMail.setText((this.procable).obtenerMailEmpleado(rut));
        jTextPassword.setText((this.procable).obtenerPasswordEmpleado(rut));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanelForm;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextMail;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JTextField jTextRut;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblpassword;
    // End of variables declaration//GEN-END:variables
}
