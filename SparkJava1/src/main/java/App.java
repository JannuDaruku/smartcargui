
import static spark.Spark.*;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.smartcar.sdk.*;
import com.smartcar.sdk.data.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enta
 */
public class App extends javax.swing.JFrame {

    private final AuthClient client;
    private String access;
    private static Gson gson = new Gson();

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        port(8000);
        String clientId = "d3afbfd1-2026-43c5-83ef-d2030174f4fa";
        String clientSecret = "df96831c-1265-4b7f-b805-c0aa235697da";
        String redirectUri = "http://localhost:8000/callback";
        String[] scope = {"read_engine_oil read_battery read_charge read_fuel read_location control_security read_odometer read_tires read_vehicle_info read_vin"};

        boolean testMode = true;

        client = new AuthClient(
                clientId,
                clientSecret,
                redirectUri,
                scope,
                testMode
        );
        CarController cc = new CarController();
        cc.getAccess(client);
        access = System.getProperty("access");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        res = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        oil = new javax.swing.JButton();
        fuel = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        res.setColumns(20);
        res.setRows(5);
        jScrollPane1.setViewportView(res);

        jButton2.setText("Vehicle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Vehicles");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Odometer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        oil.setText("Oil");
        oil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilActionPerformed(evt);
            }
        });

        fuel.setText("Fuel");
        fuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelActionPerformed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fuel)
                                .addGap(0, 42, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(oil)
                    .addComponent(fuel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reset)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OpenBrowser openBrowser = new OpenBrowser("http://localhost:8000/login");
        res.append("Browser will be opened shortly.\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\henrique2\\AppData\\Local\\Temp\\access"));
            access = brTest.readLine();
            try {
                SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
                // the list of vehicle ids
                String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();

                // instantiate the first vehicle in the vehicle id list
                Vehicle vehicle = new Vehicle(vehicleIds[0], access);

                VehicleInfo info = vehicle.info();

                System.out.println(gson.toJson(info));
                res.append(gson.toJson(info) + "\n");

                JsonParser parser = new JsonParser();
                JsonObject obj = parser.parse(gson.toJson(info)).getAsJsonObject();
                String id = obj.get("id").getAsString();
                String make = obj.get("make").getAsString();
                String model = obj.get("model").getAsString();
                String year = obj.get("year").getAsString();
                res.append("id = " + id + "\n");
                res.append("make = " + make + "\n");
                res.append("model = " + model + "\n");
                res.append("year = " + year + "\n");

            } catch (SmartcarException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\henrique2\\AppData\\Local\\Temp\\access"));
            access = brTest.readLine();
            try {
                SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
                // the list of vehicle ids
                String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();

                for (String v : vehicleIds) {

                    Vehicle vehicle = new Vehicle(v, access);
                    VehicleInfo info = vehicle.info();
                    System.out.println(gson.toJson(info));
                    JsonParser parser = new JsonParser();
                    JsonObject obj = parser.parse(gson.toJson(info)).getAsJsonObject();
                    String id = obj.get("id").getAsString();
                    String make = obj.get("make").getAsString();
                    String model = obj.get("model").getAsString();
                    String year = obj.get("year").getAsString();
                    res.append("id = " + id + "\n");
                    res.append("make = " + make + "\n");
                    res.append("model = " + model + "\n");
                    res.append("year = " + year + "\n");
                }
            } catch (SmartcarException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            res.setText("Faz login primeiro!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\henrique2\\AppData\\Local\\Temp\\access"));
            access = brTest.readLine();
            try {
                SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
                // the list of vehicle ids
                String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();
                Vehicle vehicle = new Vehicle(vehicleIds[0], access);
                SmartcarResponse<VehicleOdometer> odometerResponse = vehicle.odometer();
                VehicleOdometer odometerData = odometerResponse.getData();
                double odometer = odometerData.getDistance();
                String vin = vehicle.vin();
                res.append("O carro " + vin + " tem " + odometer + " Kilometros");
            } catch (SmartcarException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            res.setText("Faz login primeiro!");
    }//GEN-LAST:event_jButton4ActionPerformed
    }


    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        res.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void oilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilActionPerformed
        // TODO add your handling code here:
        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\henrique2\\AppData\\Local\\Temp\\access"));
            access = brTest.readLine();
            try {
                String line = "";
                SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
                // the list of vehicle ids
                String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();
                Vehicle vehicle = new Vehicle(vehicleIds[0], access);
                String vin = vehicle.vin();
                SmartcarResponse<VehicleOil> oilResponse = vehicle.oil();
                VehicleOil oilData = oilResponse.getData();
                double vehoil = oilData.getLifeRemaining();
                String resul = "O carro " + vin + " tem " + vehoil + "%" + " de óleo." + "\n";
                res.append(resul);
            } catch (SmartcarException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            res.setText("Faz login primeiro!");
        }
    }//GEN-LAST:event_oilActionPerformed

    private void fuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelActionPerformed
        // TODO add your handling code here:
        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\henrique2\\AppData\\Local\\Temp\\access"));
            access = brTest.readLine();
            try {
                String line = "";
                SmartcarResponse<VehicleIds> vehicleIdsResponse = AuthClient.getVehicleIds(access);
                String[] vehicleIds = vehicleIdsResponse.getData().getVehicleIds();
                Vehicle vehicle = new Vehicle(vehicleIds[0], access);
                String vin = vehicle.vin();
                SmartcarResponse<VehicleFuel> fuelResponse = vehicle.fuel();
                VehicleFuel fuelData = fuelResponse.getData();
                double vehoil = fuelData.getAmountRemaining();
                String resul = "O carro " + vin + " tem " + vehoil + "L de combustível." + "\n";
                res.append(resul);
            } catch (SmartcarException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            res.setText("Faz login primeiro!");
        }
    }//GEN-LAST:event_fuelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton fuel;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton oil;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JTextArea res;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
