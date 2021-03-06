/**
 * Ventana SubMenuModificar para poder ingresar las variables nuevas.
 * @author GrupoN°14
 */
package ventanas;

import javax.swing.ImageIcon;
import clasesproyecto.listas.ProCable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SubVentanaFormularioCliente extends javax.swing.JFrame {
    
    private ProCable procable;
    /**
     * Crea un nuevo formulario SubMenuModificar
     * Constructor SubMenuModificar
     */
    public SubVentanaFormularioCliente(ProCable procable) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.procable = procable;
        /*Para poder cargar la imagen del icono*/
        this.setIconImage(new ImageIcon(getClass().getResource("/Imágenes/network.png")).getImage());
        insertarDatosComboBox();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPlanCliente = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextRut = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jTextMail = new javax.swing.JTextField();
        jbAceptar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        lblNombre1 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulario Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 46));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("___________________________________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lblPlanCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblPlanCliente.setText("Plan:");
        jPanel1.add(lblPlanCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 30, 30));

        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido:");
        jPanel1.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, 30));

        lblRut.setForeground(new java.awt.Color(255, 255, 255));
        lblRut.setText("Rut:   ");
        jPanel1.add(lblRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 40, 30));

        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono:");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 60, 30));

        lblMail.setForeground(new java.awt.Color(255, 255, 255));
        lblMail.setText("Mail:");
        jPanel1.add(lblMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 40, 30));

        jTextNombre.setBackground(new java.awt.Color(51, 51, 51));
        jTextNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextNombre.setSelectionColor(new java.awt.Color(102, 0, 102));
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 140, -1));

        jTextApellido.setBackground(new java.awt.Color(51, 51, 51));
        jTextApellido.setForeground(new java.awt.Color(255, 255, 255));
        jTextApellido.setSelectionColor(new java.awt.Color(102, 0, 102));
        jPanel1.add(jTextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 140, -1));

        jTextRut.setBackground(new java.awt.Color(51, 51, 51));
        jTextRut.setForeground(new java.awt.Color(255, 255, 255));
        jTextRut.setSelectionColor(new java.awt.Color(102, 0, 102));
        jTextRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRutActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 140, -1));

        jTextTelefono.setBackground(new java.awt.Color(51, 51, 51));
        jTextTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jTextTelefono.setSelectionColor(new java.awt.Color(102, 0, 102));
        jPanel1.add(jTextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 140, -1));

        jTextMail.setBackground(new java.awt.Color(51, 51, 51));
        jTextMail.setForeground(new java.awt.Color(255, 255, 255));
        jTextMail.setSelectionColor(new java.awt.Color(102, 0, 102));
        jTextMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMailActionPerformed(evt);
            }
        });
        jPanel1.add(jTextMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 160, -1));

        jbAceptar.setBackground(new java.awt.Color(102, 0, 102));
        jbAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 130, 30));

        jbSalir.setBackground(new java.awt.Color(102, 0, 102));
        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Cancelar");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 130, 30));

        lblNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre1.setText("Nombre:");
        jPanel1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 60, 30));

        jComboBox.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRutActionPerformed

    private void jTextMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMailActionPerformed

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
                        if(jTextTelefono.getText().equals("")){
                            JOptionPane.showMessageDialog(null, "Es obligatorio completar el formulario!");
                        }
                        else{
                            if(((this.procable).agregarCliente(jComboBox.getSelectedItem().toString(),jTextNombre.getText(), jTextApellido.getText(), jTextRut.getText(), jTextMail.getText(), jTextTelefono.getText()) == true)){
                                JOptionPane.showMessageDialog(null, "Cliente agregado con exito!");
                                (this.procable).mostrarCliente();
                                OpcionClientes submenu = new OpcionClientes(procable);
                                submenu.setVisible(true);
                                dispose();
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Ocurrió un error al agregar el cliente!");
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        JOptionPane.showMessageDialog(null, "No se agregó el cliente!");
        OpcionClientes submenu = new OpcionClientes(procable);
        submenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed

    public void insertarDatosComboBox(){
        for(int i = 0; i < (this.procable).planes.tamano(); i++){
            jComboBox.addItem((this.procable).planes.getPlanes().get(i).getNombrePlan());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextMail;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextRut;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPlanCliente;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTelefono;
    // End of variables declaration//GEN-END:variables
}
