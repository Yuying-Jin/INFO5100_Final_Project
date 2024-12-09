/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.QualityInspectorRole;

import Ecosystem.WorkQueue.QualityManagementWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sunny
 */
public class CheckAssemblyRequestJPanel extends javax.swing.JPanel {

    private JPanel workArea;
    private QualityManagementWorkRequest qualityManagementWorkRequest;
    
    /**
     * Creates new form CheckAssemblyRequestJPanel
     */
    public CheckAssemblyRequestJPanel(JPanel userProcessContainer, QualityManagementWorkRequest request) {
        initComponents();
        
        this.qualityManagementWorkRequest = request;
        this.workArea = userProcessContainer;
        
        txtProductName.setText(request.getProductName());
        txtProductQuant.setText(String.valueOf(request.getProductQuant()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        lblProductName = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblProductQuant = new javax.swing.JLabel();
        txtProductQuant = new javax.swing.JTextField();
        lblFailureQuant = new javax.swing.JLabel();
        txtFailureQuant = new javax.swing.JTextField();

        btnBack.setBackground(new java.awt.Color(204, 225, 152));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(204, 225, 152));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblHeading.setText("Result Submission");

        lblProductName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProductName.setText("Product Name:");

        lblCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCost.setText("Cost:");

        txtProductName.setEnabled(false);

        lblProductQuant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProductQuant.setText("Product Quant:");

        txtProductQuant.setEnabled(false);

        lblFailureQuant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFailureQuant.setText("Failure Quant:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSubmit)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCost)
                                .addGap(104, 104, 104)
                                .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblProductName)
                                    .addGap(42, 42, 42)
                                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblProductQuant)
                                    .addGap(40, 40, 40)
                                    .addComponent(txtProductQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblFailureQuant)
                                    .addGap(46, 46, 46)
                                    .addComponent(txtFailureQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeading)
                    .addComponent(btnBack))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductQuant)
                    .addComponent(txtProductQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFailureQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblFailureQuant)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCost))
                .addGap(41, 41, 41)
                .addComponent(btnSubmit)
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        QualityInspectorWorkAreaJPanel jpanel = (QualityInspectorWorkAreaJPanel) component;
        jpanel.populateQualityManagementRequestsTable();
        
        jpanel.populateReassemblyRequestsTable();

        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        qualityManagementWorkRequest.setStatus("Completed");
        qualityManagementWorkRequest.getAssemblyWorkRequest().setFailgureQuant(Integer.parseInt(txtFailureQuant.getText()));
        qualityManagementWorkRequest.setCost(Double.parseDouble(txtCost.getText()));
        JOptionPane.showMessageDialog(null, "Message processed");
        txtFailureQuant.setText("");
        txtCost.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblFailureQuant;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductQuant;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtFailureQuant;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductQuant;
    // End of variables declaration//GEN-END:variables
}
