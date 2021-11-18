/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
       private ArrayList<DeliveryMan> deliverManList;

    public DeliveryManDirectory() {
        deliverManList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliverManList;
    }
    
    public DeliveryMan createDeliveryMan(String name,ArrayList<DeliveryMan> deliverList){
        DeliveryMan deliver = new DeliveryMan();
        deliver.setName(name);
        deliverList.add(deliver);
        return deliver;
    }
}
