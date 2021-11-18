/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JSplitPane userProcessContainer, UserAccount account, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }

    @Override
    public JPanel createWorkArea(JPanel arg0, UserAccount arg1, EcoSystem arg2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
