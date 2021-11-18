/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Animal
 */
public class OrderDirectory {
     private ArrayList<Order> orderList;

     public OrderDirectory() {
        this.orderList = new ArrayList();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
     public Order createOrder(ArrayList<Order> orderList,Order order){
        
        orderList.add(order);
        
        return order;
    }

    public Order getOrderByOrderId(String OrderId,ArrayList<Order> orderList){
                
                 for(Order order:orderList){ 
                    if(order.getOrderId().equals(OrderId)){      
                           return order;
                    }      
                 }
                
               return  null;
    }
    
    public List<Order> getOrderListByUser(String user,ArrayList<Order> orderList){
                List<Order> list = new ArrayList<Order>();
                 for(Order order:orderList){ 
                    if(order.getCustomer().equals(user)){      
                           list.add(order);
                    }      
                 }     
               return  list;
    }
    
     public List<Order> getOrderListByRest(String rest,ArrayList<Order> orderList){
                List<Order> list = new ArrayList<Order>();
                 for(Order order:orderList){ 
                    if(order.getRestaurant().equals(rest)){      
                           list.add(order);
                    }      
                 }     
               return  list;
    }
    public Order getOrderListById(String id,ArrayList<Order> orderList){      
                 for(Order order:orderList){ 
                    if(order.getOrderId().equals(id)){      
                           return order;
                    }      
                 }     
               return  null;
    }
    
    public Order setOrderDeliver(String id,String deliver,ArrayList<Order> orderList){      
                 for(Order order:orderList){ 
                    if(order.getOrderId().equals(id)){ 
                            order.setDeliver(deliver);  
                            order.setStatus("On the way");
                           return order;
                    }      
                 }     
               return  null;
    }
}
