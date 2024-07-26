/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class function {
     public static void saving(JTable x) {
try{
File file=new File(".\\src\\data.txt");
if(!file.exists()){
file.createNewFile() ;
}
FileWriter fw =new FileWriter(file.getAbsoluteFile()) ;
BufferedWriter bw = new BufferedWriter(fw);
for(int i = 0 ;i < x.getRowCount();i++){
for(int j = 0 ;j < x.getColumnCount();j++){
bw.write((String)x.getModel().getValueAt(i , j)+"!@#");
}
bw.write("\n");
}
bw.close();
fw.close();
}catch(Exception ex){
ex.printStackTrace();
}
}
public static void loading(JTable y){
String line;
BufferedReader reader;
try{
reader = new BufferedReader(new FileReader(".\\src\\data.txt"));
DefaultTableModel model=(DefaultTableModel) y.getModel();
while((line = reader.readLine()) != null)
{
model.addRow(line.split("!@#"));
}
reader.close();
}
catch(IOException e){
JOptionPane.showMessageDialog(null, "Error");
e.printStackTrace();
}
}
public static void tdesign (JTable t){

DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
        cr.setForeground(Color.orange);
        for (int i = 0; i < t.getColumnCount();i++){
        t.getColumnModel().getColumn(i).setHeaderRenderer(cr);}
        cr.setHorizontalAlignment(JLabel.CENTER);

        t.setOpaque(false);
        t.setBorder(null);
        t.setBackground(new Color(0,0,0,0));
}

}
