/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory() {
        this.restaurantList = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }
    
    public Restaurant createRestaurantList(String name,ArrayList<Restaurant> restaurantList,Employee employee){
        Restaurant restaurant = new Restaurant();
        restaurant.setName(name);
        restaurant.setEmployee(employee);
        restaurantList.add(restaurant);
        
        return restaurant;
    }

    public Restaurant getInstanceByName(String name,ArrayList<Restaurant> restaurantList){
                 Restaurant rest = null;
        
                 for(Restaurant res:restaurantList){ 
                    if(res.getName().equals(name)){      
                            rest = res;
                            break;
                    }      
                 }
                
               return  rest;
    }
}
