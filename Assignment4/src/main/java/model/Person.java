package model;
import java.util.List;
import model.Patient;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Animal
 */
public class Person{
    
    private String name;
    private String city;
    private String community;
    private String house;
    private int age;
    private int bloodPressure;
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
   
    
    public Person() {
    }
    
     public Person(String name, String house, String city, String community,int age,int bloodPressure) {
        this.name = name;
        this.house = house;
        this.city = city;
        this.community = community;
        this.age = age;
        this.bloodPressure = bloodPressure;
    }

  
  
    
}
