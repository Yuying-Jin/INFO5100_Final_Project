package Ecosystem.Organization;

import Ecosystem.Employee.EmployeeDirectory;
import Ecosystem.Role.Role;
import Ecosystem.UserAccount.UserAccountDirectory;
import Ecosystem.WorkQueue.WorkQueue;
import java.util.ArrayList;

public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type {
        Admin("Admin Organization"),
        UIUX("UI/UX Organization"),
        ManufacturingManagement("Manufacturing Management Organization"),
        ResearchAndDevelopment("Research and Development Center"),
        Assembly("Assembly Organization"),
        QualityManagement("Quality Management Organization"),
        WarehouseManagement("Warehouse Management Organization"),
        DistributionTransportation("Distribution/Transportation Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
