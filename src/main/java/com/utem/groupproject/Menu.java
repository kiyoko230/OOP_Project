/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.utem.groupproject;

import javax.swing.JOptionPane;

/**
 *
 * @author mangy
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        addMenu = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        restockMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        propertiesMenuItem = new javax.swing.JMenuItem();
        deleteItem = new javax.swing.JMenuItem();
        searchMenu = new javax.swing.JMenu();
        foodMenuItem = new javax.swing.JMenuItem();
        drinkMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        displayMenuItem = new javax.swing.JMenuItem();
        sortMenuItem = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grocery Inventory System");

        jMenuBar1.setBackground(new java.awt.Color(204, 0, 255));

        addMenu.setIcon(new javax.swing.ImageIcon("D:\\mangy\\Documents\\Sem 3\\OOP\\GUIProject\\GroupProject\\src\\main\\src\\plus.png")); // NOI18N
        addMenu.setText("Add");

        newMenuItem.setText("New Item");
        newMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuItemActionPerformed(evt);
            }
        });
        addMenu.add(newMenuItem);

        restockMenuItem.setText("Restock Item");
        addMenu.add(restockMenuItem);

        jMenuBar1.add(addMenu);

        editMenu.setIcon(new javax.swing.ImageIcon("D:\\mangy\\Documents\\Sem 3\\OOP\\GUIProject\\GroupProject\\src\\main\\src\\pencil.png")); // NOI18N
        editMenu.setText("Edit");

        propertiesMenuItem.setText("Item's Properties");
        editMenu.add(propertiesMenuItem);

        deleteItem.setText("Delete Item");
        editMenu.add(deleteItem);

        jMenuBar1.add(editMenu);

        searchMenu.setIcon(new javax.swing.ImageIcon("D:\\mangy\\Documents\\Sem 3\\OOP\\GUIProject\\GroupProject\\src\\main\\src\\loupe.png")); // NOI18N
        searchMenu.setText("Search");

        foodMenuItem.setText("Food");
        searchMenu.add(foodMenuItem);

        drinkMenuItem.setText("Drink");
        searchMenu.add(drinkMenuItem);

        jMenuBar1.add(searchMenu);

        viewMenu.setIcon(new javax.swing.ImageIcon("D:\\mangy\\Documents\\Sem 3\\OOP\\GUIProject\\GroupProject\\src\\main\\src\\view.png")); // NOI18N
        viewMenu.setText("View");

        displayMenuItem.setText("Display");
        viewMenu.add(displayMenuItem);

        sortMenuItem.setText("Sort");
        viewMenu.add(sortMenuItem);

        jMenuBar1.add(viewMenu);

        exitMenu.setIcon(new javax.swing.ImageIcon("D:\\mangy\\Documents\\Sem 3\\OOP\\GUIProject\\GroupProject\\src\\main\\src\\remove.png")); // NOI18N
        exitMenu.setText("Exit");
        exitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(exitMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMouseClicked
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null,"Are you sure to exit?","Exit",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if (result == JOptionPane.YES_NO_OPTION ){
            System.exit(0);
        }
    }//GEN-LAST:event_exitMenuMouseClicked

    private void newMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuItemActionPerformed
        // TODO add your handling code here:
        new AddForm().setVisible(true);
    }//GEN-LAST:event_newMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu addMenu;
    private javax.swing.JMenuItem deleteItem;
    private javax.swing.JMenuItem displayMenuItem;
    private javax.swing.JMenuItem drinkMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JMenuItem foodMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JMenuItem propertiesMenuItem;
    private javax.swing.JMenuItem restockMenuItem;
    private javax.swing.JMenu searchMenu;
    private javax.swing.JMenuItem sortMenuItem;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables
}
