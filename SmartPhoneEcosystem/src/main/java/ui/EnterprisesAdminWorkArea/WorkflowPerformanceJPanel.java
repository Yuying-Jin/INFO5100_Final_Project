/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.EnterprisesAdminWorkArea;

import Ecosystem.EcoSystem;
import Ecosystem.Enterprise.Enterprise;
import Ecosystem.Organization.Organization;
import Ecosystem.UserAccount.UserAccount;
import Ecosystem.WorkQueue.AssemblyWorkRequest;
import Ecosystem.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lingduan
 */
public class WorkflowPerformanceJPanel extends javax.swing.JPanel {
      JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem ecosystem;
    private ArrayList<WorkRequest> workRequestList;
    /**
     * Creates new form WorkflowPerformance
     */
    public WorkflowPerformanceJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.ecosystem = business;
        this.workRequestList = new ArrayList();
        
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            for(WorkRequest wr : o.getWorkQueue().getWorkRequestList()){
                workRequestList.add(wr);
            }
        }
        
        
        calculateFailureCost();
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
        jLabel1 = new javax.swing.JLabel();
        txtTotalCost = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFailureCost = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 175));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Product Quant", "Approved", "Message", "Sender", "Receiver", "Cost", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            workRequestJTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Total Cost:");

        txtTotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCostActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel10.setText("Workflow Performance ");

        btnCalculate.setBackground(new java.awt.Color(204, 225, 152));
        btnCalculate.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnCalculate.setText("Calculate Total Cost");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setText("Failure Cost:");

        backJButton.setBackground(new java.awt.Color(204, 225, 152));
        backJButton.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.setMaximumSize(new java.awt.Dimension(80, 30));
        backJButton.setMinimumSize(new java.awt.Dimension(80, 30));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(txtFailureCost, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtFailureCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCalculate))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCostActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
         double totalCost = 0.0; // Initialize the total cost


        for (WorkRequest wr : workRequestList) {
            if (wr.getIsApproved()) {
                totalCost += wr.getCost(); // Sum up the approved costs
                if(wr instanceof AssemblyWorkRequest){
                    totalCost += ((AssemblyWorkRequest)wr).getFailgureCost();
                }
            }
        }
        txtTotalCost.setText(String.valueOf(totalCost));

    }//GEN-LAST:event_btnCalculateActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
       
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        
        EnterprisesAdminWorkAreaJPanel enterprisesAdminPanel = (EnterprisesAdminWorkAreaJPanel) component;
        userProcessContainer.add("enterprisesAdminPanel", enterprisesAdminPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFailureCost;
    private javax.swing.JTextField txtTotalCost;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0); // Clear any existing rows
        
        for(WorkRequest wr : workRequestList){
            Object[] row = new Object[8];
            row[0] = wr.getProductName();
            row[1] = wr.getProductQuant();
            row[2] = wr.getIsApproved();
            row[3] = wr.getMessage();
            row[4] = wr.getSender().getEmployee().getName();
            row[5] = (wr.getReceiver() != null) ? wr.getReceiver().getEmployee().getName() : "N/A"; 
            row[6] = wr.getCost(); 
            row[7] = wr.getStatus(); 

            model.addRow(row);
        }
      
    }
    
    private void calculateFailureCost(){
        double failureCost = 0;
        for(WorkRequest wr : workRequestList){
            if(wr instanceof AssemblyWorkRequest){
                failureCost += ((AssemblyWorkRequest)wr).getFailgureCost();
            }
        }
        txtFailureCost.setText(String.valueOf(failureCost));
    }
}