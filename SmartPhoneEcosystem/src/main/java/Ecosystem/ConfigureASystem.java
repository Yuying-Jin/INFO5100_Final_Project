package Ecosystem;

import Ecosystem.Employee.Employee;
import Ecosystem.Employee.EmployeeDirectory;
import Ecosystem.Enterprise.Enterprise;
import Ecosystem.Enterprise.SmartphoneEnterprise;
import Ecosystem.Network.Network;
import Ecosystem.Organization.Organization;
import Ecosystem.Product.SmartphoneProduct;
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
        network.setName("smartphone");
        
        // Create Enterprises
        ArrayList<Enterprise> enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            String name = faker.company().name();
            Enterprise e = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
            enterpriseList.add(e);
        }
        
        // Create Oragnizations
        Organization org1 = enterpriseList.get(0).getOrganizationDirectory().createOrganization(Organization.Type.UIUXDesign);
        Organization org2 = enterpriseList.get(0).getOrganizationDirectory().createOrganization(Organization.Type.ManufacturingManagement);
        Organization org3 = enterpriseList.get(1).getOrganizationDirectory().createOrganization(Organization.Type.ResearchAndDevelopment);
        Organization org4 = enterpriseList.get(2).getOrganizationDirectory().createOrganization(Organization.Type.Assembly);
        Organization org5 = enterpriseList.get(2).getOrganizationDirectory().createOrganization(Organization.Type.QualityManagement);
        Organization org6 = enterpriseList.get(3).getOrganizationDirectory().createOrganization(Organization.Type.WarehouseManagement);
        Organization org7 = enterpriseList.get(3).getOrganizationDirectory().createOrganization(Organization.Type.DistributionTransportation);

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
        
        roleList.add(new Role(Role.RoleType.EnterprisesAdmin)); // 1
        roleList.add(new Role(Role.RoleType.EnterprisesAdmin)); // 2
        roleList.add(new Role(Role.RoleType.EnterprisesAdmin)); // 3
        roleList.add(new Role(Role.RoleType.EnterprisesAdmin)); // 4

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
        UserAccount sysAdmin = system.getUserAccountDirectory().createUserAccount(
                    userList[0],
                    password,
                    ed.getEmployeeList().get(0),
                    new Role(Role.RoleType.SystemAdmin));

        UserAccount smartAdmin = enterpriseList.get(0).getUserAccountDirectory().createUserAccount(
            userList[1],
            password,
            ed.getEmployeeList().get(1),
            new Role(Role.RoleType.EnterprisesAdmin));

        UserAccount componentAdmin =  enterpriseList.get(1).getUserAccountDirectory().createUserAccount(
            userList[2],
            password,
            ed.getEmployeeList().get(2),
            new Role(Role.RoleType.EnterprisesAdmin));

        UserAccount assemblyAdmin =  enterpriseList.get(2).getUserAccountDirectory().createUserAccount(
            userList[3],
            password,
            ed.getEmployeeList().get(3),
            new Role(Role.RoleType.EnterprisesAdmin));

        UserAccount logisticsAdmin =  enterpriseList.get(3).getUserAccountDirectory().createUserAccount(
            userList[4],
            password,
            ed.getEmployeeList().get(4),
            new Role(Role.RoleType.EnterprisesAdmin));

        UserAccount ui = org1.getUserAccountDirectory().createUserAccount(
            userList[5],
            password,
            ed.getEmployeeList().get(5),
            new Role(Role.RoleType.UIUXSpecialist));

        UserAccount pc = org2.getUserAccountDirectory().createUserAccount(
            userList[6],
            password,
            ed.getEmployeeList().get(6),
            new Role(Role.RoleType.ProductionCoordinator));

        UserAccount cde = org3.getUserAccountDirectory().createUserAccount(
            userList[7],
            password,
            ed.getEmployeeList().get(7),
            new Role(Role.RoleType.ComponentDevelopmentEngineer));

        UserAccount po = org4.getUserAccountDirectory().createUserAccount(
            userList[8],
            password,
            ed.getEmployeeList().get(8),
            new Role(Role.RoleType.ProductionOperator));

        UserAccount qi = org5.getUserAccountDirectory().createUserAccount(
            userList[9],
            password,
            ed.getEmployeeList().get(9),
            new Role(Role.RoleType.QualityInspector));

        UserAccount wm = org6.getUserAccountDirectory().createUserAccount(
            userList[10],
            password,
            ed.getEmployeeList().get(10),
            new Role(Role.RoleType.WarehouseManager));

        UserAccount wo = org6.getUserAccountDirectory().createUserAccount(
            userList[11],
            password,
            ed.getEmployeeList().get(11),
            new Role(Role.RoleType.WarehouseOperator));

        UserAccount dm = org7.getUserAccountDirectory().createUserAccount(
            userList[12],
            password,
            ed.getEmployeeList().get(12),
            new Role(Role.RoleType.DistributionManager));

        UserAccount tp = org7.getUserAccountDirectory().createUserAccount(
            userList[13],
            password,
            ed.getEmployeeList().get(13),
            new Role(Role.RoleType.TransportationPlanner));
        
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
        
        String productName = smartApple.getProductCatalog().getProductCatalog().getFirst().getName();
        int productQuant = 1000;

        // Create work requests
        WorkRequest designWR = new DesignWorkRequest();
        WorkQueue smartWQ = org2.getWorkQueue();
        org2.getHistoryWorkQueueList().add(smartWQ); // add the current work queue to the history work queue for data analysis later
        
        org2.getWorkQueue().getWorkRequestList().add(designWR);
        pc.getWorkQueue().getWorkRequestList().add(designWR);
        
        designWR.setMessage("UI design");
        designWR.setStatus("Completed");
        designWR.setCost(2000);
        designWR.setProductName(productName);
        designWR.setProductQuant(productQuant);
        designWR.setSender(org2.getUserAccountDirectory().getUserAccountList().get(0));
        designWR.setReceiver(org1.getUserAccountDirectory().getUserAccountList().get(0));
        org1.getWorkQueue().getWorkRequestList().add(designWR);
        ui.getWorkQueue().getWorkRequestList().add(designWR);
        
        
        ComponentWorkRequest componentWR = new ComponentWorkRequest();
        org2.getWorkQueue().getWorkRequestList().add(componentWR);
        pc.getWorkQueue().getWorkRequestList().add(componentWR);
        componentWR.setMessage("Needs chips");
        componentWR.setStatus("Completed");
        componentWR.setCost(300000);
        componentWR.setProductName("Demo chip");
        componentWR.setProductQuant(productQuant);
        componentWR.setSender(org2.getUserAccountDirectory().getUserAccountList().get(0));
        componentWR.setReceiver(org3.getUserAccountDirectory().getUserAccountList().get(0));
        org3.getWorkQueue().getWorkRequestList().add(componentWR);
        cde.getWorkQueue().getWorkRequestList().add(componentWR);
                
        AssemblyWorkRequest assemblyWR = new AssemblyWorkRequest();
        org2.getWorkQueue().getWorkRequestList().add(assemblyWR);
        pc.getWorkQueue().getWorkRequestList().add(assemblyWR);
        assemblyWR.setMessage("Assembly phones");
        assemblyWR.setStatus("Completed");
        assemblyWR.setCost(25000.0);
        assemblyWR.setProductName(productName);
        assemblyWR.setProductQuant(productQuant);
        assemblyWR.setSender(org2.getUserAccountDirectory().getUserAccountList().get(0));
        assemblyWR.setReceiver(org4.getUserAccountDirectory().getUserAccountList().get(0));
        org4.getWorkQueue().getWorkRequestList().add(assemblyWR);
        po.getWorkQueue().getWorkRequestList().add(assemblyWR);
        
        
        QualityManagementWorkRequest qmWR = new QualityManagementWorkRequest(assemblyWR);
        qmWR.setMessage("Check qualities");
        qmWR.setStatus("Completed");
        qmWR.setCost(10000.0);
        qmWR.setProductName(productName);
        qmWR.setProductQuant(productQuant);
        qmWR.setSender(org4.getUserAccountDirectory().getUserAccountList().get(0));
        qmWR.setReceiver(org5.getUserAccountDirectory().getUserAccountList().get(0));
        org5.getWorkQueue().getWorkRequestList().add(qmWR);
        qi.getWorkQueue().getWorkRequestList().add(qmWR);
        
        // Reassumbly due to failgure
        assemblyWR.setMessage("Reassumbly phones");
        assemblyWR.setStatus("Completed");
        assemblyWR.setCost(25800.0);
        assemblyWR.setFailgureQuant(80);
        assemblyWR.setFailgureCost(200);
        assemblyWR.setSender(org5.getUserAccountDirectory().getUserAccountList().get(0));
        assemblyWR.setReceiver(org4.getUserAccountDirectory().getUserAccountList().get(0));
        
        
        // Smartphone Enterprise Production Operator requests Distribution Manager
        TransportationWorkRequest transWR = new TransportationWorkRequest();
        org2.getWorkQueue().getWorkRequestList().add(transWR);
        pc.getWorkQueue().getWorkRequestList().add(transWR);
        transWR.setMessage("Transport 1000 phones to stores");
        transWR.setStatus("Pending");
        transWR.setProductName(productName);
        transWR.setProductQuant(productQuant);
        transWR.setSender(org2.getUserAccountDirectory().getUserAccountList().get(0));
        transWR.setReceiver(org7.getUserAccountDirectory().getUserAccountList().get(0));
        org7.getWorkQueue().getWorkRequestList().add(transWR);
        dm.getWorkQueue().getWorkRequestList().add(transWR);

        
        // Distribution Manager requests WarehouseManager to prepare products
        PrepareProductWorkRequest prepareWR = new PrepareProductWorkRequest();
        org2.getWorkQueue().getWorkRequestList().add(prepareWR);
        pc.getWorkQueue().getWorkRequestList().add(prepareWR);
        prepareWR.setMessage("Prepare 1000 phones to transport");
        prepareWR.setStatus("Pending");
        prepareWR.setProductName(productName);
        prepareWR.setProductQuant(productQuant);
        prepareWR.setSender(org7.getUserAccountDirectory().getUserAccountList().get(0));
        prepareWR.setReceiver(org6.getUserAccountDirectory().getUserAccountList().get(0));
        org6.getWorkQueue().getWorkRequestList().add(prepareWR);
        wm.getWorkQueue().getWorkRequestList().add(prepareWR);
        
        // Warehouse Manager passes work request to Warehouse Operator
        prepareWR.setSender(org6.getUserAccountDirectory().getUserAccountList().get(0));
        prepareWR.setReceiver(org6.getUserAccountDirectory().getUserAccountList().get(1));
        prepareWR.setProductQuantHad(rand.nextInt(200) + productQuant);
        // Warehouse Operator complete the request and set cost
        prepareWR.setCost(5000);
//        prepareWR.setStatus("Completed");

        // After product prepared, Distribution Manager pass work request to Transportation Planner
        transWR.setSender(org7.getUserAccountDirectory().getUserAccountList().get(0));
        transWR.setReceiver(org7.getUserAccountDirectory().getUserAccountList().get(1));
        // Transportation Planner complete the request and set cost
        transWR.setCost(50000);
//        transWR.setStatus("Completed");
        
        
        return system;
    }
    
}
