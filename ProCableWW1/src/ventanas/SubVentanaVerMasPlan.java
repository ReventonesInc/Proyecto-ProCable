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
public class SubVentanaVerMasPlan extends javax.swing.JFrame {
    
    private ProCable procable;
    /**
     * Creates new form SubVentanaVerMasPlan
     */
    public SubVentanaVerMasPlan(ProCable procable) {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.procable = procable;
        /*Para poder cargar la imagen del icono*/
        setIconImage(new ImageIcon(getClass().getResource("/Imágenes/network.png")).getImage());
        insertarMaximoVentas();
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
        lblGrafico = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnVolver = new javax.swing.JButton();
        BtnMostrarPlan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblPlan = new javax.swing.JLabel();
        etiqueta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/stats.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Se presentará información");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("de los planes registrado");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("en el sistema.");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ver Más");

        BtnVolver.setBackground(new java.awt.Color(102, 0, 102));
        BtnVolver.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(255, 255, 255));
        BtnVolver.setText("Volver Al Inicio");
        BtnVolver.setBorder(null);
        BtnVolver.setContentAreaFilled(false);
        BtnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVolver.setOpaque(true);
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblGrafico))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblGrafico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 350));

        BtnMostrarPlan.setBackground(new java.awt.Color(102, 0, 102));
        BtnMostrarPlan.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BtnMostrarPlan.setForeground(new java.awt.Color(255, 255, 255));
        BtnMostrarPlan.setText("Mostrar Plan");
        BtnMostrarPlan.setBorder(null);
        BtnMostrarPlan.setContentAreaFilled(false);
        BtnMostrarPlan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMostrarPlan.setOpaque(true);
        getContentPane().add(BtnMostrarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 240, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        lblPlan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPlan.setForeground(new java.awt.Color(255, 255, 255));
        lblPlan.setText("Plan más vendido:");

        etiqueta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etiqueta.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta.setText("Etiqueta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiqueta)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlan)
                    .addComponent(etiqueta))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 240, 40));

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jTextArea1.setSelectionColor(new java.awt.Color(102, 0, 102));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 240, 230));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/FondoMoradoMenu.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        OpcionPlan menu = new OpcionPlan(procable);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnVolverActionPerformed
    
    private void insertarMaximoVentas(){
        if((this.procable).planes.estaVacio()){
            etiqueta.setText("No hay planes");
        }
        else{
            etiqueta.setText((this.procable).obtenerPlanMayorVenta());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMostrarPlan;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGrafico;
    private javax.swing.JLabel lblPlan;
    // End of variables declaration//GEN-END:variables
}