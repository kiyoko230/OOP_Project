/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.utem.groupproject;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class SearchDrinkForm extends javax.swing.JFrame {
    private ItemManager manager = new ItemManager();
    
    public SearchDrinkForm() {
        initComponents();
    }
    
    public void addRowtoJTable(ArrayList<Drink> result)
    {
        DefaultTableModel model= (DefaultTableModel) drinkTable.getModel();
        Object rowData[]=new Object[7];
        for (int i=0;i<result.size();i++)
        {
            rowData[0]=result.get(i).getItemID();
            rowData[1]=result.get(i).getItemName();
            rowData[2]=result.get(i).getItemType();
            rowData[3]=result.get(i).getArrivalDate();
            rowData[4]=result.get(i).getExpireDate();
            rowData[5]=result.get(i).getItemPrice();
            rowData[6]=result.get(i).getItemQuantity();
            model.addRow(rowData);
        }
    }
    
    public void clearTable(){
        DefaultTableModel model= (DefaultTableModel) drinkTable.getModel();
        model.setRowCount(0);
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
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drinkTable = new javax.swing.JTable();
        searchComboBox = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();
        minTextField = new javax.swing.JTextField();
        maxTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        arrivalDateChooser = new com.toedter.calendar.JDateChooser();
        expiryDateChooser = new com.toedter.calendar.JDateChooser();
        returnBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Search Drink Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 190, 50));

        jLabel2.setText("Search By");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drinkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Name", "Type", "Arrival Date", "Expiry Date", "Price", "Quantity In Stock"
            }
        ));
        jScrollPane1.setViewportView(drinkTable);
        if (drinkTable.getColumnModel().getColumnCount() > 0) {
            drinkTable.getColumnModel().getColumn(0).setHeaderValue("Food ID");
            drinkTable.getColumnModel().getColumn(1).setHeaderValue("Name");
            drinkTable.getColumnModel().getColumn(2).setHeaderValue("Type");
            drinkTable.getColumnModel().getColumn(3).setHeaderValue("Arrival Date");
            drinkTable.getColumnModel().getColumn(4).setHeaderValue("Expiry Date");
            drinkTable.getColumnModel().getColumn(5).setHeaderValue("Price");
            drinkTable.getColumnModel().getColumn(6).setHeaderValue("Quantity In Stock");
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 710, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 720, 370));

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Arrival Date", "Expiry Date", "Price", "Quantity" }));
        searchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboBoxActionPerformed(evt);
            }
        });
        searchComboBox.setSelectedIndex(0);
        getContentPane().add(searchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 90, -1));

        minTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(minTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 320, -1));

        maxTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(maxTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 280, -1));

        jLabel3.setText("Enter Detail:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setText("Enter Maximum Price:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 610, -1));

        arrivalDateChooser.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(arrivalDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 610, -1));

        expiryDateChooser.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(expiryDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 610, -1));

        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchComboBoxActionPerformed

        if (searchComboBox.getSelectedItem() == "Name")
        {
            jLabel3.setText("Enter Name:");
            jLabel4.setVisible(false);
            jLabel3.setVisible(true);
            minTextField.setVisible(false);
            maxTextField.setVisible(false);
            jTextField3.setVisible(true);
            arrivalDateChooser.setVisible(false);
            expiryDateChooser.setVisible(false);
        }
        else if (searchComboBox.getSelectedItem() == "Arrival Date")
        {
            jLabel3.setText("Choose Arrival Date:");
            jLabel4.setVisible(false);
            jLabel3.setVisible(true);
            minTextField.setVisible(false);
            maxTextField.setVisible(false);
            jTextField3.setVisible(false);
            arrivalDateChooser.setVisible(true);
            expiryDateChooser.setVisible(false);
        }
        else if (searchComboBox.getSelectedItem() == "Expiry Date")
        {
            jLabel3.setText("Choose Expiry Date:");
            jLabel4.setVisible(false);
            jLabel3.setVisible(true);
            minTextField.setVisible(false);
            maxTextField.setVisible(false);
            jTextField3.setVisible(false);
            arrivalDateChooser.setVisible(false);
            expiryDateChooser.setVisible(true);
        }
        else if (searchComboBox.getSelectedItem() == "Price")
        {
            jLabel3.setText("Enter Minimum Price:");
            jLabel4.setText("Enter Maximum Price:");
            jLabel4.setVisible(true);
            jLabel3.setVisible(true);
            minTextField.setVisible(true);
            maxTextField.setVisible(true);
            jTextField3.setVisible(false);
            arrivalDateChooser.setVisible(false);
            expiryDateChooser.setVisible(false);
        }
        else if (searchComboBox.getSelectedItem() == "Quantity")
        {
            jLabel3.setText("Enter Minimum Quantity:");
            jLabel4.setText("Enter Maximum Quantity:");
            jLabel4.setVisible(true);
            jLabel3.setVisible(true);
            minTextField.setVisible(true);
            maxTextField.setVisible(true);
            jTextField3.setVisible(false);
            arrivalDateChooser.setVisible(false);
            expiryDateChooser.setVisible(false);
        }
        else if (searchComboBox.getSelectedItem() == "ID")
        {
            jLabel3.setText("Enter ID:");
            jLabel4.setVisible(false);
            jLabel3.setVisible(true);
            minTextField.setVisible(false);
            maxTextField.setVisible(false);
            jTextField3.setVisible(true);
            arrivalDateChooser.setVisible(false);
            expiryDateChooser.setVisible(false);
        }
    }//GEN-LAST:event_searchComboBoxActionPerformed
 
    
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed

        clearTable();
        int searchBy=searchComboBox.getSelectedIndex();
        ArrayList<Drink> result = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        switch (searchBy) {
            case 0:
            case 1:
                try {
                    result = manager.searchDrink(jTextField3.getText(), searchBy);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SearchDrinkForm.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case 2:
                try {
                    result = manager.searchDrink(sdf.format(arrivalDateChooser.getDate()), searchBy);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SearchDrinkForm.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case 3:
                try {
                    result = manager.searchDrink(sdf.format(expiryDateChooser.getDate()), searchBy);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SearchDrinkForm.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case 4:
                double maxPrice=Double.parseDouble(maxTextField.getText());
                double minPrice=Double.parseDouble(minTextField.getText());
                try {
                    result = manager.searchDrink(maxPrice,minPrice);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SearchDrinkForm.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case 5:
                int maxQty=Integer.parseInt(maxTextField.getText());
                int minQty=Integer.parseInt(minTextField.getText());
                try {
                    result = manager.searchDrink(maxQty,minQty);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SearchDrinkForm.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            default:
                break;
        }
        addRowtoJTable(result);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void minTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minTextFieldActionPerformed
        
    }//GEN-LAST:event_minTextFieldActionPerformed

    private void maxTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxTextFieldActionPerformed
        
    }//GEN-LAST:event_maxTextFieldActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null,"Are you sure to return to menu page?","Return",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        if (result == JOptionPane.YES_NO_OPTION ){
            this.setVisible(false);
        }
    }//GEN-LAST:event_returnBtnActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchDrinkForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchDrinkForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchDrinkForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchDrinkForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchDrinkForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser arrivalDateChooser;
    private javax.swing.JTable drinkTable;
    private com.toedter.calendar.JDateChooser expiryDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField maxTextField;
    private javax.swing.JTextField minTextField;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> searchComboBox;
    // End of variables declaration//GEN-END:variables
}