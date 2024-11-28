package Ecosystem;

import Ecosystem.Employee.Employee;
import Ecosystem.Role.SystemAdminRole;
import Ecosystem.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
//        UserAccount labManager = system.getUserAccountDirectory().createUserAccount("labManager", "sysadmin", employee, new LabManagerRole());
        
        return system;
    }
    
}
