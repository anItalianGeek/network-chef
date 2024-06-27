package networkchef_v1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class window extends javax.swing.JFrame {

    private ArrayList<Integer> devicesInNetworks;
    DefaultTableModel modelInputNetworks, resultsModel;
    
    public window() {
        initComponents();
        modelInputNetworks = (DefaultTableModel) inputNetworks.getModel();
        resultsModel = (DefaultTableModel) results.getModel();
        devicesInNetworks = new ArrayList<Integer>();
        this.setSize(1234, 546);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        netMaskInput = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ipAddressInput = new javax.swing.JTextField();
        addDevicesBTN = new javax.swing.JButton();
        numDevices = new javax.swing.JSpinner();
        addNetworkBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        results = new javax.swing.JTable();
        cookNetworksBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputNetworks = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cleanTableBTN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        clearInputSubnets = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jLabel1.setText("Input Network Address here ->");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 197, 18);

        jLabel2.setText("Input Subnet Mask here (short form) ->");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 251, 18);
        getContentPane().add(netMaskInput);
        netMaskInput.setBounds(280, 80, 83, 24);

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setText("Input Area");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(14, 10, 72, 18);

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setText("Create the network");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 120, 136, 18);

        jLabel5.setText(".");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 40, 0, 18);
        getContentPane().add(ipAddressInput);
        ipAddressInput.setBounds(230, 30, 150, 30);

        addDevicesBTN.setText("Add devices");
        addDevicesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDevicesBTNActionPerformed(evt);
            }
        });
        getContentPane().add(addDevicesBTN);
        addDevicesBTN.setBounds(20, 150, 120, 24);
        getContentPane().add(numDevices);
        numDevices.setBounds(150, 150, 90, 24);

        addNetworkBTN.setText("Add this NetWork");
        addNetworkBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkBTNActionPerformed(evt);
            }
        });
        getContentPane().add(addNetworkBTN);
        addNetworkBTN.setBounds(20, 440, 220, 24);

        results.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subnet N", "Network Address", "Subnet Mask", "IP range", "Router IP", "Broadcast IP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(results);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(420, 20, 800, 460);

        cookNetworksBTN.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        cookNetworksBTN.setText("Cook the networks");
        cookNetworksBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookNetworksBTNActionPerformed(evt);
            }
        });
        getContentPane().add(cookNetworksBTN);
        cookNetworksBTN.setBounds(20, 470, 220, 24);

        inputNetworks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network N", "Devices"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(inputNetworks);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 180, 220, 200);

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 8)); // NOI18N
        jLabel6.setText("REMEMBER: 2 addresses will be added  to each network! (Network IP and broadcast IP)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 380, 300, 30);

        jLabel7.setText("REMEMBER: NetworkChef only works with a 1 level hierarchy, if you have multiple levels, then run networkChef manually for each level");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 500, 880, 30);

        cleanTableBTN.setText("Clean Table");
        cleanTableBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanTableBTNActionPerformed(evt);
            }
        });
        getContentPane().add(cleanTableBTN);
        cleanTableBTN.setBounds(1043, 490, 170, 40);

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        jLabel8.setText("Stay tuned for updates ;)");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(900, 490, 130, 40);

        clearInputSubnets.setText("Clear Network Creation Table");
        clearInputSubnets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearInputSubnetsActionPerformed(evt);
            }
        });
        getContentPane().add(clearInputSubnets);
        clearInputSubnets.setBounds(20, 410, 220, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cookNetworksBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookNetworksBTNActionPerformed
        // User Input Check
        int netMask = (int)netMaskInput.getValue();
        if (netMask >= 32 || netMask <= 0){
            JOptionPane.showMessageDialog(this, "Cannot cook the networks. Invalid Subnet Mask", "Error", 0);
            return;
        }
        
        String text = ipAddressInput.getText();
        //String[] check = text.split("."); // split is broken for some reason, at least on my machine you know...
        
        String[] check = new String[4];
        check[0] = text.substring(0, text.indexOf('.'));
        text = text.substring(text.indexOf('.') + 1);
        check[1] = text.substring(0, text.indexOf('.'));
        text = text.substring(text.indexOf('.') + 1);
        check[2] = text.substring(0, text.indexOf('.'));
        text = text.substring(text.indexOf('.') + 1);
        check[3] = text;
        
        // data check, input values and length
        if (check.length != 4){
            JOptionPane.showMessageDialog(this, "Cannot cook the networks. Invalid IP address", "Error", 0);
            return;
        }
        
        for (String current : check) {
            try{
                int value = Integer.parseInt(current);
                if (value > 255 || value < 0){
                    JOptionPane.showMessageDialog(this, "Cannot cook the networks. Invalid IP address", "Error", 0);
                    return;
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(this, "Cannot cook the networks. The IP must be a number", "Error", 0);
                return;
            }
        }
        
        IPv4 networkAddress = new IPv4(Short.parseShort(check[0]), Short.parseShort(check[1]), Short.parseShort(check[2]), Short.parseShort(check[3]), (byte) netMask);
        
        // reordering the arraylist using the quicksort algorithm (chatgpt did it, it haven't done anything :C)
        QuickSort(devicesInNetworks, 0, devicesInNetworks.size() - 1);
        
        // Start working on the subnetting
        for (int current = devicesInNetworks.size() - 1; current >= 0; current--) {
            try {
                // get the amount of devices needed for the network
                int discriminator = (int) devicesInNetworks.get(current) + 2; int value;

                // get the amount of bits needed
                int bitsNeeded = 1;
                while ((value = (int) Math.pow(2, bitsNeeded)) < discriminator)
                    bitsNeeded++;
                
                // save the current subnet address
                IPv4 currentNetworkAddress = networkAddress.clone();

                // get the next subnet address
                IPv4 nextNetID = networkAddress.add(value);

                // get the broadcast address for the current subnet
                IPv4 broadCastAddress = networkAddress.dec();

                // get the router address for the current subnet
                IPv4 routerAddress = networkAddress.dec();

                // get the subnet mask
                int fullBlocks = (32 - bitsNeeded) / 8;
                int remaining = (32 - bitsNeeded) % 8;

                IPv4 subnetMask = null;
                switch (fullBlocks){
                    case 1:
                        if (remaining == 0)
                            subnetMask = new IPv4((short) 255, (short) 0, (short) 0, (short) 0, (byte) 0);
                        else 
                            subnetMask = new IPv4((short) 255, (short) Math.pow(2, remaining), (short) 0, (short) 0, (byte) 0);
                        break;

                    case 2:
                        if (remaining == 0)
                            subnetMask = new IPv4((short) 255, (short) 255, (short) 0, (short) 0, (byte) 0);
                        else 
                            subnetMask = new IPv4((short) 255, (short) 255, (short) Math.pow(2, remaining), (short) 0, (byte) 0);
                        break;

                    case 3:
                        if (remaining == 0)
                            subnetMask = new IPv4((short) 255, (short) 255, (short) 255, (short) 0, (byte) 0);
                        else 
                            subnetMask = new IPv4((short) 255, (short) 255, (short) 255, (short) Math.pow(2, remaining), (byte) 0);
                        break;
                }

                // get the IP range for the current subnet
                IPv4 firstAvailableAddress = currentNetworkAddress.clone().inc();
                IPv4 lastAddressAvailable = broadCastAddress.clone().dec();

                // update the table
                int rowCounter = resultsModel.getRowCount() + 1;
                resultsModel.addRow(
                        new Object[]{
                            rowCounter++,
                            currentNetworkAddress.toString(),
                            subnetMask.toString(),
                            firstAvailableAddress.toString() + " - " + lastAddressAvailable.toString(),
                            routerAddress.toString(),
                            broadCastAddress.toString()
                        }
                );

                // continue with the next subnet
                networkAddress = nextNetID.clone();
            } catch (Exception e) {}
        }
        
        // LAST BLOCK, table separator (history like feature for the "results" table)
        DefaultTableModel model = (DefaultTableModel) results.getModel();
        model.addRow(new Object[]{null, null, null, null, null, null});
    }//GEN-LAST:event_cookNetworksBTNActionPerformed
    
    private void addDevicesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDevicesBTNActionPerformed
        // this method basically increments the value of the last element in the list, if there is one of course
        int size = devicesInNetworks.size();
        if (size > 0){
            int value = devicesInNetworks.get(size - 1);
            devicesInNetworks.set(size - 1, value + (int)numDevices.getValue());
        
            modelInputNetworks.setValueAt(devicesInNetworks.get(size - 1), modelInputNetworks.getRowCount() - 1, 1);
        }
    }//GEN-LAST:event_addDevicesBTNActionPerformed

    private void addNetworkBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNetworkBTNActionPerformed
        // after you input the amount of devices in your subnet, you can push it to the program
        modelInputNetworks.addRow(
                new Object[]{modelInputNetworks.getRowCount()+1, (int)numDevices.getValue()}
        );
        
        devicesInNetworks.add((int)modelInputNetworks.getValueAt(modelInputNetworks.getRowCount() - 1, 1));
    }//GEN-LAST:event_addNetworkBTNActionPerformed

    private void cleanTableBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanTableBTNActionPerformed
        // reset only the table of the outputs
        resultsModel.setRowCount(0);
    }//GEN-LAST:event_cleanTableBTNActionPerformed

    private void clearInputSubnetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearInputSubnetsActionPerformed
        // reset only the table containing the input subnets
        modelInputNetworks.setRowCount(0);
        devicesInNetworks.clear();
    }//GEN-LAST:event_clearInputSubnetsActionPerformed

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
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDevicesBTN;
    private javax.swing.JButton addNetworkBTN;
    private javax.swing.JButton cleanTableBTN;
    private javax.swing.JButton clearInputSubnets;
    private javax.swing.JButton cookNetworksBTN;
    private javax.swing.JTable inputNetworks;
    private javax.swing.JTextField ipAddressInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner netMaskInput;
    private javax.swing.JSpinner numDevices;
    private javax.swing.JTable results;
    // End of variables declaration//GEN-END:variables

    public static void QuickSort(ArrayList<Integer> array, int low, int high) {
        if (low < high) {
            int pivotIndex = Partition(array, low, high);
            QuickSort(array, low, pivotIndex - 1);
            QuickSort(array, pivotIndex + 1, high);
        }
    }
    
    public static int Partition(ArrayList<Integer> array, int low, int high) {
        int pivot = array.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array.get(j) < pivot) {
                i++;
                int temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
            }
        }
        int temp = array.get(i + 1);
        array.set(i + 1, array.get(high));
        array.set(high, temp);
        return i + 1;
    }

}