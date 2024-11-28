package Ecosystem.Enterprise;

import Ecosystem.Role.Role;
import java.util.ArrayList;

public class SmartphoneEnterprise extends Enterprise {
    
    public SmartphoneEnterprise(String name){
        super(name,EnterpriseType.SmartphoneEnterprise);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
