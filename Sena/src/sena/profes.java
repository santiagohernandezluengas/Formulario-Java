/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena;

import confi.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author X555L
 */
public class profes extends javax.swing.JFrame {

    Conexion cone = new Conexion();
    Connection cnn;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
    int idc;

    /**
     * Creates new form estudiantes
     */
    public profes() {
        initComponents();
        comboBox_genero();
        comboBox_sede();
        consultar();
    }

    private void comboBox_genero() {
        jComboBox_genero_profes.addItem("");
        jComboBox_genero_profes.addItem("Masculino");
        jComboBox_genero_profes.addItem("Femenino");
        jComboBox_genero_profes.addItem("Otro");
    }

    private void comboBox_sede() {
        jComboBox_sede_profes.addItem("");
        jComboBox_sede_profes.addItem("1");
        jComboBox_sede_profes.addItem("2");
        jComboBox_sede_profes.addItem("3");
        jComboBox_sede_profes.addItem("4");
        jComboBox_sede_profes.addItem("5");
        jComboBox_sede_profes.addItem("6");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup_genero_profesores = new javax.swing.ButtonGroup();
        jLabel_fondo_profes = new javax.swing.JLabel();
        jLabel_profes = new javax.swing.JLabel();
        jButton_profes_to_menu = new javax.swing.JButton();
        jLabel_documento_profes = new javax.swing.JLabel();
        jLabel_nombre_profes = new javax.swing.JLabel();
        jLabel_apellido_profes = new javax.swing.JLabel();
        jLabel_edad_profes = new javax.swing.JLabel();
        jLabel_genero_profes = new javax.swing.JLabel();
        jLabel_sede_profes = new javax.swing.JLabel();
        jTextField_documento_profes = new javax.swing.JTextField();
        jTextField_nombre_profes = new javax.swing.JTextField();
        jTextField_apellido_profes = new javax.swing.JTextField();
        jTextField_edad_profes = new javax.swing.JTextField();
        jComboBox_sede_profes = new javax.swing.JComboBox<>();
        jButton_actualizar_profes = new javax.swing.JButton();
        jButton_eliminar_profes = new javax.swing.JButton();
        jButton_crear_profes = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_profes = new javax.swing.JTable();
        jComboBox_genero_profes = new javax.swing.JComboBox<>();
        jButton1_limpiar_profes = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_fondo_profes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sena/multimedia/colegio.jpg"))); // NOI18N

        jLabel_profes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_profes.setText("¡Profesores!");

        jButton_profes_to_menu.setBackground(new java.awt.Color(153, 153, 153));
        jButton_profes_to_menu.setText("Regresar");
        jButton_profes_to_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_profes_to_menuActionPerformed(evt);
            }
        });

        jLabel_documento_profes.setText("Documento");

        jLabel_nombre_profes.setText("Nombre(s)");

        jLabel_apellido_profes.setText("Apellido(s)");

        jLabel_edad_profes.setText("Edad");

        jLabel_genero_profes.setText("Genero");

        jLabel_sede_profes.setText("Sede");

        jTextField_documento_profes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_documento_profesActionPerformed(evt);
            }
        });
        jTextField_documento_profes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_documento_profesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_documento_profesKeyReleased(evt);
            }
        });

        jTextField_apellido_profes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_apellido_profesActionPerformed(evt);
            }
        });

        jButton_actualizar_profes.setBackground(new java.awt.Color(0, 0, 153));
        jButton_actualizar_profes.setForeground(new java.awt.Color(255, 255, 255));
        jButton_actualizar_profes.setText("Actualizar");
        jButton_actualizar_profes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizar_profesActionPerformed(evt);
            }
        });

        jButton_eliminar_profes.setBackground(new java.awt.Color(153, 0, 0));
        jButton_eliminar_profes.setForeground(new java.awt.Color(255, 255, 255));
        jButton_eliminar_profes.setText("Eliminar");
        jButton_eliminar_profes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminar_profesActionPerformed(evt);
            }
        });

        jButton_crear_profes.setBackground(new java.awt.Color(0, 153, 0));
        jButton_crear_profes.setForeground(new java.awt.Color(255, 255, 255));
        jButton_crear_profes.setText("Crear");
        jButton_crear_profes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_crear_profesActionPerformed(evt);
            }
        });

        jTable_profes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombre(s)", "Apellido(s)", "Edad", "Genero", "Cusro"
            }
        ));
        jTable_profes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_profesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_profes);

        jButton1_limpiar_profes.setBackground(new java.awt.Color(255, 255, 255));
        jButton1_limpiar_profes.setText("Limpiar");
        jButton1_limpiar_profes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_limpiar_profesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_fondo_profes, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_crear_profes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_profes_to_menu)
                                        .addGap(171, 171, 171)
                                        .addComponent(jLabel_profes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_documento_profes)
                                            .addComponent(jLabel_nombre_profes)
                                            .addComponent(jLabel_apellido_profes)
                                            .addComponent(jLabel_edad_profes)
                                            .addComponent(jLabel_genero_profes)
                                            .addComponent(jLabel_sede_profes))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox_sede_profes, 0, 285, Short.MAX_VALUE)
                                            .addComponent(jTextField_documento_profes)
                                            .addComponent(jTextField_nombre_profes)
                                            .addComponent(jTextField_edad_profes)
                                            .addComponent(jTextField_apellido_profes)
                                            .addComponent(jComboBox_genero_profes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(jButton_eliminar_profes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1_limpiar_profes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_actualizar_profes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_profes_to_menu)
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_documento_profes)
                                    .addComponent(jTextField_documento_profes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_nombre_profes)
                                    .addComponent(jTextField_nombre_profes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_apellido_profes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_apellido_profes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_edad_profes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_edad_profes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_genero_profes)
                                    .addComponent(jComboBox_genero_profes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1_limpiar_profes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_actualizar_profes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_crear_profes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_eliminar_profes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_sede_profes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_sede_profes)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel_profes)))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(jLabel_fondo_profes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_documento_profesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_documento_profesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_documento_profesActionPerformed

    private void jButton_profes_to_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_profes_to_menuActionPerformed
        // TODO add your handling code here:
        menu run = new menu();
        run.setVisible(true);
        run.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton_profes_to_menuActionPerformed

    private void jButton_eliminar_profesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminar_profesActionPerformed
        // TODO add your handling code here:
        eliminar();
        consultar();
    }//GEN-LAST:event_jButton_eliminar_profesActionPerformed

    void eliminar() {
        int fila = jTable_profes.getSelectedRow();
        try {
            if (fila == -1) {
                System.out.print("No se selecciono ninguna fila");
                limpiarTabla();
            } else {
                String sql = "DELETE FROM profesores WHERE ID_profesores="+idc;
                cnn = cone.getConnection();
                st = cnn.createStatement();
                st.executeUpdate(sql);
                System.out.println("Profesor eliminado");
                limpiarTabla();
            }
        } catch (Exception e) {
        }
       
    } 
    
    
    private void jTextField_apellido_profesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apellido_profesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apellido_profesActionPerformed

    private void jTable_profesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_profesMouseClicked
        // TODO add your handling code here:
        int fila = jTable_profes.getSelectedRow();
        if (fila == -1) {
            System.out.print("No se selecciono ninguna fila");
            //limpiarTabla();
        } else {
            idc = Integer.parseInt((String) jTable_profes.getValueAt(fila, 0).toString());
            String nom = (String) jTable_profes.getValueAt(fila, 1);
            String ape = (String) jTable_profes.getValueAt(fila, 2);
            int edad = (int) jTable_profes.getValueAt(fila, 3);
            String gen = (String) jTable_profes.getValueAt(fila, 4);
            int sed = (int) jTable_profes.getValueAt(fila, 5);
            jTextField_documento_profes.setText("" + idc);
            jTextField_nombre_profes.setText("" + nom);
            jTextField_apellido_profes.setText("" + ape);
            jTextField_edad_profes.setText("" + edad);
            jComboBox_genero_profes.setSelectedItem(""+gen);
            jComboBox_sede_profes.setSelectedItem(""+sed);
        }
    }//GEN-LAST:event_jTable_profesMouseClicked

    private void jButton_actualizar_profesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_profesActionPerformed
        // TODO add your handling code here:
        modificar();
        consultar();
    }//GEN-LAST:event_jButton_actualizar_profesActionPerformed

    private void jButton_crear_profesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_crear_profesActionPerformed
        // TODO add your handling code here:
        crear();
        consultar();
    }//GEN-LAST:event_jButton_crear_profesActionPerformed

    private void jTextField_documento_profesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_documento_profesKeyPressed
        // TODO add your handling code here:
        //Evento para consulta filtrada al presionar tecla
        //consulta_f();
    }//GEN-LAST:event_jTextField_documento_profesKeyPressed

    private void jButton1_limpiar_profesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_limpiar_profesActionPerformed
        // TODO add your handling code here:
        //Evento para consulta filtrada al presionar boton limpiar
        //consulta_f();
    }//GEN-LAST:event_jButton1_limpiar_profesActionPerformed

    private void jTextField_documento_profesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_documento_profesKeyReleased
        // TODO add your handling code here:
        
        //Evento para consulta filtrada al soltar tecla
        consulta_f();
    }//GEN-LAST:event_jTextField_documento_profesKeyReleased
    void crear() {
        int id = Integer.parseInt(jTextField_documento_profes.getText());
        String nom = (String) jTextField_nombre_profes.getText();
        String ape = (String) jTextField_apellido_profes.getText();
        int edad = Integer.parseInt(jTextField_edad_profes.getText());
        String gen = (String) jComboBox_genero_profes.getSelectedItem();
        int sed = Integer.parseInt((String) jComboBox_sede_profes.getSelectedItem());

        try {
            String sql = "INSERT INTO profesores VALUE('" + id + "' , '" + nom + "' , '" + ape + "', '" 
                    + edad + "', '" + gen + "', '" + sed + "')";

            cnn = cone.getConnection();
            st = cnn.createStatement();
            st.executeUpdate(sql);
            System.out.println("Profesor creado");
            limpiarTabla();
        } catch (Exception e) {
        }

    }
    
    
    
     //METODO MODIFICAR
    void modificar() {
        int id = Integer.parseInt(jTextField_documento_profes.getText());
        String nom = (String) jTextField_nombre_profes.getText();
        String ape = (String) jTextField_apellido_profes.getText();
        int edad = Integer.parseInt(jTextField_edad_profes.getText());
        String gen = (String) jComboBox_genero_profes.getSelectedItem();
        int sed = Integer.parseInt((String) jComboBox_sede_profes.getSelectedItem());

        try {
            String sql = "UPDATE profesores SET ID_profesores='" + idc + "', Nombre_s_prof='" + nom 
                    + "', Apllido_s_prof='" + ape + "' , Edad_prof='" + edad + "' , Genero_prof='" + gen 
                    +  "' , Sede_prof='" + sed + "' WHERE ID_profesores=" + idc;

            cnn = cone.getConnection();
            st = cnn.createStatement();
            st.executeUpdate(sql);
            System.out.println("Sede actualizada");
            limpiarTabla();
        } catch (Exception e) {
        }
    }
    //METODO MODIFICAR FIN
    
    
    //METODO CONSULTA FILTRADA
    void consultar() {
        String sql;
        sql = "SELECT * FROM profesores";

        try {
            cnn = cone.getConnection();
            st = cnn.createStatement();
            rs = st.executeQuery(sql);

            Object[] profe = new Object[6];
            model = (DefaultTableModel) jTable_profes.getModel();

            while (rs.next()) {
                profe[0] = rs.getInt("ID_profesores");
                profe[1] = rs.getString("Nombre_s_prof");
                profe[2] = rs.getString("Apllido_s_prof");
                profe[3] = rs.getInt("Edad_prof");
                profe[4] = rs.getString("Genero_prof");
                profe[5] = rs.getInt("Sede_prof");

                model.addRow(profe);
            }
            jTable_profes.setModel(model);
            System.out.println("Profesor consultado");
        } catch (Exception e) {
        }
    }
    //FIN METODO
    
    //METODO CONSULTAR
    void consulta_f() {
        String sql;
        sql = "SELECT ID_profesores FROM profesores WHERE ID_profesores LIKE '"+idc+"%'";

        try {
            cnn = cone.getConnection();
            st = cnn.createStatement();
            rs = st.executeQuery(sql);

            Object[] profe = new Object[6];
            model = (DefaultTableModel) jTable_profes.getModel();

            while (rs.next()) {
                profe[0] = rs.getInt("ID_profesores");
                profe[1] = rs.getString("Nombre_s_prof");
                profe[2] = rs.getString("Apllido_s_prof");
                profe[3] = rs.getInt("Edad_prof");
                profe[4] = rs.getString("Genero_prof");
                profe[5] = rs.getInt("Sede_prof");

                model.addRow(profe);
            }
            jTable_profes.setModel(model);
            System.out.println("Profesor consultado y filtrado");
        } catch (Exception e) {
        }
    }
    //METODO CONSULTAR FIN

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
            java.util.logging.Logger.getLogger(profes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profes().setVisible(true);
            }
        });
    }
    void limpiarTabla() {
        for (int i = 0; i <= jTable_profes.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_genero_profesores;
    private javax.swing.JButton jButton1_limpiar_profes;
    private javax.swing.JButton jButton_actualizar_profes;
    private javax.swing.JButton jButton_crear_profes;
    private javax.swing.JButton jButton_eliminar_profes;
    private javax.swing.JButton jButton_profes_to_menu;
    private javax.swing.JComboBox<String> jComboBox_genero_profes;
    private javax.swing.JComboBox<String> jComboBox_sede_profes;
    private javax.swing.JLabel jLabel_apellido_profes;
    private javax.swing.JLabel jLabel_documento_profes;
    private javax.swing.JLabel jLabel_edad_profes;
    private javax.swing.JLabel jLabel_fondo_profes;
    private javax.swing.JLabel jLabel_genero_profes;
    private javax.swing.JLabel jLabel_nombre_profes;
    private javax.swing.JLabel jLabel_profes;
    private javax.swing.JLabel jLabel_sede_profes;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable_profes;
    private javax.swing.JTextField jTextField_apellido_profes;
    private javax.swing.JTextField jTextField_documento_profes;
    private javax.swing.JTextField jTextField_edad_profes;
    private javax.swing.JTextField jTextField_nombre_profes;
    // End of variables declaration//GEN-END:variables
}
