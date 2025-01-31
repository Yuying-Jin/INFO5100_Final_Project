/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.WarehouseManagerRole;

import Ecosystem.Organization.Organization;
import Ecosystem.Organization.WarehouseManagementOrganization;
import Ecosystem.WorkQueue.PrepareProductWorkRequest;
import Ecosystem.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sunny
 */
public class RequestPrepareProductsJPanel extends javax.swing.JPanel {
    private Organization organization;
    private JPanel workArea;
    public RequestPrepareProductsJPanel(JPanel workArea, Organization organization) {
        initComponents();
        workRequestJTable.getTableHeader().setFont(new Font("Helvetica Neue", BOLD, 14));
        
        this.organization = (WarehouseManagementOrganization)organization;
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        if (organization == null || organization.getWorkQueue() == null) {
            System.out.println("No organization or no workqueue");
            return;
        }
        
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
//            if (request.getStatus().equals("Pending") || request.getStatus().equals("Accepted")) {
                Object[] row = new Object[7];
                row[0] = request.getProductName();
                row[1] = request;
                row[2] = request.getSender() != null ? request.getSender().getEmployee().getName() : "N/A"; 
                row[3] = request.getReceiver() != null ? request.getReceiver().getEmployee().getName() : "N/A"; 
                row[4] = request.getProductQuant();
                row[5] = request.getCost();
                row[6] = request.getStatus();
                model.addRow(row);
//            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        acceptButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 175));

        workRequestJTable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Message", "Sender", "Receiver", "Quant", "Cost", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        acceptButton.setBackground(new java.awt.Color(204, 225, 152));
        acceptButton.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        acceptButton.setText("Accept");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        refreshJButton.setBackground(new java.awt.Color(204, 225, 152));
        refreshJButton.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel10.setText("Request Prepare Products");

        btnBack.setBackground(new java.awt.Color(204, 225, 152));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(acceptButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshJButton)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(refreshJButton)
                    .addComponent(btnBack))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(acceptButton)
                .addContainerGap(184, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to accept.");
            return;
        }

        PrepareProductWorkRequest request = (PrepareProductWorkRequest) workRequestJTable.getValueAt(selectedRow, 1);

        if ("Accepted".equals(request.getStatus())) {
            JOptionPane.showMessageDialog(null, "This request is already being accepted.");
            return;
        }

        request.setStatus("Accepted");
        populateTable();
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
