/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ProductionCoordinatorRole;

import Ecosystem.EcoSystem;
import Ecosystem.Enterprise.Enterprise;
import Ecosystem.Network.Network;
import Ecosystem.Organization.Organization;
import Ecosystem.Organization.ResearchAndDevelopmentOrganization;
import Ecosystem.UserAccount.UserAccount;
import Ecosystem.WorkQueue.ComponentWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sunny
 */
public class RequestComponentJPanel extends javax.swing.JPanel {
    
    private JPanel workArea;
    private UserAccount userAccount;
    private EcoSystem system;
    

    /**
     * Creates new form RequestComponentJPanel
     */
    public RequestComponentJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.workArea = userProcessContainer;
        this.userAccount = account;
        this.system = ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblProduct = new javax.swing.JLabel();
        cbbProduct = new javax.swing.JComboBox<>();
        btnRequest = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        lblProduct1 = new javax.swing.JLabel();
        txtOther = new javax.swing.JTextField();
        lblProduct2 = new javax.swing.JLabel();
        txtQuant = new javax.swing.JTextField();

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel10.setText("Send Request Component");

        btnBack.setBackground(new java.awt.Color(255, 153, 153));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblProduct.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProduct.setText("Select a component:");

        cbbProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Processor", "Memory", "Storage", "Battery", "Display", "Camera", "Speakers", "Sensors", "Circuit boards", "Casing", "Other" }));
        cbbProduct.setSelectedItem(null);
        cbbProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbProductActionPerformed(evt);
            }
        });

        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage.setText("Message:");

        lblProduct1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProduct1.setText("Other component:");

        txtOther.setEnabled(false);

        lblProduct2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProduct2.setText("Quantity:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(btnRequest)
                    .addComponent(lblMessage)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProduct)
                            .addComponent(lblProduct1)
                            .addComponent(lblProduct2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuant)
                            .addComponent(txtOther)
                            .addComponent(cbbProduct, 0, 132, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduct)
                    .addComponent(cbbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProduct1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduct2)
                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnRequest)
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ProductionCoordinatorWorkAreaJPanel jPanel = (ProductionCoordinatorWorkAreaJPanel) component;
        jPanel.populateRequestTable();
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed

        String message = txtMessage.getText();
        String quant = txtQuant.getText();
        if(message.equals("") || message.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter something to send.");
            return;
        }
        
        if(cbbProduct.getSelectedItem()==null){
            JOptionPane.showMessageDialog(null, "Please select a product.");
            return;
        }
        
        if(quant.equals("") || quant.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter the product quantity.");
            return;
        }
        
        String productName = txtOther.getText();
        if(productName.equals("")){
            productName = cbbProduct.getSelectedItem().toString();
        }

        ComponentWorkRequest request = new ComponentWorkRequest();
        request.setProductName(productName);
        request.setProductQuant(Integer.parseInt(quant));
        request.setSender(userAccount);
        request.setMessage(message);
        request.setStatus("Sent");

        Organization org = null;
        for(Network network : system.getNetworkList()){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if (organization instanceof ResearchAndDevelopmentOrganization){
                        org = organization;
                        break;
                    }
                }
            }
        }
        
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }

        JOptionPane.showMessageDialog(null, "Request message sent");
        cbbProduct.setSelectedItem(null);
        txtQuant.setText("");
        txtMessage.setText("");
        txtOther.setText("");
        
    }//GEN-LAST:event_btnRequestActionPerformed

    private void cbbProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbProductActionPerformed
        // TODO add your handling code here:
        String selectedItem = (String) cbbProduct.getSelectedItem();
        if ("Other".equals(selectedItem)) {
            txtOther.setEnabled(true); // Enable text field
        } else {
            txtOther.setEnabled(false); // Disable text field
            txtOther.setText(""); // Clear text field
        }
    }//GEN-LAST:event_cbbProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox<String> cbbProduct;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblProduct1;
    private javax.swing.JLabel lblProduct2;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtOther;
    private javax.swing.JTextField txtQuant;
    // End of variables declaration//GEN-END:variables
}
