package Ecosystem.Organization;
import Ecosystem.Role.Role;
import java.util.ArrayList;

public class ManufacturingManagementOrganization extends Organization{

    public ManufacturingManagementOrganization() {
        super(Organization.Type.ManufacturingManagement.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role(Role.RoleType.ProductionCoordinator));
        return roles;
    }
}