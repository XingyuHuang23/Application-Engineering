/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author raunak
 */
public class ResAdminRole extends Role{
    

    
    public JPanel createWorkArea(JSplitPane userProcessContainer, Restaurant account, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer,business,account);
    }

    @Override
    public JPanel createWorkArea(JPanel arg0, UserAccount arg1, EcoSystem arg2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
