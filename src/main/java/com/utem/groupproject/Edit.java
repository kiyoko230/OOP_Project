/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.utem.groupproject;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author carme
 */
public class Edit extends javax.swing.JFrame {
    private ArrayList<Food> foodList;
    private ArrayList<Drink> drinkList;
    
    private Food food = new Food() {};
    private Drink drink = new Drink() {};
    
    private String type,editID;
    
    private ItemManager manage = new ItemManager();
    /**
     * Creates new form Edit
     */
    public Edit(){
        initComponents();
    }
    
    public Edit(int type,String editID){
        initComponents();
        if (type == 0){
            this.type = "Food";
        }
        else {
            this.type = "Drink";
        }
        this.editID = editID;
        try {
            initialForm();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void initialForm() throws ClassNotFoundException{
        if ("Food".equals(type)){
            food = manage.searchFood(editID);
            nameTxtField1.setText(food.getItemName());
            arrivalDateChooser1.setCalendar(null);
            expiredDateChooser1.setCalendar(null);
            priceTxtField1.setText(String.valueOf(food.getItemPrice()));
            qtyTxtField1.setText(String.valueOf(food.getItemQuantity()));
        }
        else{
            drink = manage.searchDrink(editID);
            nameTxtField1.setText(drink.getItemName());
            arrivalDateChooser1.setCalendar(null);
            expiredDateChooser1.setCalendar(null);
            priceTxtField1.setText(String.valueOf(drink.getItemPrice()));
            qtyTxtField1.setText(String.valueOf(drink.getItemQuantity()));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        priceTxtField = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        qtyTxtField = new javax.swing.JFormattedTextField();
        nameTxtField = new javax.swing.JTextField();
        arrivalDateChooser = new com.toedter.calendar.JDateChooser();
        foodBtn = new javax.swing.JRadioButton();
        drinkBtn = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        expiredDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        priceTxtField1 = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        qtyTxtField1 = new javax.swing.JFormattedTextField();
        nameTxtField1 = new javax.swing.JTextField();
        arrivalDateChooser1 = new com.toedter.calendar.JDateChooser();
        foodBtn1 = new javax.swing.JRadioButton();
        drinkBtn1 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        expiredDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        editBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        idTxtField = new javax.swing.JTextField();

        jLabel4.setText("Item Price(RM): ");

        jLabel5.setText("Expired Date: ");

        priceTxtField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel6.setText("Item Quantity: ");

        qtyTxtField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });

        arrivalDateChooser.setDateFormatString("dd/MM/yyyy");

        foodBtn.setText("Food");

        drinkBtn.setText("Drink");

        jLabel2.setText("Item Name: ");

        expiredDateChooser.setDateFormatString("dd/MM/yyyy");

        jLabel3.setText("Item Type: ");

        jLabel7.setText("Arrival Date: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Edit Item Details");

        jLabel8.setText("Item Price(RM): ");

        jLabel9.setText("Expired Date: ");

        priceTxtField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel10.setText("Item Quantity: ");

        qtyTxtField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        nameTxtField1.setEnabled(false);
        nameTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtField1ActionPerformed(evt);
            }
        });

        arrivalDateChooser1.setDateFormatString("dd/MM/yyyy");

        buttonGroup1.add(foodBtn1);
        foodBtn1.setText("Food");
        foodBtn1.setEnabled(false);

        buttonGroup1.add(drinkBtn1);
        drinkBtn1.setText("Drink");
        drinkBtn1.setEnabled(false);

        jLabel11.setText("Item Name: ");

        expiredDateChooser1.setDateFormatString("dd/MM/yyyy");

        jLabel12.setText("Item Type: ");

        jLabel13.setText("Arrival Date: ");

        jToolBar1.setRollover(true);

        editBtn.setIcon(new javax.swing.ImageIcon("D:\\mangy\\Documents\\Sem 3\\OOP\\GUIProject\\GroupProject\\src\\main\\src\\pencil.png")); // NOI18N
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(editBtn);

        resetBtn.setIcon(new javax.swing.ImageIcon("D:\\mangy\\Documents\\Sem 3\\OOP\\GUIProject\\GroupProject\\src\\main\\src\\icons8-eraser-25.png")); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(resetBtn);

        returnBtn.setIcon(new javax.swing.ImageIcon("D:\\mangy\\Documents\\Sem 3\\OOP\\GUIProject\\GroupProject\\src\\main\\src\\undo.png")); // NOI18N
        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(returnBtn);

        jLabel14.setText("Item ID: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTxtField1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(foodBtn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(drinkBtn1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(arrivalDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(expiredDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceTxtField1)
                            .addComponent(qtyTxtField1)
                            .addComponent(idTxtField))))
                .addGap(66, 66, 66))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(idTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nameTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(foodBtn1)
                    .addComponent(drinkBtn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(arrivalDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(expiredDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(priceTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(qtyTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void nameTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtField1ActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null,"Are you sure to reset the details?","Reset",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if (result == JOptionPane.YES_NO_OPTION ){
            
        }
    }//GEN-LAST:event_resetBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null,"Are you sure to return to menu page?","Return",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if (result == JOptionPane.YES_NO_OPTION ){
            this.setVisible(false);
        }
    }//GEN-LAST:event_returnBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_editBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser arrivalDateChooser;
    private com.toedter.calendar.JDateChooser arrivalDateChooser1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton drinkBtn;
    private javax.swing.JRadioButton drinkBtn1;
    private javax.swing.JButton editBtn;
    private com.toedter.calendar.JDateChooser expiredDateChooser;
    private com.toedter.calendar.JDateChooser expiredDateChooser1;
    private javax.swing.JRadioButton foodBtn;
    private javax.swing.JRadioButton foodBtn1;
    private javax.swing.JTextField idTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField nameTxtField1;
    private javax.swing.JFormattedTextField priceTxtField;
    private javax.swing.JFormattedTextField priceTxtField1;
    private javax.swing.JFormattedTextField qtyTxtField;
    private javax.swing.JFormattedTextField qtyTxtField1;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton returnBtn;
    // End of variables declaration//GEN-END:variables
}