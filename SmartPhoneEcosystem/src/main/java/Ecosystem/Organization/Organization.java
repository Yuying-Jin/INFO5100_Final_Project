package Ecosystem.Organization;

import Ecosystem.Employee.EmployeeDirectory;
import Ecosystem.Role.Role;
import Ecosystem.UserAccount.UserAccountDirectory;
import Ecosystem.WorkQueue.WorkQueue;
import java.util.ArrayList;

public abstract class Organization {

    private String name;
    final private int id;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private ArrayList<WorkQueue> histroyWorkQueueList;
    private EmployeeDirectory employeeDirectory;
    private static int counter=0;
    
    public enum Type {
        Admin("Admin Organization"),
        UIUX("UI/UX Organization"),
        ManufacturingManagement("Manufacturing Management Organization"),
        ResearchAndDevelopment("Research and Development Organization"),
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
        this.userAccountDirectory = new UserAccountDirectory();
        this.workQueue = new WorkQueue();
        this.histroyWorkQueueList = new ArrayList<>();
        this.employeeDirectory = new EmployeeDirectory();
        this.id = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public int getId() {
        return id;
    }
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public WorkQueue smartWQ() {
        return workQueue;
    }

    public ArrayList<WorkQueue> getHistoryWorkQueueList() {
        return histroyWorkQueueList;
    }

    public WorkQueue addHistoryWorkQueue() {
        WorkQueue oldWorkQueue = workQueue;
        histroyWorkQueueList.add(oldWorkQueue);
        workQueue = new WorkQueue();  // Reset current work queue after adding to history
        return oldWorkQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
