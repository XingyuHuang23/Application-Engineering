/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;

import model.HospitalSystem;
import model.Patient;
import model.Person;
/**
 *
 * @author Animal
 */
public class CreatePanel extends javax.swing.JPanel {

//     private CarFleet fleet;
     int highAbnormal = 150;
     int lowAbnormal = 60;
    
    /**
     * Creates new form CreatPanel
     */
    public CreatePanel() {
        initComponents();
    }
    
//    public CreatePanel(CarFleet fleet){
//        this.fleet = fleet;
//        initComponents();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblManufacTime = new javax.swing.JLabel();
        lblSeats = new javax.swing.JLabel();
        lblSerial = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblAvailTime = new javax.swing.JLabel();
        lblMaintExpTime = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        txtBlood = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtHouse = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        labelResult = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Person Information");

        lblBrand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBrand.setText("Name:");
        lblBrand.setPreferredSize(new java.awt.Dimension(15, 15));

        lblModel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblModel.setText("Age:");

        lblManufacTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblManufacTime.setText("City:");

        lblSeats.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSeats.setText("Community:");

        lblSerial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("BloodPressure:");

        lblAvailTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAvailTime.setText("House:");

        txtName.setToolTipText("");
        txtName.setAlignmentX(1.0F);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityActionPerformed(evt);
            }
        });

        txtBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblManufacTime, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSerial)
                            .addComponent(lblMaintExpTime)
                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBlood, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCity, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSeats)
                            .addComponent(lblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAvailTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(labelResult))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAvailTime, lblBrand, lblMaintExpTime, lblSeats, lblSerial});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModel)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacTime)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeats)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblSerial))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBlood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity)
                            .addComponent(lblAvailTime))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMaintExpTime)
                .addGap(37, 37, 37)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean timeValid(String s){
        if(Integer.valueOf(s.split(" ")[1])>=24) return false;
             
        return s.matches("\\d{2}/\\d{2}/\\d{4} \\d{2}");
    }
  
    private boolean isValidBrand(String s){
        return s.matches("^[A-Za-z0-9]+$");
    }
    private boolean isValidCity(String s){
        return s.matches("^[A-Za-z0-9]+$");
    }
    private boolean isValidModel(String s){
        return s.matches("^[A-Za-z0-9]+$");
    }
    private boolean isValidSeats(String s){
        return s.matches("\\d") || s.matches("\\d{2}");
    }
//    private boolean isValidSerial(String s){
//        ArrayList<Car> carList = fleet.getCarList();
//        for(int i = 0;i < carList.size(); i++){
//            if (s.equals(carList.get(i).getSerialNumber())){
//                return false;
//            }
//        }
//        return s.matches("^[A-Za-z0-9]+$");
//    }
    
    private boolean isValid(String s){
        return s.matches("^[A-Za-z0-9]+$");
    }
     private boolean isValidString(String s){
        return s.matches("^[a-zA-Z]*$");
    }
     private boolean isValidInt(String s){
        return s.matches("^[0-9]*$");
    }
      private boolean isValidName(String s){
       for(Person p: HospitalSystem.PersonsDirectory){
            if(p.getName().equals(s)){
              return false;
            }
        }
        return true;
    }
            
    private boolean typeCheck(){
        boolean flag = true;
        String check;
        
     
        if(!isValid(txtHouse.getText())){
            txtHouse.setText("");
            flag = false;
        }
        
          
        
        if(!isValidString(txtName.getText())){
            txtName.setText("");
            flag = false;
        }
       
        if(!isValidString(txtCity.getText())){
            txtCity.setText("");
            flag = false;
        }
        
        if(!isValidInt(txtAge.getText())){
            txtAge.setText("");
            flag = false;
        }
        
        if(!isValid(txtCommunity.getText())){
            txtCommunity.setText("");
            flag = false;
        }
        if(!isValidInt( txtBlood.getText())){
            txtBlood.setText("");
            flag = false;
        }
        return flag;
    }
public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(!isValidName(txtName.getText())){
            txtName.setText("");
            infoBox("Name exist! please check", "Invalid");
            return;
        }
        if(typeCheck()){
   
        int blood = Integer.valueOf(txtBlood.getText());
        
        if(blood > highAbnormal || blood < lowAbnormal){
            List<String> encouterHistory = new ArrayList<>();
            String vitalSign = UUID.randomUUID().toString().substring(0,5) +"-"+txtName.getText();
            encouterHistory.add(vitalSign);
            
            Patient patient = new Patient(txtName.getText(),txtHouse.getText(),txtCity.getText(),txtCommunity.getText(),Integer.valueOf(txtAge.getText()),blood,encouterHistory);
             
             HospitalSystem.PatientDirectory.add(patient);
             HospitalSystem.PersonsDirectory.add(patient);
             labelResult.setText("Information Collected! Your blood pressure is abnormal, your vitalSign is " + vitalSign);
        }else{
          
            HospitalSystem.PersonsDirectory.add(new Person(txtName.getText(),txtHouse.getText(),txtCity.getText(),txtCommunity.getText(),Integer.valueOf(txtAge.getText()),blood));
            labelResult.setText("Information Collected! Your blood pressureis normal, keep it!");
        }
 
        
        infoBox("Saved successfully", "Success");
        
        txtHouse.setText("");
        txtName.setText("");    
        txtCity.setText("");        
        txtAge.setText("");    
        txtCommunity.setText("");
        txtBlood.setText("");
        }else {
            infoBox("Invalid data type, please check", "Invalid");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityActionPerformed

    private void txtBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel labelResult;
    private javax.swing.JLabel lblAvailTime;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblMaintExpTime;
    private javax.swing.JLabel lblManufacTime;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSerial;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBlood;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

}
