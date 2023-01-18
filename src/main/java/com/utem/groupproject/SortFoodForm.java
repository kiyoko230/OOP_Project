/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.utem.groupproject;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Mustafa Bin Jamil
 */
public class SortFoodForm extends javax.swing.JFrame {
    private ArrayList<Food> food;
    
    /**
     * Creates new form DisplayForm
     */
    private final ItemManager manageFood = new ItemManager();
   
    
    private void clearForm(){
        foodTable.clearSelection();
        
    }
    
    private void displayItem() throws ClassNotFoundException{
        food = manageFood.readAllFood();
        
            DecimalFormat df = new DecimalFormat("0.00");
            
            foodTable.setAutoCreateRowSorter(true);
            
            DefaultTableModel tableContent = (DefaultTableModel) foodTable.getModel();
            
            
            Object rowData[] = new Object[7];
            
            for(Food f: food){
                
                rowData[0] = f.getItemID();
                rowData[1] = f.getItemName();
                rowData[2] = f.getItemType();
                rowData[3] = f.getArrivalDate();
                rowData[4] = f.getExpireDate();
                rowData[5] = df.format(f.getItemPrice());
                rowData[6] = f.getItemQuantity();
                
                tableContent.addRow(rowData);
            }
            
            
    }
    public SortFoodForm() throws ClassNotFoundException {
        initComponents();
        displayItem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        returnBtn = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setText("Sort Food in Grocery");

        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "FoodID", "Name", "Type", "Arrival Date", "Expired Date", "Price (RM)", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(foodTable);
        if (foodTable.getColumnModel().getColumnCount() > 0) {
            foodTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            foodTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            foodTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            foodTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            foodTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            foodTable.getColumnModel().getColumn(5).setPreferredWidth(40);
            foodTable.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("You can:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("- first click any column");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("for ascending order.");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("- second click any column");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("for descending order.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(returnBtn)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(548, 548, 548))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addComponent(jLabel5)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(returnBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
         int result = JOptionPane.showConfirmDialog(null,"Are you sure to return to sort page?","Return",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if (result == JOptionPane.YES_NO_OPTION ){
            this.setVisible(false);
        }
    }//GEN-LAST:event_returnBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DisplayForm().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DisplayForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable foodTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton returnBtn;
    // End of variables declaration//GEN-END:variables
}
