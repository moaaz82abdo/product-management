/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import oldtable.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication2.function;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class sqltable extends javax.swing.JFrame {
  public static String url = "jdbc:mysql://localhost:3306/prog63";
  public static String user = "root";           
  public static String pass =  "1234567q";
      
    /**
     * Creates new form main
     */
    public sqltable() {
        initComponents();
        loading();
        total();
        DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
        cr.setForeground(Color.orange);
        for (int i = 0; i < table.getColumnCount();i++){
        table.getColumnModel().getColumn(i).setHeaderRenderer(cr);}
        cr.setHorizontalAlignment(JLabel.CENTER);
        t2.setOpaque(false);
        t2.setBorder(null);
        t2.setBackground(new Color(0,0,0,0));
        sc.setOpaque(false);
        sc.getViewport().setOpaque(false);
        table.setOpaque(false);
        table.setBorder(null);
        table.setBackground(new Color(0,0,0,0));
        table.getColumnModel().getColumn(7).setMinWidth(0);
        table.getColumnModel().getColumn(7).setMaxWidth(0);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        sc = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("الاسم");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 40, -1));

        t1.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("الوظيفة");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        t2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "مهندس", "موظف", "محاسب", "سكرتارية", "رئيس قسم", "شؤون عاملين", "شؤون قانونية", "مدير" }));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("المرتب");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        t3.setPreferredSize(new java.awt.Dimension(100, 30));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("رقم المحمول");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        t4.setPreferredSize(new java.awt.Dimension(100, 30));
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("العنوان");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        t5.setPreferredSize(new java.awt.Dimension(100, 30));
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("تاريخ الميلاد");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        t6.setPreferredSize(new java.awt.Dimension(100, 30));
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        l1.setBackground(new java.awt.Color(204, 204, 0));
        l1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("إضافة");
        l1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l1.setOpaque(true);
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l1MouseExited(evt);
            }
        });
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 137, 50, 30));

        l2.setBackground(new java.awt.Color(204, 204, 0));
        l2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("حذف");
        l2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l2.setOpaque(true);
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 137, -1, 30));

        l3.setBackground(new java.awt.Color(204, 204, 0));
        l3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("تعديل");
        l3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l3.setOpaque(true);
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 60, 30));

        table.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "تاريخ الميلاد", "العنوان", "رقم المحمول", "المكاقأة", "المرتب", "الوظيفة", "الاسم", "id"
            }
        ));
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        table.setOpaque(false);
        table.setRowHeight(20);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        sc.setViewportView(table);

        getContentPane().add(sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 680, 210));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-close-48.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-minimize-48.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 50, 50));

        jLabel10.setBackground(new java.awt.Color(204, 204, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("تفاصيل");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 142, -1, 30));

        total.setBackground(new java.awt.Color(255, 255, 51));
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setText("مجموع المرتبات = ");
        total.setOpaque(true);
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 240, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void clear(){
    t1.setText("");t2.setSelectedItem("مهندس");t3.setText("");t4.setText("");t5.setText("");t6.setText("");
    }
    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        try{
             String sql = "insert into emp (name,job,salary,phone,address,birthdate) values (?,?,?,?,?,str_to_date(?,'%d/%m/%Y'));";
             
           try(Connection con = DriverManager.getConnection(url, user,pass)){
              System.out.println("done");
              PreparedStatement pst = con.prepareStatement(sql);
              pst.setString(1, t1.getText());
              pst.setString(2, t2.getSelectedItem().toString());
              pst.setInt(3, Integer.parseInt(t3.getText()));
              pst.setString(4, t4.getText());
              pst.setString(5, t5.getText());
              pst.setString(6, t6.getText());
              pst.execute();
              model.setRowCount(0);
              loading();
              total();
              } catch (SQLException ex) {
            Logger.getLogger(sqltable.class.getName()).log(Level.SEVERE, null, ex);
        }        clear();
        }
        catch(java.lang.NumberFormatException er){JOptionPane.showMessageDialog(this, "المرتب يجب ان يحتوي على ارقام فقط");}
        catch(java.lang.StringIndexOutOfBoundsException err){JOptionPane.showMessageDialog(this, "يجب ملؤ كل البيانات");}
    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        try {
            String sql = "delete from emp where idemp="+model.getValueAt(table.getSelectedRow(),7)+"";
        try(Connection con = DriverManager.getConnection(url, user,pass)){
        Statement st = con.createStatement();
        st.execute(sql);
        } catch (SQLException ex) {
                Logger.getLogger(sqltable.class.getName()).log(Level.SEVERE, null, ex);
            }
        clear();
        model.setRowCount(0);
        loading();
        total();
       
        }
        catch (java.lang.ArrayIndexOutOfBoundsException er){JOptionPane.showMessageDialog(this,"يجب اختيار صف من الجدول");}
    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table.getModel();
         try{
             String sql = "update emp set name=?,job=?,salary=?,phone=?,address=?,birthdate=? where idemp=?";
      try(Connection con = DriverManager.getConnection(url, user,pass)){
           PreparedStatement pst = con.prepareStatement(sql);
              pst.setString(1, t1.getText());
              pst.setString(2, t2.getSelectedItem().toString());
              pst.setInt(3, Integer.parseInt(t3.getText()));
              pst.setString(4, t4.getText());
              pst.setString(5, t5.getText());
              pst.setString(6, t6.getText());
              pst.setInt(7,Integer.parseInt(model.getValueAt(table.getSelectedRow(),7).toString()));
              pst.execute();
              model.setRowCount(0);
              loading();
              total();
             
      
      } catch (SQLException ex) {
                Logger.getLogger(sqltable.class.getName()).log(Level.SEVERE, null, ex);
            }
        clear();
       }
         catch(java.lang.ArrayIndexOutOfBoundsException r){JOptionPane.showMessageDialog(this, "يجب اختيار صف من الجدول");}

    }//GEN-LAST:event_l3MouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        t6.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
        t5.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
        t4.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        t3.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
        t2.setSelectedItem(table.getValueAt(table.getSelectedRow(), 5).toString());
        t1.setText(table.getValueAt(table.getSelectedRow(), 6).toString());

    }//GEN-LAST:event_tableMouseClicked

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed

    }//GEN-LAST:event_t3ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void l1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseEntered
        // TODO add your handling code here:
        l1.setBackground(new Color(252,196,25));
    }//GEN-LAST:event_l1MouseEntered

    private void l1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseExited
        // TODO add your handling code here:
       l1.setBackground(new Color(204,204,0));
    }//GEN-LAST:event_l1MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
       int ind = 0;
        try{
        
        table.getValueAt(table.getSelectedRow(), 0).toString();
        table.getValueAt(table.getSelectedRow(), 1).toString();
        table.getValueAt(table.getSelectedRow(), 2).toString();
        table.getValueAt(table.getSelectedRow(), 3).toString();
        table.getValueAt(table.getSelectedRow(), 4).toString();
        table.getValueAt(table.getSelectedRow(), 5).toString();
       }
       catch(java.lang.ArrayIndexOutOfBoundsException r){JOptionPane.showMessageDialog(this, "يجب اختيار صف من الجدول"); ind=1;}
   if (ind == 0){
        new details().setVisible(true);
         DefaultTableModel model = (DefaultTableModel)table.getModel();
        details.t6.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
        details.t5.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
        details.t4.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        details.t3.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
        details.t2.setSelectedItem(table.getValueAt(table.getSelectedRow(), 4).toString());
        details.t1.setText(table.getValueAt(table.getSelectedRow(), 5).toString());}   
    }//GEN-LAST:event_jLabel10MouseClicked
     private void total (){
             String sql = "select sum(salary) as total from emp;";
            DefaultTableModel model = (DefaultTableModel)table.getModel();    
           try(Connection con = DriverManager.getConnection(url, user,pass)){
              System.out.println("done");
              Statement st = con.createStatement();
              ResultSet rs = st.executeQuery(sql);
               while (rs.next()){
                   total.setText("مجموع المرنبات = " + Integer.toString(rs.getInt("total")));
              
              }
           } catch (SQLException ex) {
          Logger.getLogger(sqltable.class.getName()).log(Level.SEVERE, null, ex);
      }}     
    
    
    public static void loading (){
             String sql = "select *,salary*15/100 as bonus from emp;";
            DefaultTableModel model = (DefaultTableModel)table.getModel();    
           try(Connection con = DriverManager.getConnection(url, user,pass)){
              System.out.println("done");
              Statement st = con.createStatement();
              ResultSet rs = st.executeQuery(sql);
              while (rs.next()){
                 model.addRow(new Object[]{rs.getString("birthdate"),rs.getString("address"),rs.getString("phone"),rs.getInt("bonus"),rs.getInt("salary"),rs.getString("job"),rs.getString("name"),rs.getInt("idemp")});
              
              }
              } catch (SQLException ex) {
            Logger.getLogger(sqltable.class.getName()).log(Level.SEVERE, null, ex);
        }
           
}
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
            java.util.logging.Logger.getLogger(sqltable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sqltable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sqltable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sqltable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sqltable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JScrollPane sc;
    public static javax.swing.JTextField t1;
    public static javax.swing.JComboBox<String> t2;
    public static javax.swing.JTextField t3;
    public static javax.swing.JTextField t4;
    public static javax.swing.JTextField t5;
    public static javax.swing.JTextField t6;
    public static javax.swing.JTable table;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
