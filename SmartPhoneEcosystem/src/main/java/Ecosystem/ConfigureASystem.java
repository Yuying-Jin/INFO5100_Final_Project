package Ecosystem;

import Ecosystem.Employee.Employee;
import Ecosystem.Employee.EmployeeDirectory;
import Ecosystem.Enterprise.Enterprise;
import Ecosystem.Enterprise.SmartphoneEnterprise;
import Ecosystem.Network.Network;
import Ecosystem.Organization.Organization;
import Ecosystem.Role.Role;
import Ecosystem.UserAccount.UserAccount;
import Ecosystem.WorkQueue.AssemblyWorkRequest;
import Ecosystem.WorkQueue.ComponentWorkRequest;
import Ecosystem.WorkQueue.DesignWorkRequest;
import Ecosystem.WorkQueue.PrepareProductWorkRequest;
import Ecosystem.WorkQueue.QualityManagementWorkRequest;
import Ecosystem.WorkQueue.TransportationWorkRequest;
import Ecosystem.WorkQueue.WorkQueue;
import Ecosystem.WorkQueue.WorkRequest;
import com.github.javafaker.Faker;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;


public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        Random rand = new Random();
        Faker faker = new Faker();
        FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en"), new RandomService(rand));
        
        EcoSystem system = EcoSystem.getInstance();
        
        // Create Network
        Network network = system.createAndAddNetwork();
        
        // Create Enterprises
        ArrayList<Enterprise> enterpriseList = new ArrayList<>();
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            String name = faker.company().name();
            Enterprise e = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
            enterpriseList.add(e);
        }

        
        // Create Oragnizations
        enterpriseList.get(0).getOrganizationDirectory().createOrganization(Organization.Type.UIUX);
        enterpriseList.get(0).getOrganizationDirectory().createOrganization(Organization.Type.ManufacturingManagement);
        enterpriseList.get(1).getOrganizationDirectory().createOrganization(Organization.Type.ResearchAndDevelopment);
        enterpriseList.get(2).getOrganizationDirectory().createOrganization(Organization.Type.Assembly);
        enterpriseList.get(2).getOrganizationDirectory().createOrganization(Organization.Type.QualityManagement);
        enterpriseList.get(3).getOrganizationDirectory().createOrganization(Organization.Type.WarehouseManagement);
        enterpriseList.get(3).getOrganizationDirectory().createOrganization(Organization.Type.DistributionTransportation);
        

        // Create Employees
        EmployeeDirectory ed = system.getEmployeeDirectory();

        for(int i = 0; i < 14; i++){
            String name = faker.name().fullName();
            String email = faker.internet().emailAddress();
            String gender = (rand.nextBoolean()) ? "female" : "male"; 
            String phoneNum = faker.phoneNumber().phoneNumber();
            
            Employee e = ed.createEmployee(name);
            e.setEmail(email);
            e.setGender(gender);
            e.setPhoneNum(phoneNum);
        }
        
        // Collect usernames and roles
        String[] userList = {"sysadmin", 
            "smartadmin", "componentadmin", "emsadmin", "logadmin",
            "ui", "pc", 
            "cde", 
            "po", "qi", 
            "wm", "wo", 
            "dm", "tp"
        };
        String password = "xxxx";
                
        ArrayList<Role> roleList = new ArrayList<>();
        
        roleList.add(new Role(Role.RoleType.SystemAdmin)); //0
        
        roleList.add(new Role(Role.RoleType.EnterprisesAdmin));
        roleList.add(new Role(Role.RoleType.EnterprisesAdmin));
        roleList.add(new Role(Role.RoleType.EnterprisesAdmin));
        roleList.add(new Role(Role.RoleType.EnterprisesAdmin));

        roleList.add(new Role(Role.RoleType.UIUXSpecialist)); // 5
        roleList.add(new Role(Role.RoleType.ProductionCoordinator)); // 6
        roleList.add(new Role(Role.RoleType.ComponentDevelopmentEngineer)); //7
        roleList.add(new Role(Role.RoleType.ProductionOperator)); // 8
        roleList.add(new Role(Role.RoleType.QualityInspector)); // 9
        roleList.add(new Role(Role.RoleType.WarehouseManager)); // 10
        roleList.add(new Role(Role.RoleType.WarehouseOperator)); // 11
        roleList.add(new Role(Role.RoleType.DistributionManager)); // 12
        roleList.add(new Role(Role.RoleType.TransportationPlanner)); // 13
        
        // Create user accounts
        int i = 0;
        for (Role role : roleList){
            UserAccount ua;
            ua = system.getUserAccountDirectory().createUserAccount(
                    userList[i],
                    password,
                    ed.getEmployeeList().get(i),
                    role
                );
            i++;
        }
        
        // Create smartphone products
        SmartphoneEnterprise smartApple = (SmartphoneEnterprise)enterpriseList.get(0);
        smartApple.setName("Smart Apple");
        
        smartApple.getProductCatalog().addProduct("iPhone 15", 1200.00);
        smartApple.getProductCatalog().addProduct("iPhone 15 Pro", 1500.00);
        smartApple.getProductCatalog().addProduct("iPhone 14", 1000.00);
        smartApple.getProductCatalog().addProduct("iPhone 14 Pro", 1300.00);
        smartApple.getProductCatalog().addProduct("iPhone 13", 900.00);
        smartApple.getProductCatalog().addProduct("iPhone 13 Pro", 1200.00);
        smartApple.getProductCatalog().addProduct("iPhone SE", 700.00);
        smartApple.getProductCatalog().addProduct("iPhone SE 2022", 800.00);
        smartApple.getProductCatalog().addProduct("iPhone 12", 800.00);
        smartApple.getProductCatalog().addProduct("iPhone 12 Pro", 1100.00);
        
        String productName = "Demo Phone";
        int productQuant = 1000;

        // Create work requests
        WorkRequest designWR = new DesignWorkRequest();
        WorkQueue smartWQ = smartApple.getOrganizationDirectory().getOrganizationList().getLast().smartWQ();
        smartApple.getOrganizationDirectory().getOrganizationList().getLast().smartWQ().getWorkRequestList().add(designWR);
        designWR.setMessage("UI design");
        designWR.setStatus("Completed");
        designWR.setCost(2000);
        designWR.setProductName(productName);
        designWR.setProductQuant(productQuant);
        designWR.setSender(system.getUserAccountDirectory().getUserAccountList().get(6));
        designWR.setReceiver(system.getUserAccountDirectory().getUserAccountList().get(5));
        smartApple.getOrganizationDirectory().getOrganizationList().getFirst().smartWQ().getWorkRequestList().add(designWR);
        
        
        ComponentWorkRequest componentWR = new ComponentWorkRequest();
        smartApple.getOrganizationDirectory().getOrganizationList().getLast().smartWQ().getWorkRequestList().add(componentWR);
        componentWR.setMessage("Needs chips");
        componentWR.setStatus("Completed");
        componentWR.setCost(300000);
        componentWR.setProductName("Demo chip");
        componentWR.setProductQuant(productQuant);
        componentWR.setSender(system.getUserAccountDirectory().getUserAccountList().get(6));
        componentWR.setReceiver(system.getUserAccountDirectory().getUserAccountList().get(7));
        enterpriseList.get(1).getOrganizationDirectory().getOrganizationList().getFirst().smartWQ().getWorkRequestList().add(componentWR);

                
        AssemblyWorkRequest assemblyWR = new AssemblyWorkRequest();
        smartApple.getOrganizationDirectory().getOrganizationList().getLast().smartWQ().getWorkRequestList().add(assemblyWR);
        assemblyWR.setMessage("Assembly phones");
        assemblyWR.setStatus("Completed");
        assemblyWR.setCost(25000.0);
        assemblyWR.setProductName(productName);
        assemblyWR.setProductQuant(productQuant);
        assemblyWR.setSender(system.getUserAccountDirectory().getUserAccountList().get(6));
        assemblyWR.setReceiver(system.getUserAccountDirectory().getUserAccountList().get(8));
        enterpriseList.get(2).getOrganizationDirectory().getOrganizationList().getFirst().smartWQ().getWorkRequestList().add(assemblyWR);
        
        
        QualityManagementWorkRequest qmWR = new QualityManagementWorkRequest();
        qmWR.setMessage("Check qualities");
        qmWR.setStatus("Completed");
        qmWR.setCost(10000.0);
        qmWR.setProductName(productName);
        qmWR.setProductQuant(productQuant);
        qmWR.setSender(system.getUserAccountDirectory().getUserAccountList().get(8));
        qmWR.setReceiver(system.getUserAccountDirectory().getUserAccountList().get(9));
        enterpriseList.get(2).getOrganizationDirectory().getOrganizationList().getLast().smartWQ().getWorkRequestList().add(qmWR);
        
        // Reassumbly due to failgure
        assemblyWR.setMessage("Reassumbly phones");
        assemblyWR.setStatus("Completed");
        assemblyWR.setCost(25800.0);
        assemblyWR.setFailgureQuant(80);
        assemblyWR.setSender(system.getUserAccountDirectory().getUserAccountList().get(9));
        assemblyWR.setReceiver(system.getUserAccountDirectory().getUserAccountList().get(8));
        
        
        // Smartphone Enterprise Production Operator requests Distribution Manager
        TransportationWorkRequest transWR = new TransportationWorkRequest();
        smartApple.getOrganizationDirectory().getOrganizationList().getLast().smartWQ().getWorkRequestList().add(transWR);
        transWR.setMessage("Transport 1000 phones to stores");
        transWR.setStatus("Pending");
        transWR.setProductName(productName);
        transWR.setProductQuant(productQuant);
        transWR.setSender(system.getUserAccountDirectory().getUserAccountList().get(6));
        transWR.setReceiver(system.getUserAccountDirectory().getUserAccountList().get(12));
        enterpriseList.get(3).getOrganizationDirectory().getOrganizationList().getLast().smartWQ().getWorkRequestList().add(transWR);

        
        // Distribution Manager requests WarehouseManager to prepare products
        PrepareProductWorkRequest prepareWR = new PrepareProductWorkRequest();
        smartApple.getOrganizationDirectory().getOrganizationList().getLast().smartWQ().getWorkRequestList().add(prepareWR);
        prepareWR.setMessage("Prepare 1000 phones to transport");
        prepareWR.setStatus("Pending");
        prepareWR.setProductName(productName);
        prepareWR.setProductQuant(productQuant);
        prepareWR.setSender(system.getUserAccountDirectory().getUserAccountList().get(12));
        prepareWR.setReceiver(system.getUserAccountDirectory().getUserAccountList().get(10));
        enterpriseList.get(3).getOrganizationDirectory().getOrganizationList().getFirst().smartWQ().getWorkRequestList().add(prepareWR);
        
        // Warehouse Manager passes work request to Warehouse Operator
        prepareWR.setSender(system.getUserAccountDirectory().getUserAccountList().get(10));
        prepareWR.setReceiver(system.getUserAccountDirectory().getUserAccountList().get(11));
        prepareWR.setProductQuantHad(rand.nextInt(200) + productQuant);
        // Warehouse Operator complete the request and set cost
        prepareWR.setCost(5000);
        prepareWR.setStatus("Completed");

        // After product prepared, Distribution Manager pass work request to Transportation Planner
        transWR.setSender(system.getUserAccountDirectory().getUserAccountList().get(12));
        transWR.setReceiver(system.getUserAccountDirectory().getUserAccountList().get(13));
        // Transportation Planner complete the request and set cost
        transWR.setCost(50000);
        transWR.setStatus("Complete");
        
        // workflow done, add the current work queue to the history work queue
        smartApple.getOrganizationDirectory().getOrganizationList().getLast().getHistoryWorkQueueList().add(smartWQ);
        
        return system;
    }
    
}
