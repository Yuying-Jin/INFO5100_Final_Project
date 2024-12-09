/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.WarehouseOperatorRole;

import Ecosystem.Organization.Organization;
import Ecosystem.WorkQueue.PrepareProductWorkRequest;
import Ecosystem.WorkQueue.WorkRequest;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sunny
 */
public class ProcessProductRequestJPanel extends javax.swing.JPanel {
    private Organization organization;
   
    public ProcessProductRequestJPanel(Organization organization) {
        this.organization = organization;
        initComponents();
        workRequestJTable.getTableHeader().setFont(new Font("Helvetica Neue", BOLD, 14));
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        completeJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

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

        completeJButton.setBackground(new java.awt.Color(204, 225, 152));
        completeJButton.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        completeJButton.setText("Complete");
        completeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeJButtonActionPerformed(evt);
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
        jLabel10.setText("Process Product Request");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(completeJButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshJButton)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(completeJButton)
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        if (organization == null || organization.getWorkQueue() == null) {
            System.out.println("No organization or no workqueue");
            return;
        }
        
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if (request.getStatus().equals("Accepted") || request.getStatus().equals("Completed")) {
                Object[] row = new Object[7];
                row[0] = request.getProductName();
                row[1] = request;
                row[2] = request.getSender() != null ? request.getSender().getEmployee().getName() : "N/A"; 
                row[3] = request.getReceiver() != null ? request.getReceiver().getEmployee().getName() : "N/A"; 
                row[4] = request.getProductQuant();
                row[5] = request.getCost();
                row[6] = request.getStatus();
                model.addRow(row);
            }
        }
    }
    private void completeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to Complete.");
            return;
        }

        PrepareProductWorkRequest request = (PrepareProductWorkRequest) workRequestJTable.getValueAt(selectedRow, 1);

        if ("Completed".equals(request.getStatus())) {
            JOptionPane.showMessageDialog(null, "This request is already being Completed.");
            return;
        }

        request.setStatus("Completed");
        populateTable();
    }//GEN-LAST:event_completeJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completeJButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

}
