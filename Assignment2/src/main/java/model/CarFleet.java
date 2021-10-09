/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Zhen
 */
public class CarFleet {
    private LocalDateTime fleetUpdateTime;
    final private ArrayList<Car> carList;
    
    public CarFleet(){
        carList = new ArrayList<>();
        updateTime();
    }
    
    /**
     * @param car
     * @return 
     */
    public boolean remove(Car car){
        if (carList.remove(car)){
            updateTime();
            return true;
        } else{
            return false;
        }
    }
    
    private void updateTime(){
        fleetUpdateTime = LocalDateTime.now();
    }
    
    /**
     * @param car
     * @return 
     */
    public boolean add(Car car){
        if (carList.add(car)){
            updateTime();
            return true;
        } else{
            return false;
        }
    }
    
    public ArrayList<Car> getCarList() {
        return carList;
    }

    public LocalDateTime getFleetUpdateTime() {
        return fleetUpdateTime;
    }
    
}