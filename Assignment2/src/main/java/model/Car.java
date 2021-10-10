/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;


/**
 *
 * @author Animal
 */
public class Car {
    private LocalDateTime availableTime;
    private String carBrand;
    private String carModel;
    private LocalDateTime manufactureTime;
    private int seatsForPassenger;
    private String serialNumber;
    private String availableCity;
    private LocalDateTime maintenanceExpireTime;
    
    private LocalDateTime carUpdateTime;


    public Car() {
        updateTime();
    }
    
    private void updateTime(){
        this.carUpdateTime = LocalDateTime.now();
    }
    

     
    public LocalDateTime getCarUpdateTime(){
        return carUpdateTime;
    }


    public LocalDateTime getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(LocalDateTime availableTime) {              
        this.availableTime = availableTime;
        updateTime();
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
        updateTime();
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
        updateTime();
    }

    public LocalDateTime getManufactureTime() {
        return manufactureTime;
    }

    public void setManufactureTime(LocalDateTime manufactureTime) {
        this.manufactureTime = manufactureTime;
        updateTime();
    }

    public int getSeatsForPassenger() {
        return seatsForPassenger;
    }

    public void setSeatsForPassenger(int seatsForPassenger) {
        this.seatsForPassenger = seatsForPassenger;
        updateTime();
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serial){
        this.serialNumber = serial;
    }

    public String getAvailableCity() {
        return availableCity;
    }

    public void setAvailableCity(String availableCity) {
        this.availableCity = availableCity;
        updateTime();
    }

    public LocalDateTime getMaintenanceExpireTime() {
        return maintenanceExpireTime;
    }

    public void setMaintenanceExpireTime(LocalDateTime maintenanceExpireTime) {
        this.maintenanceExpireTime = maintenanceExpireTime;
        updateTime();
    }
    @Override
    public String toString(){
        return serialNumber;
    }
}
