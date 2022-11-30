/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena;

import confi.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author X555L
 */
public class estudiantes extends javax.swing.JFrame {
    Conexion cone = new Conexion();
    Connection cnn;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
    int idc;
    /**
     * Creates new form estudiantes
     */
    public estudiantes() {
        initComponents();
        comboBox_genero();
        comboBox_sede();
        consultar();
    }
    
    private void comboBox_genero(){
        jComboBox_genero_estudiante.addItem("");
        jComboBox_genero_estudiante.addItem("Masculino");
        jComboBox_genero_estudiante.addItem("Femenino");
        jComboBox_genero_estudiante.addItem("Otro");
    }
    
    private void comboBox_sede(){
        jComboBox_sede_estudiante.addItem("");
        jComboBox_sede_estudiante.addItem("1");
        jComboBox_sede_estudiante.addItem("2");
        jComboBox_sede_estudiante.addItem("3");
        jComboBox_sede_estudiante.addItem("4");
        jComboBox_sede_estudiante.addItem("5");
        jComboBox_sede_estudiante.addItem("6");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup_genero_estudiantes = new javax.swing.ButtonGroup();
        jLabel_fondo_estudiante = new javax.swing.JLabel();
        jLabel_estudiante = new javax.swing.JLabel();
        jButton_estudiante_to_menu = new javax.swing.JButton();
        jLabel_documento_estudiante = new javax.swing.JLabel();
        jLabel_nombre_estudiante = new javax.swing.JLabel();
        jLabel_apellido_estudiante = new javax.swing.JLabel();
        jLabel_edad_estudiante = new javax.swing.JLabel();
        jLabel_genero_estudiante = new javax.swing.JLabel();
        jLabel_curso_estudiante = new javax.swing.JLabel();
        jLabel_sede_estudiante = new javax.swing.JLabel();
        jTextField_documento_estudiante = new javax.swing.JTextField();
        jTextField_nombre_estudiante = new javax.swing.JTextField();
        jTextField_apellido_estudiante = new javax.swing.JTextField();
        jTextField_edad_estudiante = new javax.swing.JTextField();
        jTextField_curso_estudiante = new javax.swing.JTextField();
        jComboBox_sede_estudiante = new javax.swing.JComboBox<>();
        jButton_actualizar_estudiante = new javax.swing.JButton();
        jButton_eliminar_estudiante = new javax.swing.JButton();
        jButton_crear_estudiante = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_estudiantes = new javax.swing.JTable();
        jComboBox_genero_estudiante = new javax.swing.JComboBox<>();
        jButton_limpiar_estudiantes = new javax.swing.JButton();
        jLabel_fecha_estudiante = new javax.swing.JLabel();
        jDateChooser_fecha_estudiante = new com.toedter.calendar.JDateChooser();

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

        jLabel_fondo_estudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sena/multimedia/colegio.jpg"))); // NOI18N

        jLabel_estudiante.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_estudiante.setText("¡Estudiante!");

        jButton_estudiante_to_menu.setBackground(new java.awt.Color(153, 153, 153));
        jButton_estudiante_to_menu.setText("Regresar");
        jButton_estudiante_to_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_estudiante_to_menuActionPerformed(evt);
            }
        });

        jLabel_documento_estudiante.setText("Documento");

        jLabel_nombre_estudiante.setText("Nombre(s)");

        jLabel_apellido_estudiante.setText("Apellido(s)");

        jLabel_edad_estudiante.setText("Edad");

        jLabel_genero_estudiante.setText("Genero");

        jLabel_curso_estudiante.setText("Curso");

        jLabel_sede_estudiante.setText("Sede");

        jTextField_documento_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_documento_estudianteActionPerformed(evt);
            }
        });
        jTextField_documento_estudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_documento_estudianteKeyPressed(evt);
            }
        });

        jTextField_curso_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_curso_estudianteActionPerformed(evt);
            }
        });

        jButton_actualizar_estudiante.setBackground(new java.awt.Color(0, 0, 153));
        jButton_actualizar_estudiante.setForeground(new java.awt.Color(255, 255, 255));
        jButton_actualizar_estudiante.setText("Actualizar");
        jButton_actualizar_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizar_estudianteActionPerformed(evt);
            }
        });

        jButton_eliminar_estudiante.setBackground(new java.awt.Color(153, 0, 0));
        jButton_eliminar_estudiante.setForeground(new java.awt.Color(255, 255, 255));
        jButton_eliminar_estudiante.setText("Eliminar");
        jButton_eliminar_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminar_estudianteActionPerformed(evt);
            }
        });

        jButton_crear_estudiante.setBackground(new java.awt.Color(0, 153, 0));
        jButton_crear_estudiante.setForeground(new java.awt.Color(255, 255, 255));
        jButton_crear_estudiante.setText("Crear");
        jButton_crear_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_crear_estudianteActionPerformed(evt);
            }
        });

        jTable_estudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombre(s)", "Apellido(s)", "Edad", "Genero", "Curso", "Sede", "Fecha nacimiento"
            }
        ));
        jTable_estudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_estudiantesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_estudiantes);

        jButton_limpiar_estudiantes.setBackground(new java.awt.Color(255, 255, 255));
        jButton_limpiar_estudiantes.setText("Limpiar");

        jLabel_fecha_estudiante.setText("Fecha");

        jDateChooser_fecha_estudiante.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_fondo_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_estudiante_to_menu)
                                .addGap(171, 171, 171)
                                .addComponent(jLabel_estudiante))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_documento_estudiante)
                                    .addComponent(jLabel_nombre_estudiante)
                                    .addComponent(jLabel_apellido_estudiante)
                                    .addComponent(jLabel_edad_estudiante)
                                    .addComponent(jLabel_genero_estudiante)
                                    .addComponent(jLabel_curso_estudiante)
                                    .addComponent(jLabel_sede_estudiante)
                                    .addComponent(jLabel_fecha_estudiante))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_sede_estudiante, 0, 285, Short.MAX_VALUE)
                                    .addComponent(jTextField_curso_estudiante)
                                    .addComponent(jTextField_documento_estudiante)
                                    .addComponent(jTextField_nombre_estudiante)
                                    .addComponent(jTextField_edad_estudiante)
                                    .addComponent(jTextField_apellido_estudiante)
                                    .addComponent(jComboBox_genero_estudiante, javax.swing.GroupLayout.Alignment.TRAILING, 0, 285, Short.MAX_VALUE)
                                    .addComponent(jDateChooser_fecha_estudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_crear_estudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jButton_eliminar_estudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jButton_actualizar_estudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jButton_limpiar_estudiantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_estudiante_to_menu)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_documento_estudiante)
                            .addComponent(jTextField_documento_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_limpiar_estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_nombre_estudiante)
                            .addComponent(jTextField_nombre_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_apellido_estudiante)
                            .addComponent(jTextField_apellido_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_actualizar_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_edad_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_edad_estudiante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_genero_estudiante)
                            .addComponent(jComboBox_genero_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_crear_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_curso_estudiante)
                            .addComponent(jTextField_curso_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_sede_estudiante)
                            .addComponent(jComboBox_sede_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_eliminar_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel_estudiante)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_fecha_estudiante)
                    .addComponent(jDateChooser_fecha_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel_fondo_estudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_documento_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_documento_estudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_documento_estudianteActionPerformed

    private void jTextField_curso_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_curso_estudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_curso_estudianteActionPerformed

    private void jButton_estudiante_to_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_estudiante_to_menuActionPerformed
        // TODO add your handling code here:
        menu run = new menu();
        run.setVisible(true);
        run.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton_estudiante_to_menuActionPerformed

    private void jButton_eliminar_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminar_estudianteActionPerformed
        // TODO add your handling code here:
        eliminar();
        consultar();
    }//GEN-LAST:event_jButton_eliminar_estudianteActionPerformed

    void eliminar() {
        int fila = jTable_estudiantes.getSelectedRow();
        try {
            if (fila == -1) {
                System.out.print("No se selecciono ninguna fila");
                limpiarTabla();
            } else {
                String sql = "DELETE FROM estudiante WHERE ID_estudiante="+idc;
                cnn = cone.getConnection();
                st = cnn.createStatement();
                st.executeUpdate(sql);
                System.out.println("Estudiante eliminado");
                limpiarTabla();
            }
        } catch (Exception e) {
        }
       
    } 
    
    private void jButton_crear_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_crear_estudianteActionPerformed
        // TODO add your handling code here:
        crear();
        consultar();
    }//GEN-LAST:event_jButton_crear_estudianteActionPerformed

    private void jButton_actualizar_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_estudianteActionPerformed
        // TODO add your handling code here:
        modificar();
        consultar();
    }//GEN-LAST:event_jButton_actualizar_estudianteActionPerformed

    //METODO MODIFICAR
    void modificar() {
        int id = Integer.parseInt(jTextField_documento_estudiante.getText());
        String nom = (String) jTextField_nombre_estudiante.getText();
        String ape = (String) jTextField_apellido_estudiante.getText();
        int edad = Integer.parseInt(jTextField_edad_estudiante.getText());
        String gen = (String) jComboBox_genero_estudiante.getSelectedItem();
        int cur = Integer.parseInt(jTextField_edad_estudiante.getText());
        int sed = Integer.parseInt((String) jComboBox_sede_estudiante.getSelectedItem());
        java.util.Date fecha = jDateChooser_fecha_estudiante.getDate();
        long d = fecha.getTime();
        java.sql.Date dat = new java.sql.Date(d);

        try {
            String sql = "UPDATE estudiante SET ID_estudiante='" + idc + "', Nombre_s_est='" + nom 
                    + "', Apllido_s_est='" + ape + "' , Edad_est='" + edad + "' , Genero_est='" + gen 
                    + "' , Curso_est='" + cur + "' , Sede_est='" + sed 
                    +  "' , Fecha_nacimiento_est='" + dat + "' WHERE ID_estudiante=" + idc;

            cnn = cone.getConnection();
            st = cnn.createStatement();
            st.executeUpdate(sql);
            System.out.println("Sede actualizada");
            limpiarTabla();
        } catch (Exception e) {
        }
    }
    //METODO MODIFICAR FIN
    
    private void jTable_estudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_estudiantesMouseClicked
        // TODO add your handling code here:
        int fila = jTable_estudiantes.getSelectedRow();
        if (fila == -1) {
            System.out.print("No se selecciono ninguna fila");
            limpiarTabla();
        } else {
            idc = Integer.parseInt((String) jTable_estudiantes.getValueAt(fila, 0).toString());
            String nom = (String) jTable_estudiantes.getValueAt(fila, 1);
            String ape = (String) jTable_estudiantes.getValueAt(fila, 2);
            int edad = (int) jTable_estudiantes.getValueAt(fila, 3);
            String gen = (String) jTable_estudiantes.getValueAt(fila, 4);
            int cur = (int) jTable_estudiantes.getValueAt(fila, 5);
            int sed = (int) jTable_estudiantes.getValueAt(fila, 6);
            Date fec = (Date) jTable_estudiantes.getValueAt(fila,7);
            jTextField_documento_estudiante.setText("" + idc);
            jTextField_nombre_estudiante.setText("" + nom);
            jTextField_apellido_estudiante.setText("" + ape);
            jTextField_edad_estudiante.setText("" + edad);
            jComboBox_genero_estudiante.setSelectedItem("" + gen);
            jTextField_curso_estudiante.setText("" + cur);
            jComboBox_sede_estudiante.setSelectedItem("" + sed);
            jDateChooser_fecha_estudiante.setDate(fec);
        }
       
    }//GEN-LAST:event_jTable_estudiantesMouseClicked

    private void jTextField_documento_estudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_documento_estudianteKeyPressed
        // TODO add your handling code here:
        consulta_f();
    }//GEN-LAST:event_jTextField_documento_estudianteKeyPressed

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
            java.util.logging.Logger.getLogger(estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new estudiantes().setVisible(true);
            }
        });
    }
    //METODO CONSULTAR
    void consultar() {
        String sql;
        sql = "SELECT * FROM estudiante";

        try {
            cnn = cone.getConnection();
            st = cnn.createStatement();
            rs = st.executeQuery(sql);

            Object[] estudiante = new Object[8];
            model = (DefaultTableModel) jTable_estudiantes.getModel();

            while (rs.next()) {
                estudiante[0] = rs.getInt("ID_estudiante");
                estudiante[1] = rs.getString("Nombre_s_est");
                estudiante[2] = rs.getString("Apllido_s_est");
                estudiante[3] = rs.getInt("Edad_est");
                estudiante[4] = rs.getString("Genero_est");
                estudiante[5] = rs.getInt("Curso_est");
                estudiante[6] = rs.getInt("Sede_est");
                estudiante[7] = rs.getDate("Fecha_nacimiento_est");

                model.addRow(estudiante);
            }
            jTable_estudiantes.setModel(model);
            System.out.println("Estudiante consultado");
        } catch (Exception e) {
        }
    }
    
    void consulta_f() {
        String sql;
        sql = "SELECT ID_estudiante FROM estudiante WHERE ID_estudiante LIKE '"+idc+"%'";

        try {
            cnn = cone.getConnection();
            st = cnn.createStatement();
            rs = st.executeQuery(sql);

            Object[] estudiante = new Object[8];
            model = (DefaultTableModel) jTable_estudiantes.getModel();

            while (rs.next()) {
                estudiante[0] = rs.getInt("ID_estudiante");
                estudiante[1] = rs.getString("Nombre_s_est");
                estudiante[2] = rs.getString("Apllido_s_est");
                estudiante[3] = rs.getInt("Edad_est");
                estudiante[4] = rs.getString("Genero_est");
                estudiante[5] = rs.getInt("Curso_est");
                estudiante[6] = rs.getInt("Sede_est");
                estudiante[7] = rs.getDate("Fecha_nacimiento_est");

                model.addRow(estudiante);
            }
            jTable_estudiantes.setModel(model);
            System.out.println("Estudiante consultado y filtrado");
        } catch (Exception e) {
        }
    }
    
    void crear() {
        int id = Integer.parseInt(jTextField_documento_estudiante.getText());
        String nom = (String) jTextField_nombre_estudiante.getText();
        String ape = (String) jTextField_apellido_estudiante.getText();
        int edad = Integer.parseInt(jTextField_edad_estudiante.getText());
        String gen = (String) jComboBox_genero_estudiante.getSelectedItem();
        int cur = Integer.parseInt(jTextField_edad_estudiante.getText());
        int sed = Integer.parseInt((String) jComboBox_sede_estudiante.getSelectedItem());
        java.util.Date fecha = jDateChooser_fecha_estudiante.getDate();
        long d = fecha.getTime();
        java.sql.Date dat = new java.sql.Date(d);

        try {
            String sql = "INSERT INTO estudiante VALUE('" + id + "' , '" + nom + "' , '" + ape + "', '" 
                    + edad + "', '" + gen + "', '" + cur + "', '" + sed + "', '" + dat + "')";

            cnn = cone.getConnection();
            st = cnn.createStatement();
            st.executeUpdate(sql);
            System.out.println("Estudiante creado");
            limpiarTabla();
        } catch (Exception e) {
        }

    }
    
    void limpiarTabla() {
        for (int i = 0; i <= jTable_estudiantes.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }
    //METODO CONSULTAR FIN


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_genero_estudiantes;
    private javax.swing.JButton jButton_actualizar_estudiante;
    private javax.swing.JButton jButton_crear_estudiante;
    private javax.swing.JButton jButton_eliminar_estudiante;
    private javax.swing.JButton jButton_estudiante_to_menu;
    private javax.swing.JButton jButton_limpiar_estudiantes;
    private javax.swing.JComboBox<String> jComboBox_genero_estudiante;
    private javax.swing.JComboBox<String> jComboBox_sede_estudiante;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha_estudiante;
    private javax.swing.JLabel jLabel_apellido_estudiante;
    private javax.swing.JLabel jLabel_curso_estudiante;
    private javax.swing.JLabel jLabel_documento_estudiante;
    private javax.swing.JLabel jLabel_edad_estudiante;
    private javax.swing.JLabel jLabel_estudiante;
    private javax.swing.JLabel jLabel_fecha_estudiante;
    private javax.swing.JLabel jLabel_fondo_estudiante;
    private javax.swing.JLabel jLabel_genero_estudiante;
    private javax.swing.JLabel jLabel_nombre_estudiante;
    private javax.swing.JLabel jLabel_sede_estudiante;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable_estudiantes;
    private javax.swing.JTextField jTextField_apellido_estudiante;
    private javax.swing.JTextField jTextField_curso_estudiante;
    private javax.swing.JTextField jTextField_documento_estudiante;
    private javax.swing.JTextField jTextField_edad_estudiante;
    private javax.swing.JTextField jTextField_nombre_estudiante;
    // End of variables declaration//GEN-END:variables
}
