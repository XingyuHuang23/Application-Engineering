/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;

/**
 *
 * @author harold
 */
public class DeliverManRole extends Role {

 
    public JPanel createWorkArea(JSplitPane userProcessContainer, UserAccount account, EcoSystem business) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JPanel createWorkArea(JPanel arg0, UserAccount arg1, EcoSystem arg2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
