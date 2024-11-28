package Ecosystem.Organization;
import Ecosystem.Role.Role;
import java.util.ArrayList;

public class UIUXOrganization extends Organization{

    public UIUXOrganization() {
        super(Organization.Type.UIUX.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role(Role.RoleType.UIUXSpecialist));
        return roles;
    }
}
