package NetworkChef;

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
        this.setSize(1234, 675);
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        supernetting_firstInputTB = new javax.swing.JTextField();
        supernetting_SecondInputTB = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        supernetting_outputTB = new javax.swing.JTextField();
        supernet_cookNetworksBTN = new javax.swing.JButton();

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

        jLabel7.setText("REMEMBER: NetworkChef_v1.1 only works with a 1 level hierarchy, if you have multiple levels, then run networkChef manually for each level");
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

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        jLabel8.setText("Stay tuned for updates ;)");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(940, 610, 290, 50);

        clearInputSubnets.setText("Clear Network Creation Table");
        clearInputSubnets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearInputSubnetsActionPerformed(evt);
            }
        });
        getContentPane().add(clearInputSubnets);
        clearInputSubnets.setBounds(20, 410, 220, 24);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("SUPERNETTING");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 540, 102, 20);

        jLabel10.setText("Input First Network Address ->");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 580, 170, 18);

        jLabel11.setText("Input Second Network Address ->");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 620, 190, 18);
        getContentPane().add(supernetting_firstInputTB);
        supernetting_firstInputTB.setBounds(220, 580, 160, 24);
        getContentPane().add(supernetting_SecondInputTB);
        supernetting_SecondInputTB.setBounds(220, 620, 160, 24);

        jLabel12.setText("\"Global\" Network Address ->");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(450, 580, 170, 18);

        supernetting_outputTB.setEditable(false);
        getContentPane().add(supernetting_outputTB);
        supernetting_outputTB.setBounds(620, 580, 160, 24);

        supernet_cookNetworksBTN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        supernet_cookNetworksBTN.setText("Cook the Network");
        supernet_cookNetworksBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supernet_cookNetworksBTNActionPerformed(evt);
            }
        });
        getContentPane().add(supernet_cookNetworksBTN);
        supernet_cookNetworksBTN.setBounds(450, 620, 330, 26);

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

    private void supernet_cookNetworksBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supernet_cookNetworksBTNActionPerformed
        String[] check = new String[4];
        String text;
        IPv4 addr1 = null, addr2 = null;
        
        for (int i = 0; i < 2; i++) { // this for checks if the input addresses are correct
            if (i == 0) // this is just needed so that i can reuse this code to test both inputs
                text = supernetting_firstInputTB.getText();
            else
                text = supernetting_SecondInputTB.getText();
            
            check[0] = text.substring(0, text.indexOf('.'));
            text = text.substring(text.indexOf('.') + 1);
            check[1] = text.substring(0, text.indexOf('.'));
            text = text.substring(text.indexOf('.') + 1);
            check[2] = text.substring(0, text.indexOf('.'));
            text = text.substring(text.indexOf('.') + 1);
            check[3] = text;
            
            // data check, values and length
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
            
            if (i == 0) // i use this to make the new address in case everything goes as planned
                addr1 = new IPv4(Short.parseShort(check[0]), Short.parseShort(check[1]), Short.parseShort(check[2]), Short.parseShort(check[3]), (byte) 0);
            else
                addr2 = new IPv4(Short.parseShort(check[0]), Short.parseShort(check[1]), Short.parseShort(check[2]), Short.parseShort(check[3]), (byte) 0);
        }
        
        String addr1_binary = addr1.toBits();
        String addr2_binary = addr2.toBits();
        String output_addr_binary = ""; // compare the strings and copy the equal characters
        byte netmask = 0;
        for (int i = 0; i < 35; i++) {
            if (addr1_binary.charAt(i) == '.'){
                i++;
                output_addr_binary += '.';
            }
            
            if (addr1_binary.charAt(i) != addr2_binary.charAt(i)){
                while (i < 35){ // once we hit the different characters complete the string with '0' chars
                    if (addr1_binary.charAt(i) == '.')
                        output_addr_binary += '.';
                    else
                        output_addr_binary += '0';
                    i++;
                }
            } else {
                output_addr_binary += addr1_binary.charAt(i);
                netmask++;
            }
        }
        
        // String[] bytes = output_addr_binary.split('.'); // IT IS BROKEN!!!!
        int iterator = 0;
        String[] bytes = {"", "", "", ""};
        for (int i = 0; i < 35; i++) {
            char c = output_addr_binary.charAt(i);
            
            if (c == '.'){
                iterator++;
                continue;
            }
            
            bytes[iterator] += c;
        }
        
        short[] values = {0,0,0,0}; // covert from base 2 to base 10
        for (int x = 0; x < 4; x++) {
            int decimalValue = 0;
            int power = 0;
            for (int i = bytes[x].length() - 1; i >= 0; i--) {
                if (bytes[x].charAt(i) == '1') {
                    decimalValue += Math.pow(2, power);
                }
            power++;
            }
            
            values[x] = (short) decimalValue;
        }
        
        supernetting_outputTB.setText(new IPv4(values[0], values[1], values[2], values[3], netmask).toString() + "/" + netmask);
    }//GEN-LAST:event_supernet_cookNetworksBTNActionPerformed

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner netMaskInput;
    private javax.swing.JSpinner numDevices;
    private javax.swing.JTable results;
    private javax.swing.JButton supernet_cookNetworksBTN;
    private javax.swing.JTextField supernetting_SecondInputTB;
    private javax.swing.JTextField supernetting_firstInputTB;
    private javax.swing.JTextField supernetting_outputTB;
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
