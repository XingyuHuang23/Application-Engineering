/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.EcoSystem;
import Business.Order.Order;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import static userinterface.RestaurantAdminRole.OrderManage.infoBox;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount ua;
    private JSplitPane splitPanel;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JSplitPane jsplitPanel, UserAccount ua, EcoSystem ecosystem) {
        initComponents();
        
        //this.userProcessContainer = userProcessContainer;
        this.splitPanel = jsplitPanel;
        this.ua = ua;
        this.ecosystem = ecosystem;
      
        
        populateTable();
    }
    
    public void populateTable(){
        
 
        DefaultTableModel orderModel = (DefaultTableModel) JTableOrderList.getModel();
     
        orderModel.setRowCount(0);
           
        List<Order> list = ecosystem.getOrderDirectory().getOrderListByDeliver(ua.getUsername(), ecosystem.getOrderDirectory().getOrderList());
         
          for(Order order:list){
            Object[] row = new Object[4];
            row[0] = order.getOrderId();
            row[1] = order.getRestaurant();
            row[2] = order.getCustomer();
            row[3] = order.getStatus();
          
            orderModel.addRow(row);
         }
    }
 public void populateTable(Order order){
        
 
        DefaultTableModel orderModel = (DefaultTableModel) JTableOrderList.getModel();
     
        orderModel.setRowCount(0);
           
            Object[] row = new Object[4];
            row[0] = order.getOrderId();
            row[1] = order.getRestaurant();
            row[2] = order.getCustomer();
            row[3] = order.getStatus();
          
            orderModel.addRow(row);
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableOrderList = new javax.swing.JTable();
        finish = new javax.swing.JButton();
        Find = new javax.swing.JButton();
        ListAll = new javax.swing.JButton();
        orderIdText = new javax.swing.JTextField();
        orderIdShow = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTableOrderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order id", "Restaurant", "Customer", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableOrderList);
        if (JTableOrderList.getColumnModel().getColumnCount() > 0) {
            JTableOrderList.getColumnModel().getColumn(0).setResizable(false);
            JTableOrderList.getColumnModel().getColumn(1).setResizable(false);
            JTableOrderList.getColumnModel().getColumn(2).setResizable(false);
            JTableOrderList.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 375, 96));

        finish.setText("Finish ");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });
        add(finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 80, -1));

        Find.setText("Find");
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });
        add(Find, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 70, 30));

        ListAll.setText("List all");
        ListAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListAllActionPerformed(evt);
            }
        });
        add(ListAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 90, 30));

        orderIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIdTextActionPerformed(evt);
            }
        });
        add(orderIdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 120, 30));

        orderIdShow.setText(" id");
        add(orderIdShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jLabel4.setText("order id");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 60, 30));

        jLabel5.setText("order id :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed

        String orderId = orderIdShow.getText();
        
        if (orderId != "id"){
               ecosystem.getOrderDirectory().setOrderFinished(orderId, ecosystem.getOrderDirectory().getOrderList());
               ecosystem.getDeliveryManDirectory().cancelOrFinishedDrliver(ua.getUsername(),orderId,ecosystem.getDeliveryManDirectory().getDeliveryManList());
               populateTable();
               infoBox("Order finished!!", "Success");
        }
    }//GEN-LAST:event_finishActionPerformed
   private boolean isValid(String s){
        return s.matches("^[A-Za-z0-9]+$");
    }
     private boolean isValidString(String s){
        return s.matches("^[a-zA-Z]*$");
    }
     private boolean isValidInt(String s){
        return s.matches("^[0-9]*$");
    }
     
    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed
              String id = orderIdText.getText();
        
        if(!isValid(id)){
              infoBox("Invalid Id data type, please check", "Invalid"); return;
         } 
        
        Order order = ecosystem.getOrderDirectory().getOrderByOrderId(id, ecosystem.getOrderDirectory().getOrderList());
        if(order != null){
              populateTable(order);
              showInformation(order);     
        }else{
           infoBox("Id not exist, please check", "Invalid"); return;
        }
    
    }//GEN-LAST:event_FindActionPerformed
     private void showInformation(Order order) {
             if(order!=null){
                 orderIdShow.setText(order.getOrderId()); 
             }
    }
    private void ListAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListAllActionPerformed
                
            populateTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_ListAllActionPerformed

    private void orderIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIdTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Find;
    private javax.swing.JTable JTableOrderList;
    private javax.swing.JButton ListAll;
    private javax.swing.JButton finish;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orderIdShow;
    private javax.swing.JTextField orderIdText;
    // End of variables declaration//GEN-END:variables
}
