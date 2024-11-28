package Ecosystem.Enterprise;

import Ecosystem.Role.Role;
import java.util.ArrayList;

public class ComponentSupplierEnterprise extends Enterprise {
    
    public ComponentSupplierEnterprise(String name){
        super(name,EnterpriseType.ComponentSupplierEnterprise);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
