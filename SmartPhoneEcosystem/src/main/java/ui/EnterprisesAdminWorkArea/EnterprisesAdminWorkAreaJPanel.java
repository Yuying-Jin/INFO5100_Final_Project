/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.EnterprisesAdminWorkArea;

import Ecosystem.EcoSystem;
import Ecosystem.Enterprise.Enterprise;
import Ecosystem.Organization.Organization;
import Ecosystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.EnterprisesAdminWorkArea.ManageWorkRequestJPanel;


/**
 *
 * @author sunny
 */
public class EnterprisesAdminWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount account;

    /**
     * Creates new form EnterprisesAdminWorkAreaJPanel
     */
    public EnterprisesAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
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

        btnManageWorkRequest = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 175));

        btnManageWorkRequest.setBackground(new java.awt.Color(204, 225, 152));
        btnManageWorkRequest.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnManageWorkRequest.setText("Manage Work Request");
        btnManageWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageWorkRequestActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnManageWorkRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(valueLabel)))
                .addGap(29, 29, 29)
                .addComponent(btnManageWorkRequest)
                .addContainerGap(263, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageWorkRequestActionPerformed
       ManageWorkRequestJPanel manageWorkRequestJPanel = new ManageWorkRequestJPanel(userProcessContainer, account, organization, enterprise, ecosystem);
       userProcessContainer.add("manageWorkRequestJPanel", manageWorkRequestJPanel);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
      
    }//GEN-LAST:event_btnManageWorkRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageWorkRequest;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
