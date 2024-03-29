

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
//   private  JPanel userProcessContainer;
   private  EcoSystem ecosystem;
   private JSplitPane splitPanel;
   private UserAccount ua;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JSplitPane splitPanel,EcoSystem ecosystem,UserAccount ua) {
        initComponents();
        //this.userProcessContainer = userProcessContainer;
        
        this.ecosystem = ecosystem;
        this.splitPanel = splitPanel;
        this.ua = ua;
        
        restaName.setText(ua.getEmployee().getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        restaName = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        userJButton.setText("Check comments");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 180, -1));

        manageEmployeeJButton.setText("Manage menu");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 150, -1));

        manageOrganizationJButton.setText("Manage Orders");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        restaName.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        restaName.setText("<value>");
        add(restaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
                Restaurant rest = ecosystem.getRestaurantDirectory().getInstanceByName(ua.getUsername(),ecosystem.getRestaurantDirectory().getRestaurantList());
               
                CommentCheck commentCheck = new CommentCheck(splitPanel,rest,ecosystem);
                splitPanel.setRightComponent(commentCheck);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
                

                Restaurant rest = ecosystem.getRestaurantDirectory().getInstanceByName(ua.getUsername(),ecosystem.getRestaurantDirectory().getRestaurantList());
               
                MenuManage menu = new MenuManage(splitPanel,ecosystem,rest);
                splitPanel.setRightComponent(menu);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
                Restaurant rest = ecosystem.getRestaurantDirectory().getInstanceByName(ua.getUsername(),ecosystem.getRestaurantDirectory().getRestaurantList());
               
                OrderManage order = new OrderManage(ecosystem,splitPanel,rest);
                splitPanel.setRightComponent(order);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JLabel restaName;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
    
}
