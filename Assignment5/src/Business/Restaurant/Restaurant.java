/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Restaurant extends UserAccount{
     private String name;
    private int id;
    private static int count = 1;
    private Role role;
    
    private List<Food> menu;
    private List<Order> orders;
     
    public Restaurant() {
        id = count;
        count++;
        this.menu = new ArrayList<Food>();
        this.menu.add(new Food("pork",1));
        this.menu.add(new Food("beef",2));
        this.menu.add(new Food("banana",3));
    }
    
    public List<Food> getMenu() {
        return menu;
    }
    
    public void addFood(String name,int price){
       Food food = new Food(name,price);
      this.menu.add(food);
    }

    public void setMenu(List<Food> menu) {
        this.menu = menu;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
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
