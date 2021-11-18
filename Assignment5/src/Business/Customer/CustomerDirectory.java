/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.CustomerRole;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
     private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer createCustomer(String name,ArrayList<Customer> customerList){
        Customer customer = new Customer();
        customer.setName(name);
        customerList.add(customer);
        return customer;
    }
   
    
}
