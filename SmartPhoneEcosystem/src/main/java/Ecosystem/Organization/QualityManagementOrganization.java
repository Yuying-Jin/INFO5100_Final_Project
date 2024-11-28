package Ecosystem.Organization;
import Ecosystem.Role.Role;
import java.util.ArrayList;

public class QualityManagementOrganization extends Organization{

    public QualityManagementOrganization() {
        super(Organization.Type.QualityManagement.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role(Role.RoleType.QualityInspector));
        return roles;
    }
}
