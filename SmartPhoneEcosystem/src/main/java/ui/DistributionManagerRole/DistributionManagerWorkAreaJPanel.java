/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DistributionManagerRole;

import Ecosystem.EcoSystem;
import Ecosystem.Enterprise.Enterprise;
import Ecosystem.Organization.Organization;
import Ecosystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sunny
 */
public class DistributionManagerWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount account;
    public DistributionManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageProductRequest = new javax.swing.JButton();
        warehouseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 175));

        btnManageProductRequest.setBackground(new java.awt.Color(204, 225, 152));
        btnManageProductRequest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnManageProductRequest.setText("Manage Distribution Request");
        btnManageProductRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductRequestActionPerformed(evt);
            }
        });

        warehouseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        warehouseLabel.setText("Distribution Manager");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(warehouseLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnManageProductRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(warehouseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnManageProductRequest)
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageProductRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductRequestActionPerformed
        RequestTransportationPlannerJPanel managerTransportationJPanel = new RequestTransportationPlannerJPanel(userProcessContainer, account, organization);
        userProcessContainer.add("managerTransportationJPanel", managerTransportationJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageProductRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageProductRequest;
    private javax.swing.JLabel warehouseLabel;
    // End of variables declaration//GEN-END:variables
}
