/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Customer extends UserAccount{
     private String name;
    private int id;
    private static int count = 1;
    private Role role;
    
    public Customer() {
        id = count;
        count++;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
