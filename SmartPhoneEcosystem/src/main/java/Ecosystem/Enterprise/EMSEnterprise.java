package Ecosystem.Enterprise;

import Ecosystem.Role.Role;
import java.util.ArrayList;

public class EMSEnterprise extends Enterprise {
    public EMSEnterprise(String name){
        super(name,EnterpriseType.EMSEnterprise);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
