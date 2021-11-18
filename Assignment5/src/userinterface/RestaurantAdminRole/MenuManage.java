/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Food;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.ResAdminRole;
import Business.Role.Role.RoleType;
import Business.UserAccount.UserAccount;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Animal
 */
public class MenuManage extends javax.swing.JPanel {

   
    private EcoSystem ecosystem;
   
    private RoleType roleType;
    
    private List<UserAccount> roleList ;
     private Restaurant ua;
    private List<UserAccount> list;
    private List<Food> menuList;
    private JSplitPane splitPanel;
    /**
     * Creates new form ViewPanel
     */
    /*
 
    /**
     * @param fleet
     */

    public MenuManage(JSplitPane splitPanel,EcoSystem ecosystem,Restaurant ua){
        this.ecosystem = ecosystem;
        // ecosystem.getUserAccountDirectory().getKeyRole(roleType); //仅供当前页面方便展现使用
        
        
        this.ua = ua;
        
        this.menuList = this.ua.getMenu(); 
        this.splitPanel = splitPanel;
        
        initComponents();
        
        preWork(this.ua);
       // System.out.print(list.size()+"进入时的size");
       
    }

      
    private void preWork(Restaurant ua){

        //lblView.setText(ua.getEmployee().getName() + " Information Panel");
         populateTable(this.menuList);
    }
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblView = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonView = new javax.swing.JTable();
        lblFindByBrand = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JLabel();
        txtFood = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        txtPrice = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        txtRole = new javax.swing.JLabel();

        lblView.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblView.setText("Menu Panel");

        tblPersonView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Food", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersonView);

        jLabel1.setText("Food:");

        priceTxt.setText("Price:");

        txtFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoodActionPerformed(evt);
            }
        });

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblFindByBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFood, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(priceTxt)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(104, 104, 104)
                            .addComponent(txtRole)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(priceTxt)
                    .addComponent(txtFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRole))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFindByBrand)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(back))
                .addContainerGap(160, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   
     private boolean isValid(String s){
        return s.matches("^[A-Za-z0-9]+$");
    }
     private boolean isValidString(String s){
        return s.matches("^[a-zA-Z]*$");
    }
     private boolean isValidInt(String s){
        return s.matches("^[0-9]*$");
    }
    private boolean isValidFoodName(String s){
  
        for(Food food: ua.getMenu()){
            if(s.equals(food.getName())) return false;
        }
        
        return true;
    }
    
    private boolean typeCheck(){
        boolean flag = true;
        String check;

        if(!isValidString(txtFood.getText())){
            txtFood.setText("");
            flag = false;
        }
        if(!isValidFoodName(txtFood.getText())){
            txtFood.setText("");
            flag = false;
         }
        if(!isValidInt(txtPrice.getText())){
            txtPrice.setText("");
            flag = false;
         }
        return flag;
    }
    
    private void txtFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoodActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if(typeCheck()){
            String food  = txtFood.getText();
            int price = Integer.valueOf(txtPrice.getText());

             ua.addFood(food,price);
             populateTable(ua.getMenu());
            infoBox("Information collect!", "valid");
            
            txtFood.setText("");
            txtPrice.setText("");
            
        }else{
            infoBox("food name exist!!!", "invalid");
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
                
                UserAccount user = ecosystem.getUserAccountDirectory().getUserAccountByName(ua.getName());
                AdminWorkAreaJPanel adminPanel = new AdminWorkAreaJPanel(splitPanel,ecosystem,user);
                splitPanel.setRightComponent(adminPanel);
            // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFindByBrand;
    private javax.swing.JLabel lblView;
    private javax.swing.JLabel priceTxt;
    private javax.swing.JTable tblPersonView;
    private javax.swing.JTextField txtFood;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JLabel txtRole;
    // End of variables declaration//GEN-END:variables

   
    
    public void populateTable(List<Food> list){

        DefaultTableModel personModel = (DefaultTableModel) tblPersonView.getModel();
        personModel.setRowCount(0);
        
         for(Food food:list){
            Object[] row = new Object[2];
               
            row[0] = food.getName();
            row[1] = food.getPrice();

            personModel.addRow(row);
         }
    }
   
    
}
