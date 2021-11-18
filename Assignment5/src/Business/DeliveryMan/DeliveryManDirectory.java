/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Customer.Customer;
import Business.Order.Order;
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

    public DeliveryMan setDeliverWork(String orderId, String name, ArrayList<DeliveryMan> deliveryManList) {
             for(DeliveryMan deliver:deliveryManList){      
                    if(deliver.getName().equals(name)){ 
                            deliver.getOrders().add(orderId);
                            deliver.setStatus("working");
                             return deliver; 
                    }      
                 } 
            return null; 
    }

    public void cancelOrFinishedDrliver(String name,String orderId, ArrayList<DeliveryMan> deliveryManList) {
              for(DeliveryMan deliver:deliveryManList){      
                    if(deliver.getName().equals(name)){ 
                           deliver.getOrders().remove(orderId);
                           if(deliver.getOrders().size()==0)  deliver.setStatus("waiting");     
                           break;
                    }      
                 } 
    }
   
}
