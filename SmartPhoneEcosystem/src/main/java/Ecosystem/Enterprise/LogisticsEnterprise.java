package Ecosystem.Enterprise;

import Ecosystem.Role.Role;
import java.util.ArrayList;

public class LogisticsEnterprise extends Enterprise {
    
    public LogisticsEnterprise(String name){
        super(name,EnterpriseType.SmartphoneEnterprise);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
