/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminWorkArea;

import Ecosystem.EcoSystem;
import Ecosystem.Employee.Employee;
import Ecosystem.Enterprise.Enterprise;
import Ecosystem.Network.Network;
import Ecosystem.Role.Role;
import Ecosystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.helper.TextFieldUtils;

/**
 *
 * @author lingduan
 */
public class ViewEnterpriseAdminJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private Network network;
    private UserAccount userAccount;
    private ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ViewEnterpriseAdminJPanel(ManageEnterpriseAdminJPanel m, JPanel userProcessContainer, EcoSystem system, Enterprise e, Network n, UserAccount ua) {
        initComponents();
        
        this.manageEnterpriseAdminJPanel = m;
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.enterprise = e;
        this.network = n;
        this.userAccount = ua;
        populateNetworkComboBox();

    }

    void refreshTextFields(){
        Employee e = userAccount.getEmployee();
        networkJComboBox.setSelectedItem(network.getName());
        enterpriseJComboBox.setSelectedItem(enterprise.getName());
        String gender = e.getGender();
        if (gender== "male") {
            genderButtonGroup.setSelected(maleRadioButton.getModel(),true);
        } else {
            genderButtonGroup.setSelected(femaleRadioButton.getModel(),true);
        }
        usernameJTextField.setText(userAccount.getUsername());
        passwordField.setText(userAccount.getPassword());
        nameJTextField.setText(e.getName());
        emailJTextField.setText(e.getEmail());
        nationJTextField.setText(e.getNation());
        phoneNumberJTextField.setText(e.getPhoneNum());
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        saveJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        femaleRadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nationJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phoneNumberJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        backJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        genderButtonGroup.add(maleRadioButton); genderButtonGroup.add(femaleRadioButton);

        setBackground(new java.awt.Color(255, 245, 175));

        usernameJTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        usernameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameJTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setText("Enterprise");

        enterpriseJComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.setMinimumSize(new java.awt.Dimension(92, 27));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });

        saveJButton.setBackground(new java.awt.Color(204, 225, 152));
        saveJButton.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel7.setText("Gender");

        femaleRadioButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        femaleRadioButton.setText("Female");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setText("Password");

        nameJTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel8.setText("Nation");

        emailJTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        nationJTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel9.setText("Phone Number");

        phoneNumberJTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        phoneNumberJTextField.setForeground(new java.awt.Color(102, 102, 102));
        phoneNumberJTextField.setText("(000) 000-0000");
        phoneNumberJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNumberJTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNumberJTextFieldFocusLost(evt);
            }
        });
        phoneNumberJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberJTextFieldActionPerformed(evt);
            }
        });
        phoneNumberJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNumberJTextFieldKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setText("Name");

        passwordField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("Network");

        networkJComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.setMinimumSize(new java.awt.Dimension(76, 27));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        maleRadioButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        maleRadioButton.setText("Male");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(204, 225, 152));
        backJButton.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel10.setText("View Enterprise Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addGap(72, 72, 72)
                .addComponent(jLabel10)
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(saveJButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(networkJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(maleRadioButton)
                                .addComponent(phoneNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(femaleRadioButton))))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(54, 54, 54)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usernameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addComponent(emailJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addComponent(nationJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addComponent(passwordField))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(backJButton))
                .addGap(282, 282, 282)
                .addComponent(saveJButton)
                .addGap(99, 99, 99))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(maleRadioButton))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(femaleRadioButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(phoneNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(emailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(nationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(158, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed

        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        
        if (!checkUserInputIsValid()) {
        return; // Stop processing if input is invalid
    }

        String username = usernameJTextField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        String email = emailJTextField.getText().trim();
        String name = nameJTextField.getText().trim();
        String nation = nationJTextField.getText().trim();
        String phoneNumber = phoneNumberJTextField.getText().trim();
        String gender = maleRadioButton.isSelected() ? "Male" : "Female";

        
        if(enterprise != (Enterprise) enterpriseJComboBox.getSelectedItem()){
            enterprise.getUserAccountDirectory().createUserAccount(username, password, email,
                    userAccount.getEmployee(), new Role(Role.RoleType.SystemAdmin));
        }
        
        userAccount.setUsername(username);
        userAccount.setPassword(password);

        userAccount.getEmployee().setGender(gender);
        userAccount.getEmployee().setEmail(email);
        userAccount.getEmployee().setNation(nation);
        userAccount.getEmployee().setPhoneNum(phoneNumber);
        
        
         JOptionPane.showMessageDialog(this, "Information has been saved", "Success", JOptionPane.INFORMATION_MESSAGE);
         
         manageEnterpriseAdminJPanel.populateTable();
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageEnterpriseAdminJPanel jpanel = (ManageEnterpriseAdminJPanel) component;
        jpanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void usernameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameJTextFieldActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void phoneNumberJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberJTextFieldActionPerformed

    private void phoneNumberJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberJTextFieldFocusLost
        // TODO add your handling code here:
        TextFieldUtils.focusLost(phoneNumberJTextField, "(000) 000-0000");
    }//GEN-LAST:event_phoneNumberJTextFieldFocusLost

    private void phoneNumberJTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberJTextFieldFocusGained
        // TODO add your handling code here:
        TextFieldUtils.focusGained(phoneNumberJTextField, "(000) 000-0000");
    }//GEN-LAST:event_phoneNumberJTextFieldFocusGained

    private void phoneNumberJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberJTextFieldKeyTyped
        // TODO add your handling code here:
         char keyChar = evt.getKeyChar();
        
        if (Character.isDigit(keyChar) && keyChar != KeyEvent.VK_BACK_SPACE) {
            String input = phoneNumberJTextField.getText().replaceAll("[\\D]", "");  // Remove all non-digit characters
            StringBuilder formattedSSN = new StringBuilder(input);

            if (input.length() >= 0) {
            formattedSSN.insert(0, '(');
            }
            if (input.length() > 3) {
                formattedSSN.insert(4, ')').insert(5, ' ');
            }

            if (input.length() > 6) {
                formattedSSN.insert(9, '-');
            }

            phoneNumberJTextField.setText(formattedSSN.toString());

            // Ensure the caret remains at the end of the text after formatting
            phoneNumberJTextField.setCaretPosition(phoneNumberJTextField.getText().length());
        }
        
        // Consume the event if it's not a digit or backspace to prevent further processing
        if (!Character.isDigit(keyChar) && keyChar != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_phoneNumberJTextFieldKeyTyped
       
    
  private void populateNetworkComboBox() {
         networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
  
   private void populateEnterpriseComboBox(Network network) {
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
        }
        
    }

       private boolean checkUserInputIsValid() {
        String username = usernameJTextField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        String email = emailJTextField.getText().trim();
        String name = nameJTextField.getText().trim();
        String nation = nationJTextField.getText().trim();
        String phoneNumber = phoneNumberJTextField.getText().trim();
        boolean isMaleSelected = maleRadioButton.isSelected();
        boolean isFemaleSelected = femaleRadioButton.isSelected();

    // Check if any required fields are empty
        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || name.isEmpty() || nation.isEmpty() || phoneNumber.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are mandatory. Please fill out all the required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validate email format
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
        JOptionPane.showMessageDialog(this, "Invalid email format. Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    
        if (phoneNumber.replaceAll("[\\D]", "").length() != 10) { 
            JOptionPane.showMessageDialog(null, "Phone number must be exactly 10 digits!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    // Ensure one gender is selected
        if (!isMaleSelected && !isFemaleSelected) {
        JOptionPane.showMessageDialog(this, "Please select a gender.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

     if (password.length() < 4) {
    JOptionPane.showMessageDialog(this, "Password must be at least 4 characters long.", "Error", JOptionPane.ERROR_MESSAGE);
    return false;
}

    // If all validations pass
        return true;
}
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField nationJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneNumberJTextField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
