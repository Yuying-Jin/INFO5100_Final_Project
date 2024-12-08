/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ProductionCoordinatorRole;

import Ecosystem.Enterprise.Enterprise;
import Ecosystem.Organization.Organization;
import Ecosystem.UserAccount.UserAccount;
import javax.swing.JPanel;
import Ecosystem.EcoSystem;
import Ecosystem.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sunny
 */
public class ProductionCoordinatorWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel workArea;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    
    /**
     * Creates new form ProductionCoordinatorWorkAreaJPanel
     */
    public ProductionCoordinatorWorkAreaJPanel() {
        initComponents();
    }

    public ProductionCoordinatorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.workArea = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = ecosystem;
        
        populateRequestTable();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnRequestDesign = new javax.swing.JButton();
        btnRequestComponent = new javax.swing.JButton();
        btnRequestAssembly = new javax.swing.JButton();
        btnRequestLogistics = new javax.swing.JButton();

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Production Coordinator Work Area");

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
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
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblWorkRequests);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jPanel1.setOpaque(false);

        btnRequestDesign.setText("Request UI/UX Design");
        btnRequestDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestDesignActionPerformed(evt);
            }
        });

        btnRequestComponent.setText("Request Component");
        btnRequestComponent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestComponentActionPerformed(evt);
            }
        });

        btnRequestAssembly.setText("Request Assembly");
        btnRequestAssembly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestAssemblyActionPerformed(evt);
            }
        });

        btnRequestLogistics.setText("Request Logistics Service");
        btnRequestLogistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestLogisticsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnRequestDesign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRequestComponent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRequestAssembly)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRequestLogistics)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRequestDesign)
                    .addComponent(btnRequestComponent)
                    .addComponent(btnRequestAssembly)
                    .addComponent(btnRequestLogistics))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefresh)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestDesignActionPerformed
        CardLayout layout = (CardLayout) workArea.getLayout();
        workArea.add("RequestDesignJPanel", new RequestDesignJPanel(workArea, userAccount, enterprise));
        layout.next(workArea);

    }//GEN-LAST:event_btnRequestDesignActionPerformed

    private void btnRequestComponentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestComponentActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) workArea.getLayout();
        workArea.add("RequestComponentJPanel", new RequestComponentJPanel(workArea, userAccount, system));
        layout.next(workArea);
    }//GEN-LAST:event_btnRequestComponentActionPerformed

    private void btnRequestAssemblyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestAssemblyActionPerformed
        // TODO add your handling code here:
//        CardLayout layout = (CardLayout) workArea.getLayout();
//        workArea.add("RequestAssemblyJPanel", new RequestAssemblyJPanel(workArea, userAccount, system));
//        layout.next(workArea);
    }//GEN-LAST:event_btnRequestAssemblyActionPerformed

    private void btnRequestLogisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestLogisticsActionPerformed
        // TODO add your handling code here:
//        CardLayout layout = (CardLayout) workArea.getLayout();
//        workArea.add("RequestLabTestJPanel", new RequestLogisticsServiceJPanel(workArea, userAccount, system));
//        layout.next(workArea);
    }//GEN-LAST:event_btnRequestLogisticsActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRequestAssembly;
    private javax.swing.JButton btnRequestComponent;
    private javax.swing.JButton btnRequestDesign;
    private javax.swing.JButton btnRequestLogistics;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables

    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[7];
            row[0] = request.getProductName();
            row[1] = request.getMessage();
            row[2] = request.getSender();
            row[3] = request.getReceiver();
            row[4] = request.getProductQuant();
            row[5] = request.getCost();
            row[6] = request.getStatus();
            
            model.addRow(row);
        }
    }
}
