package Ecosystem.Organization;
import Ecosystem.Role.Role;
import java.util.ArrayList;

public class WarehouseManagementOrganization extends Organization{

    public WarehouseManagementOrganization() {
        super(Organization.Type.WarehouseManagement.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role(Role.RoleType.WarehouseManager));
        roles.add(new Role(Role.RoleType.WarehouseOperator));
        return roles;
    }
}
