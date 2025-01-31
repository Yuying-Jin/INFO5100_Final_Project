/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ProductionCoordinatorRole;

import Ecosystem.Enterprise.Enterprise;
import Ecosystem.Enterprise.SmartphoneEnterprise;
import Ecosystem.Organization.Organization;
import Ecosystem.Organization.UIUXDesignOrganization;
import Ecosystem.Product.SmartphoneProduct;
import Ecosystem.UserAccount.UserAccount;
import Ecosystem.WorkQueue.DesignWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sunny
 */
public class RequestDesignJPanel extends javax.swing.JPanel {
    
    private JPanel workArea;
    private UserAccount userAccount;
    private Enterprise enterprise;
    
    /**
     * Creates new form RequestDesignJPanel
     * @param userProcessContainer
     * @param account
     * @param ecosystem
     */
    public RequestDesignJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        
        this.workArea = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        populateProductComboBox();
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
        btnRequest = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        lblProduct = new javax.swing.JLabel();
        cbbProduct = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 245, 175));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel10.setText("Send Request UI/UX Design");

        btnBack.setBackground(new java.awt.Color(204, 225, 152));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRequest.setBackground(new java.awt.Color(204, 225, 152));
        btnRequest.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblMessage.setText("Message:");

        lblProduct.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblProduct.setText("Select a product:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRequest)
                            .addComponent(lblMessage)
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProduct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnBack))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduct)
                    .addComponent(cbbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(lblMessage)
                .addGap(18, 18, 18)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnRequest)
                .addGap(50, 50, 50))
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
        if(message.equals("") || message.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter something to send.");
            return;
        }
        
        if(cbbProduct.getSelectedItem()==null){
            JOptionPane.showMessageDialog(null, "Please select a product.");
            return;
        }
        
        DesignWorkRequest request = new DesignWorkRequest();
        
        request.setProductName(cbbProduct.getSelectedItem().toString());
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof UIUXDesignOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }

        JOptionPane.showMessageDialog(null, "Request message sent");
        cbbProduct.setSelectedItem(null);
        txtMessage.setText("");

    }//GEN-LAST:event_btnRequestActionPerformed

    
    private void populateProductComboBox() {
        for (SmartphoneProduct product : ((SmartphoneEnterprise) enterprise).getProductCatalog().getProductCatalog()){
            cbbProduct.addItem(product);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox<Object> cbbProduct;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
