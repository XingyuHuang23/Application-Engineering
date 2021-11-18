/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Animal
 */
public class Order {
    private HashMap<String,Integer> menu;
    private String deliver;
    private String customer;
    private String restaurant;
    private String status;
    private String orderId;
    private int totalPrice;
    public Order(HashMap<String,Integer> menu,String customer,String restuarnt,String status,int price){
            this.menu = menu;
            this.customer =customer;
            this.restaurant = restuarnt;
            this.status = status;
            this.orderId = UUID.randomUUID().toString().substring(0,5);
            this.deliver = "waiting...";
            this.totalPrice = price;
    }
    
    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
       public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        orderId = orderId;
    }
                    
      public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }               
    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public HashMap<String,Integer> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String,Integer> menu) {
        this.menu = menu;
    }

    public String getDeliver() {
        return deliver;
    }

    public void setDeliver(String deliver) {
        this.deliver = deliver;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    
}
