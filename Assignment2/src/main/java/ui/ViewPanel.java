/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarFleet;
import static ui.CreatePanel.infoBox;

/**
 *
 * @author Zhen
 */
public class ViewPanel extends javax.swing.JPanel {

    CarFleet fleet;
    
    /**
     * Creates new form ViewPanel
     */
    /*
    public ViewPanel() {
        initComponents();
    }*/
    /**
     * @param fleet
     */
    public ViewPanel(CarFleet fleet){
        this.fleet = fleet;
        initComponents();
        populateTable(fleet.getCarList());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewCar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnFirstAviaCar = new javax.swing.JButton();
        btnAvailNumb = new javax.swing.JButton();
        txtAvailNumb = new javax.swing.JTextField();
        lblUnavail = new javax.swing.JLabel();
        txtUnAvailNumb = new javax.swing.JTextField();
        lblAvail = new javax.swing.JLabel();
        btnFindByBrand = new javax.swing.JButton();
        txtFindByBrand = new javax.swing.JTextField();
        lblFindByBrand = new javax.swing.JLabel();
        btnFindBySeats = new javax.swing.JButton();
        lblFindSeatsLow = new javax.swing.JLabel();
        txtFindSeatsLow = new javax.swing.JTextField();
        lblFindSeatsHigh = new javax.swing.JLabel();
        txtFindSeatsHigh = new javax.swing.JTextField();
        btnFindBySerial = new javax.swing.JButton();
        lblFindBySerial = new javax.swing.JLabel();
        txtFindBySerial = new javax.swing.JTextField();
        btnFindByModel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFindByModel = new javax.swing.JTextField();
        btnLastUpdateTime = new javax.swing.JButton();
        txtLastUpdateTime = new javax.swing.JTextField();
        btnFindByCity = new javax.swing.JButton();
        lblFindByCity = new javax.swing.JLabel();
        txtFindByCity = new javax.swing.JTextField();
        btnFindByExpiredMaintenance = new javax.swing.JButton();
        btnListManufactures = new javax.swing.JButton();
        btnListAll = new javax.swing.JButton();

        lblViewCar.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblViewCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewCar.setText("View Car");

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial Number", "Brand", "Model", "Avai Time", "Manuf Time", "Seats", "Avai City", "M-Expire Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblView);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFirstAviaCar.setText("First Avail Car");
        btnFirstAviaCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAviaCarActionPerformed(evt);
            }
        });

        btnAvailNumb.setText("Available Number");
        btnAvailNumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailNumbActionPerformed(evt);
            }
        });

        lblUnavail.setText("Unavailable:");

        lblAvail.setText("Available:");

        btnFindByBrand.setText("Find By Brand");
        btnFindByBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindByBrandActionPerformed(evt);
            }
        });

        txtFindByBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindByBrandActionPerformed(evt);
            }
        });

        lblFindByBrand.setText("Brand:");

        btnFindBySeats.setText("Find by seats");
        btnFindBySeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindBySeatsActionPerformed(evt);
            }
        });

        lblFindSeatsLow.setText("From:");

        txtFindSeatsLow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindSeatsLowActionPerformed(evt);
            }
        });

        lblFindSeatsHigh.setText("To:");

        btnFindBySerial.setText("Find By Serail");
        btnFindBySerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindBySerialActionPerformed(evt);
            }
        });

        lblFindBySerial.setText("Serial Number:");

        btnFindByModel.setText("Find By Model");
        btnFindByModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindByModelActionPerformed(evt);
            }
        });

        jLabel1.setText("Model Number:");

        btnLastUpdateTime.setText("Last Update Time");
        btnLastUpdateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastUpdateTimeActionPerformed(evt);
            }
        });

        btnFindByCity.setText("Find By City");
        btnFindByCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindByCityActionPerformed(evt);
            }
        });

        lblFindByCity.setText("City:");

        btnFindByExpiredMaintenance.setText("Find Expired Maintenance");
        btnFindByExpiredMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindByExpiredMaintenanceActionPerformed(evt);
            }
        });

        btnListManufactures.setText("List All Manufactures");
        btnListManufactures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListManufacturesActionPerformed(evt);
            }
        });

        btnListAll.setText("List All");
        btnListAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblViewCar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnFindBySeats, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFindSeatsLow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFindSeatsLow, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFindSeatsHigh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFindSeatsHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFindBySerial, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnFirstAviaCar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFindByBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFindByBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFindByBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnAvailNumb, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnFindByCity, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFindByCity)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFindByCity))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnFindByModel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFindByModel)))
                                .addGap(133, 133, 133)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnListManufactures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLastUpdateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFindBySerial)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFindBySerial, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAvail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAvailNumb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblUnavail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUnAvailNumb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(53, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtLastUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnFindByExpiredMaintenance)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnListAll, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAvailNumb, btnFindBySerial, btnLastUpdateTime, btnListManufactures});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblViewCar)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirstAviaCar)
                    .addComponent(btnFindByBrand)
                    .addComponent(txtFindByBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFindByBrand)
                    .addComponent(btnAvailNumb)
                    .addComponent(lblAvail)
                    .addComponent(txtAvailNumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnavail)
                    .addComponent(txtUnAvailNumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindBySeats)
                    .addComponent(lblFindSeatsLow)
                    .addComponent(txtFindSeatsLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFindSeatsHigh)
                    .addComponent(txtFindSeatsHigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindBySerial)
                    .addComponent(lblFindBySerial)
                    .addComponent(txtFindBySerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindByModel)
                    .addComponent(jLabel1)
                    .addComponent(txtFindByModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastUpdateTime)
                    .addComponent(txtLastUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindByCity)
                    .addComponent(lblFindByCity)
                    .addComponent(txtFindByCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindByExpiredMaintenance)
                    .addComponent(btnListManufactures)
                    .addComponent(btnListAll))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblView.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model  = (DefaultTableModel) tblView.getModel();
        Car deleteCar = (Car) model.getValueAt(selectedRow,0);
        if(fleet.remove(deleteCar)){
            JOptionPane.showMessageDialog(this, "Car deleted.");
        }else{
            JOptionPane.showMessageDialog(this,"Delete Fail.");
        }
        populateTable(fleet.getCarList());
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFirstAviaCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAviaCarActionPerformed
        // TODO add your handling code here:
        CarFleet target = new CarFleet();
        Car tempCar = new Car();
        LocalDateTime nowTime = LocalDateTime.now();
        Duration duration = Duration.between(LocalDateTime.MIN, LocalDateTime.MAX);
        ArrayList<Car> carList = fleet.getCarList();
        for(int i = 0; i < carList.size();i++){
            Duration dur = Duration.between(nowTime, carList.get(i).getAvailableTime());
            int val = duration.compareTo(dur);
            if(val > 0){
                duration = dur;
                tempCar = carList.get(i);
            }
        }
        target.add(tempCar);
        populateTable(target.getCarList());
    }//GEN-LAST:event_btnFirstAviaCarActionPerformed

    private void btnFindByBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindByBrandActionPerformed
        // TODO add your handling code here:
        String targetBrand = txtFindByBrand.getText();
         if(!typeCheck(targetBrand)){
              infoBox("Invalid Brand data type, please check", "Invalid"); return;
         }
        CarFleet target = new CarFleet();
        ArrayList<Car> carList = fleet.getCarList();
        
        for(int i = 0; i < carList.size();i++){
            if(carList.get(i).getCarBrand().equals(targetBrand)){
                target.add(carList.get(i));
            }
        }
        populateTable(target.getCarList());
    }//GEN-LAST:event_btnFindByBrandActionPerformed

    private void txtFindSeatsLowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindSeatsLowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindSeatsLowActionPerformed

    private void btnAvailNumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailNumbActionPerformed
        // TODO add your handling code here:
        Duration dur;
        LocalDateTime nowTime = LocalDateTime.now();
        CarFleet target = new CarFleet();
        int avail = 0;
        int unAvail = 0;
        ArrayList<Car> carList = fleet.getCarList();
        for(int i = 0; i < carList.size();i++){
            dur = Duration.between(nowTime, carList.get(i).getAvailableTime());
            if(dur.toSeconds() > 0){
                avail++;
            }else{
                unAvail++;
            }
        }
        txtAvailNumb.setText(String.valueOf(avail));
        txtUnAvailNumb.setText(String.valueOf(unAvail));
    }//GEN-LAST:event_btnAvailNumbActionPerformed

    private void btnFindBySeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindBySeatsActionPerformed
        // TODO add your handling code here:
        CarFleet target = new CarFleet();
        int seatsLow = -1;
        int seatsHigh= -1;
        try{
            seatsLow = Integer.parseInt(txtFindSeatsLow.getText());
           seatsHigh = Integer.parseInt(txtFindSeatsHigh.getText());
        }catch(Exception e){
            infoBox("Invalid Seats data type, please check", "Invalid");
        }
         if(seatsLow>seatsHigh) {
          infoBox("Invalid Seats data entry, please check", "Invalid");
          return;
         }
        ArrayList<Car> carList = fleet.getCarList();
        for(int i = 0; i < carList.size();i++){
            if(carList.get(i).getSeatsForPassenger() <= seatsHigh  
                    && carList.get(i).getSeatsForPassenger() >= seatsLow){
                target.add(carList.get(i));
            }
        }
        populateTable(target.getCarList());
    }//GEN-LAST:event_btnFindBySeatsActionPerformed

    private void btnFindBySerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindBySerialActionPerformed
        // TODO add your handling code here:
          String targetSerial = txtFindBySerial.getText();
        
         if(!typeCheck(targetSerial)){
              infoBox("Invalid SerialNum data type, please check", "Invalid"); return;
         }
       
        CarFleet target = new CarFleet();
        ArrayList<Car> carList = fleet.getCarList();
      
        for(int i = 0; i < carList.size();i++){
            if(carList.get(i).getSerialNumber().equals(targetSerial)){
                target.add(carList.get(i));
            }
        }
        populateTable(target.getCarList());
    }//GEN-LAST:event_btnFindBySerialActionPerformed

    private void btnFindByModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindByModelActionPerformed
        // TODO add your handling code here:
         String targetModel = txtFindByModel.getText();
          if(!typeCheck(targetModel)){
              infoBox("Invalid Model data type, please check", "Invalid"); return;
         }
       
        CarFleet target = new CarFleet();
        ArrayList<Car> carList = fleet.getCarList();
       
        for(int i = 0; i < carList.size();i++){
            if(carList.get(i).getCarModel().equals(targetModel)){
                target.add(carList.get(i));
            }
        }
        populateTable(target.getCarList());
    }//GEN-LAST:event_btnFindByModelActionPerformed

    private void btnLastUpdateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastUpdateTimeActionPerformed
        // TODO add your handling code here:
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH");
        txtLastUpdateTime.setText(fleet.getFleetUpdateTime().format(formatter));
    }//GEN-LAST:event_btnLastUpdateTimeActionPerformed
    private boolean typeCheck(String text){
       return text.matches("^[A-Za-z0-9]+$");
    }
    private void btnFindByCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindByCityActionPerformed
        // TODO add your handling code here:
         String targetCity = txtFindByCity.getText();
         
         if(!typeCheck(targetCity)){
              infoBox("Invalid City data type, please check", "Invalid"); return;
         }
    
        CarFleet target = new CarFleet();
        ArrayList<Car> carList = fleet.getCarList();
     
        for(int i = 0; i < carList.size();i++){
            if(carList.get(i).getAvailableCity().equals(targetCity)){
                target.add(carList.get(i));
            }
        }
        populateTable(target.getCarList());
    }//GEN-LAST:event_btnFindByCityActionPerformed

    private void btnFindByExpiredMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindByExpiredMaintenanceActionPerformed
        // TODO add your handling code here:
        CarFleet target = new CarFleet();
        LocalDateTime nowTime = LocalDateTime.now();
        ArrayList<Car> carList = fleet.getCarList();
        for(int i = 0; i < carList.size();i++){
            Duration dur = Duration.between(nowTime, carList.get(i).getMaintenanceExpireTime());
            if(dur.toSeconds() < 0){
                target.add(carList.get(i));
            }
        }
        populateTable(target.getCarList());
    }//GEN-LAST:event_btnFindByExpiredMaintenanceActionPerformed

    private void btnListManufacturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListManufacturesActionPerformed
        // TODO add your handling code here:
        ArrayList<String> brandList = new ArrayList<>();
        ArrayList<Car> carList = fleet.getCarList();
        for(int i = 0; i < carList.size();i++){
            if(brandList.contains(carList.get(i).getCarBrand())){
            }else{
                brandList.add(carList.get(i).getCarBrand());
            }
        }
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);
        
        brandList.forEach(Brand -> {
            Object[] row = new Object[4];
            row[0] = "";
            row[1] = Brand;
            row[2] = "";
            row[3] = "";
            model.addRow(row);
        });
        
    }//GEN-LAST:event_btnListManufacturesActionPerformed

    private void btnListAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListAllActionPerformed
        // TODO add your handling code here:
         populateTable(fleet.getCarList());
    }//GEN-LAST:event_btnListAllActionPerformed

    private void txtFindByBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindByBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindByBrandActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailNumb;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFindByBrand;
    private javax.swing.JButton btnFindByCity;
    private javax.swing.JButton btnFindByExpiredMaintenance;
    private javax.swing.JButton btnFindByModel;
    private javax.swing.JButton btnFindBySeats;
    private javax.swing.JButton btnFindBySerial;
    private javax.swing.JButton btnFirstAviaCar;
    private javax.swing.JButton btnLastUpdateTime;
    private javax.swing.JButton btnListAll;
    private javax.swing.JButton btnListManufactures;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvail;
    private javax.swing.JLabel lblFindByBrand;
    private javax.swing.JLabel lblFindByCity;
    private javax.swing.JLabel lblFindBySerial;
    private javax.swing.JLabel lblFindSeatsHigh;
    private javax.swing.JLabel lblFindSeatsLow;
    private javax.swing.JLabel lblUnavail;
    private javax.swing.JLabel lblViewCar;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtAvailNumb;
    private javax.swing.JTextField txtFindByBrand;
    private javax.swing.JTextField txtFindByCity;
    private javax.swing.JTextField txtFindByModel;
    private javax.swing.JTextField txtFindBySerial;
    private javax.swing.JTextField txtFindSeatsHigh;
    private javax.swing.JTextField txtFindSeatsLow;
    private javax.swing.JTextField txtLastUpdateTime;
    private javax.swing.JTextField txtUnAvailNumb;
    // End of variables declaration//GEN-END:variables

    
    public void populateTable(ArrayList<Car> carFleet){
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);
        
        carFleet.forEach(car -> {
            Object[] row = new Object[8];
            row[0] = car;
            row[1] = car.getCarBrand();
            row[2] = car.getCarModel();
            row[3] = car.getAvailableTime();
            row[4] = car.getManufactureTime();
            row[5] = car.getSeatsForPassenger();
            row[6] = car.getAvailableCity();
            row[7] = car.getMaintenanceExpireTime();
            model.addRow(row);
        });
    }
}