/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecosystem.Role;

import Ecosystem.EcoSystem;
import Ecosystem.Enterprise.Enterprise;
import Ecosystem.Organization.Organization;
import Ecosystem.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class Role {
    
    public enum RoleType {
        SystemAdmin("System Admin", "ui.SystemAdminWorkArea.SystemAdminWorkAreaJPanel"),
        EnterprisesAdmin("Enterprises Admin", "ui.EnterprisesAdminWorkArea.EnterprisesAdminWorkAreaJPanel"),
        UIUXSpecialist("UI/UX Specialist", "ui.UIUXSpecialistRole.UIUXWorkAreaJPanel"),
        ProductionCoordinator("Production Coordinator", "ui.ProductionCoordinatorRole.ProductionCoordinatorWorkAreaJPanel"),
        ComponentDevelopmentEngineer("Component Development Engineer", "ui.ComponentDevelopmentEngineerRole.ComponentDevelopmentWorkAreaJPanel"),
        ProductionOperator("Production Operator", "ui.ProductionOperatorRole.ProductionOperatorWorkAreaJPanel"),
        QualityInspector("Quality Inspector", "ui.QualityInspectorRole.QualityInspectorWorkAreaJPanel"),
        WarehouseManager("Warehouse Manager", "ui.WarehouseManagerRole.WarehouseManagerWorkAreaJPanel"),
        WarehouseOperator("Warehouse Operator", "ui.WarehouseOperatorRole.WarehouseOperatorWorkAreaJPanel"),
        DistributionManager("Distribution Manager", "ui.DistributionManagerRole.DistributionManagerWorkAreaJPanel"),
        TransportationPlanner("Transportation Planner", "ui.TransportationPlannerRole.TransportationPlannerWorkAreaJPanel");

        private String value;
        private String workClassName;

        private RoleType(String value, String workClassName) {
            this.value = value;
            this.workClassName = workClassName;
        }

        public String getValue() {
            return value;
        }
        
        public String getWorkClassName() {
            return workClassName;
        }
        

        @Override
        public String toString() {
            return value;
        }
    }
    
    private final RoleType roleType;

    public Role(RoleType roleType) {
        this.roleType = roleType;
    }

    public RoleType getRoleType() {
        return roleType;
    }
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        try {
            // Use reflection to dynamically load the JPanel class
            Class<?> clazz = Class.forName(roleType.getWorkClassName());
            return (JPanel) clazz.getDeclaredConstructor(
                    JPanel.class, UserAccount.class, Organization.class, Enterprise.class, EcoSystem.class)
                    .newInstance(userProcessContainer, account, organization, enterprise, business);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to create work area for role: " + roleType, e);
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    } 
}