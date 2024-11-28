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
public abstract class Role {
    
    public enum RoleType {
        SystemAdmin("System Admin"),
        EnterprisesAdmin("Enterprises Admin"),
        UIUXSpecialist("UI/UX Specialist"),
        ProductionCoordinator("Production Coordinator"),
        ComponentDevelopmentEngineer("Component Development Engineer"),
        ProductionOperator("Production Operator"),
        QualityInspector("Quality Inspector"),
        WarehouseManager("Warehouse Manager"),
        WarehouseOperator("Warehouse Operator"),
        DistributionManager("Distribution Manager"),
        TransportationPlanner("Transportation Planner");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    
//    public enum RoleType{
//        Admin("Admin"),
//        Doctor("Doctor"),
//        LabAssistant("Lab Assistant");
//        
//        private String value;
//        private RoleType(String value){
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }
//    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}