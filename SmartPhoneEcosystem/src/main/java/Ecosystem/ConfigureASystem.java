package Ecosystem;

import Ecosystem.Employee.Employee;
import Ecosystem.Role.Role;
import Ecosystem.UserAccount.UserAccount;

public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount(
                "sysadmin",
                "sysadmin",
                employee,
                new Role(Role.RoleType.SystemAdmin)
        );
        
        Employee testEmployee = system.getEmployeeDirectory().createEmployee("pro");
       
        UserAccount test = system.getUserAccountDirectory().createUserAccount(
                "p",
                "p",
                testEmployee,
                new Role(Role.RoleType.TransportationPlanner)
        );
        return system;
    }
    
}
