/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Animal
 */
public class Patient extends Person {
        
      public List<String> getEncouterHistory() {
        return encouterHistory;
    }

    public void setEncouterHistory(List<String> encouterHistory) {
        this.encouterHistory = encouterHistory;
    }
    
    private List<String> encouterHistory;
        public Patient(String name, String house, String city, String community,int age,int bloodPressure,List<String> encouterHistory) {
            super(name,house,city,community,age,bloodPressure);
       
            this.encouterHistory = encouterHistory;
        
    }
        
     private void addEncounterHistory(String vitalSigns) {
            
            this.encouterHistory.add(vitalSigns);
    }
}
