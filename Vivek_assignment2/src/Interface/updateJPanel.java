/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import UberCar.UberCars;
import UberCar.UberCarData;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Date;
import java.sql.Timestamp;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author revanthkumar
 */
public class updateJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UberCarData carinformationList;
    private UberCars c;
    
    private Date date;
    private Timestamp timestamp;
    
    public static String Time;

    public static String getTime() {
        return Time;
    }

    public static void setTime(String Time) {
        updateJPanel.Time = Time;
    }
   
    public updateJPanel(JPanel userProcessContainer, UberCarData carinformationlist) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
       this.carinformationList=carinformationlist;
       
       populateTable();
       
       
     
       
    }
    
    
    
    private void populateCarDetails(){
       
        int selectedrow =tblView.getSelectedRow();
        c = (UberCars) tblView.getValueAt(selectedrow, 0);
        
        
        
        txtYearOfMfg.setText(String.valueOf(c.getManufactured_year()));
        txtBrand.setText(c.getBrand());
        txtCity.setText(c.getAvailble_city());
        txtMaxSeats.setText(String.valueOf(c.getMax_seats()));
        txtMinSeats.setText(String.valueOf(c.getMin_seats()));
        txtModelNum.setText(c.getModel_num());
        txtSerialNumber.setText(String.valueOf(c.getSerial_num()));
        if(c.isAvailable()==true)
            rbYesAvailability.setSelected(true);
        
        else
            rbNoAvailability.setSelected(true);
        
        if(c.isMaintenance_certificate()==true)
            rbYesMaintainance.setSelected(true);
        else
            rbNoMaintainance.setSelected(true);
        
        
        
        
        
        
        
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblView.getModel(); 
        dtm.setRowCount(0);
        for (UberCars car : carinformationList.getCarList()){
            Object[] row = new Object[10];
            row[0] = car;
            row[1] = car.getManufactured_year();
            row[2]= car.getMax_seats();
            row[3]= car.getMin_seats();
            row[4]=car.getSerial_num();
            row[5]=car.getModel_num();
            row[6]=car.getAvailble_city();
            row[7]=car.isAvailable();
            row[8]=car.isMaintenance_certificate();
            row[9]=car.getCreatedOn();
            dtm.addRow(row);
            
    }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        rbNoAvailability = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtYearOfMfg = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaxSeats = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMinSeats = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtModelNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rbYesMaintainance = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        rbNoMaintainance = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        rbYesAvailability = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BRAND", "MANUFACTURED YEAR", "MAX SEATS", "MIN SEATS", "SERIAL NUMBER", "MODEL NUMBER", "AVAILABLE CITY", "AVAILABILITY", "MAINTENANCE", "CREATED ON"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblView);

        buttonGroup2.add(rbNoAvailability);
        rbNoAvailability.setText("No");

        jLabel11.setText("CAR AVAILABILITY");

        txtYearOfMfg.setEnabled(false);

        txtBrand.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel3.setText("BRAND");

        txtMaxSeats.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel4.setText("YEAR OF MANUFACTURING");

        txtSerialNumber.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel5.setText("MINIMUM SEATS");

        txtMinSeats.setEnabled(false);
        txtMinSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinSeatsActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel6.setText("MAXIMUM SEATS");

        txtModelNum.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel7.setText("SERIAL NUMBER");

        buttonGroup1.add(rbYesMaintainance);
        rbYesMaintainance.setText("Yes");
        rbYesMaintainance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYesMaintainanceActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel8.setText("MODEL NUMBER");

        txtCity.setEnabled(false);

        buttonGroup1.add(rbNoMaintainance);
        rbNoMaintainance.setText("No");

        jLabel9.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel9.setText("AVAILABLE CITY");

        buttonGroup2.add(rbYesAvailability);
        rbYesAvailability.setText("Yes");

        jLabel10.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jLabel10.setText("MAINTENANCE CERTIFICATE");

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbYesMaintainance)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbNoMaintainance))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtModelNum)
                                        .addComponent(txtSerialNumber)
                                        .addComponent(txtBrand)
                                        .addComponent(txtMaxSeats)
                                        .addComponent(txtYearOfMfg)
                                        .addComponent(txtMinSeats)
                                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbYesAvailability)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbNoAvailability))
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(359, 359, 359)
                        .addComponent(lblTime)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(lblTime))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtYearOfMfg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(rbYesMaintainance)
                            .addComponent(rbNoMaintainance))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(rbYesAvailability)
                            .addComponent(rbNoAvailability))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMinSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinSeatsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtMinSeatsActionPerformed

    private void rbYesMaintainanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYesMaintainanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbYesMaintainanceActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtBrand.setEnabled(true);
        txtCity.setEnabled(true);
        txtMaxSeats.setEnabled(true);
        txtMinSeats.setEnabled(true);
        txtModelNum.setEnabled(true);
        txtSerialNumber.setEnabled(true);
        txtYearOfMfg.setEnabled(true);
        rbNoAvailability.setEnabled(true);
        rbNoMaintainance.setEnabled(true);
        rbYesAvailability.setEnabled(true);
        rbYesMaintainance.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
         populateCarDetails();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        try{
            
            if(txtBrand.getText().equals("") || txtCity.getText().equals("") || txtModelNum.getText().equals(""))
        JOptionPane.showMessageDialog(null,"Fields cannot be empty");
            
            else{
        c.setBrand(txtBrand.getText());
        c.setManufactured_year(Integer.parseInt(txtYearOfMfg.getText()));
        c.setAvailble_city(txtCity.getText());
        c.setMax_seats(Integer.parseInt(txtMaxSeats.getText()));
        c.setMin_seats(Integer.parseInt(txtMinSeats.getText()));
        if(rbNoAvailability.isSelected()==true)
            c.setAvailable(false);
        if(rbYesAvailability.isSelected()==true)
            c.setAvailable(true);
        if(rbNoMaintainance.isSelected()==true)
            c.setMaintenance_certificate(false);
        if(rbYesMaintainance.isSelected()==true)
            c.setMaintenance_certificate(true);
        c.setModel_num(txtModelNum.getText());
        c.setSerial_num(Integer.parseInt(txtSerialNumber.getText()));
        populateTable();
        JOptionPane.showMessageDialog(null,"Car Specifics Updated Successfully");
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);
         txtBrand.setEnabled(false);
        txtCity.setEnabled(false);
        txtMaxSeats.setEnabled(false);
        txtMinSeats.setEnabled(false);
        txtModelNum.setEnabled(false);
        txtSerialNumber.setEnabled(false);
        txtYearOfMfg.setEnabled(false);
        rbNoAvailability.setEnabled(false);
        rbNoMaintainance.setEnabled(false);
        rbYesAvailability.setEnabled(false);
        rbYesMaintainance.setEnabled(false);
        date =new Date();
        long Timme = date.getTime();
        timestamp= new Timestamp(Timme);
        Time= String.valueOf(timestamp);
        
        lblTime.setText(Time);
        
        
            }
        
        }catch(NumberFormatException c){JOptionPane.showMessageDialog(null, "Enter numeric value");}
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
           CardLayout layout = (CardLayout) userProcessContainer.getLayout();
           layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JRadioButton rbNoAvailability;
    private javax.swing.JRadioButton rbNoMaintainance;
    private javax.swing.JRadioButton rbYesAvailability;
    private javax.swing.JRadioButton rbYesMaintainance;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMinSeats;
    private javax.swing.JTextField txtModelNum;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtYearOfMfg;
    // End of variables declaration//GEN-END:variables
}
