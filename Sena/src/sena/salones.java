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
public class salones extends javax.swing.JFrame {

    Conexion cone = new Conexion();
    Connection cnn;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
    int idc;

    public salones() {
        initComponents();
        comboBox_salones();
        comboBox_tipo_salon();
        consultar();
    }
    
    //METODO CONSULTAR
    void consultar() {
        String sql = "select * from salon";

        try {
            cnn = cone.getConnection();
            st = cnn.createStatement();
            rs = st.executeQuery(sql);

            Object[] salon = new Object[3];
            model = (DefaultTableModel) jTable_salon.getModel();

            while (rs.next()) {
                salon[0] = rs.getInt("ID_salon");
                salon[1] = rs.getString("Tipo_salon");
                salon[2] = rs.getString("Sede_salon");

                model.addRow(salon);
            }
            jTable_salon.setModel(model);
            System.out.println("Salon consultada");
        } catch (Exception e) {
        }
    }
    //METODO CONSULTAR FIN

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_fondo_salones = new javax.swing.JLabel();
        jButton_salon_to_menu = new javax.swing.JButton();
        jLabel_salones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_salon = new javax.swing.JTable();
        jButton_actualizar_salon = new javax.swing.JButton();
        jButton_crear_salon = new javax.swing.JButton();
        jButton_eliminar_salon = new javax.swing.JButton();
        jLabel_no_salon = new javax.swing.JLabel();
        jTextField_no_salon = new javax.swing.JTextField();
        jLabel_tipo_salon = new javax.swing.JLabel();
        jLabel_sede_salon = new javax.swing.JLabel();
        jComboBox_sedes_salon = new javax.swing.JComboBox<>();
        jComboBox_tipo_salon = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_fondo_salones.setBackground(new java.awt.Color(153, 0, 51));
        jLabel_fondo_salones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sena/multimedia/colegio.jpg"))); // NOI18N
        jLabel_fondo_salones.setText("jLabel1");
        getContentPane().add(jLabel_fondo_salones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 430));

        jButton_salon_to_menu.setBackground(new java.awt.Color(153, 153, 153));
        jButton_salon_to_menu.setText("Regresar");
        jButton_salon_to_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salon_to_menuActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_salon_to_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 11, -1, -1));

        jLabel_salones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_salones.setText("¡SALONES!");
        getContentPane().add(jLabel_salones, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 41, -1, -1));

        jTable_salon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID salon", "Tipo salon", "Sede"
            }
        ));
        jTable_salon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_salonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_salon);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 322, -1, 89));

        jButton_actualizar_salon.setBackground(new java.awt.Color(0, 0, 102));
        jButton_actualizar_salon.setForeground(new java.awt.Color(255, 255, 255));
        jButton_actualizar_salon.setText("Actualizar");
        jButton_actualizar_salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizar_salonActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_actualizar_salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 100, -1));

        jButton_crear_salon.setBackground(new java.awt.Color(0, 153, 0));
        jButton_crear_salon.setForeground(new java.awt.Color(255, 255, 255));
        jButton_crear_salon.setText("Crear");
        jButton_crear_salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_crear_salonActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_crear_salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 100, -1));

        jButton_eliminar_salon.setBackground(new java.awt.Color(153, 0, 0));
        jButton_eliminar_salon.setForeground(new java.awt.Color(255, 255, 255));
        jButton_eliminar_salon.setText("Eliminar");
        jButton_eliminar_salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminar_salonActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_eliminar_salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 110, -1));

        jLabel_no_salon.setText("Ingrese No. Salon");
        getContentPane().add(jLabel_no_salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 164, -1, -1));

        jTextField_no_salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_no_salonActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_no_salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 100, -1));

        jLabel_tipo_salon.setText("Ingrese tipo salon");
        getContentPane().add(jLabel_tipo_salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 164, -1, -1));

        jLabel_sede_salon.setText("Seleccione sede");
        getContentPane().add(jLabel_sede_salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 164, -1, -1));

        getContentPane().add(jComboBox_sedes_salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 94, -1));

        getContentPane().add(jComboBox_tipo_salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 100, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBox_salones() {
        jComboBox_sedes_salon.addItem(null);
        jComboBox_sedes_salon.addItem("1");
        jComboBox_sedes_salon.addItem("2");
        jComboBox_sedes_salon.addItem("3");
        jComboBox_sedes_salon.addItem("4");
        jComboBox_sedes_salon.addItem("5");

    }

    private void comboBox_tipo_salon() {
        jComboBox_tipo_salon.addItem(null);
        jComboBox_tipo_salon.addItem("Sistemas");
        jComboBox_tipo_salon.addItem("Laboratorio");
        jComboBox_tipo_salon.addItem("Aula");
    }


    private void jButton_salon_to_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salon_to_menuActionPerformed
        // TODO add your handling code here:
        menu run = new menu();
        run.setVisible(true);
        run.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton_salon_to_menuActionPerformed

    private void jTextField_no_salonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_no_salonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_no_salonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextField_no_salon.setText("");
        jComboBox_sedes_salon.setToolTipText(null);
        jComboBox_tipo_salon.setToolTipText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_crear_salonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_crear_salonActionPerformed
        // TODO add your handling code here:
        crear();
        consultar();
        jTextField_no_salon.setText("");
        jComboBox_sedes_salon.setSelectedItem("");
        jComboBox_tipo_salon.setSelectedItem("");
    }//GEN-LAST:event_jButton_crear_salonActionPerformed

    private void jButton_actualizar_salonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_salonActionPerformed
        // TODO add your handling code here:
        modificar();
        consultar();
        jTextField_no_salon.setText("");
        jComboBox_sedes_salon.setSelectedItem("");
        jComboBox_tipo_salon.setSelectedItem("");
    }//GEN-LAST:event_jButton_actualizar_salonActionPerformed
        //METODO MODIFICAR
    void modificar() {
        int id = Integer.parseInt(jTextField_no_salon.getText());
        String nom = (String) jComboBox_tipo_salon.getSelectedItem();
        int dir = Integer.parseInt((String) jComboBox_sedes_salon.getSelectedItem());

        try {
            String sql = "UPDATE salon SET ID_salon='" + idc + "', Tipo_salon='" + nom + "', Sede_salon='" + dir + "' WHERE ID_salon=" + idc;

            cnn = cone.getConnection();
            st = cnn.createStatement();
            st.executeUpdate(sql);
            System.out.println("Sede actualizada");
            limpiarTabla();
        } catch (Exception e) {
        }
    }
    //METODO MODIFICAR FIN
    
    private void jTable_salonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_salonMouseClicked
        // TODO add your handling code here:
        //CREACION CLICK PARA ACTUALIZAR
        int fila = jTable_salon.getSelectedRow();
        if (fila == -1) {
            System.out.print("No se selecciono ninguna fila");
            limpiarTabla();
        } else {
            idc = Integer.parseInt((String) jTable_salon.getValueAt(fila, 0).toString());
            String nom = (String) jTable_salon.getValueAt(fila, 1);
            String dir = (String) jTable_salon.getValueAt(fila, 2);
            jTextField_no_salon.setText("" + idc);
            jComboBox_tipo_salon.setSelectedItem("" + nom);
            jComboBox_sedes_salon.setSelectedItem("" + dir);
        } //CREACION CLICK PARA ACTUALIZAR FIN
    }//GEN-LAST:event_jTable_salonMouseClicked

    private void jButton_eliminar_salonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminar_salonActionPerformed
        // TODO add your handling code here:
        eliminar();
        consultar();
        jTextField_no_salon.setText("");
        jComboBox_sedes_salon.setSelectedItem("");
        jComboBox_tipo_salon.setSelectedItem("");
    }//GEN-LAST:event_jButton_eliminar_salonActionPerformed
    void eliminar() {
        int fila = jTable_salon.getSelectedRow();
        try {
            if (fila == -1) {
                System.out.print("No se selecciono ninguna fila");
                limpiarTabla();
            } else {
                String sql = "DELETE FROM salon WHERE ID_salon="+idc;
                cnn = cone.getConnection();
                st = cnn.createStatement();
                st.executeUpdate(sql);
                System.out.println("Sede eliminada");
                limpiarTabla();
            }
        } catch (Exception e) {
        }
       
    } 
    //METODO DE CREAR
    void crear() {
        int id = Integer.parseInt(jTextField_no_salon.getText());
        String tip = (String) jComboBox_tipo_salon.getSelectedItem();
        int dir = Integer.parseInt((String) jComboBox_sedes_salon.getSelectedItem());

        try {
            String sql = "INSERT INTO salon VALUE('" + id + "' , '" + tip + "' , '" + dir + "')";

            cnn = cone.getConnection();
            st = cnn.createStatement();
            st.executeUpdate(sql);
            System.out.println("Salon creado");
            limpiarTabla();
        } catch (Exception e) {
        }

    }

    void limpiarTabla() {
        for (int i = 0; i <= jTable_salon.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }
    //METODO CREAR FIN
    
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
            java.util.logging.Logger.getLogger(salones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_actualizar_salon;
    private javax.swing.JButton jButton_crear_salon;
    private javax.swing.JButton jButton_eliminar_salon;
    private javax.swing.JButton jButton_salon_to_menu;
    private javax.swing.JComboBox<String> jComboBox_sedes_salon;
    private javax.swing.JComboBox<String> jComboBox_tipo_salon;
    private javax.swing.JLabel jLabel_fondo_salones;
    private javax.swing.JLabel jLabel_no_salon;
    private javax.swing.JLabel jLabel_salones;
    private javax.swing.JLabel jLabel_sede_salon;
    private javax.swing.JLabel jLabel_tipo_salon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_salon;
    private javax.swing.JTextField jTextField_no_salon;
    // End of variables declaration//GEN-END:variables
}