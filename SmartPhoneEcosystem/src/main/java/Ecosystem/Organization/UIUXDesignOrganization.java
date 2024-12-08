package Ecosystem.Organization;
import Ecosystem.Role.Role;
import java.util.ArrayList;

public class UIUXDesignOrganization extends Organization{

    public UIUXDesignOrganization() {
        super(Organization.Type.UIUXDesign.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role(Role.RoleType.UIUXSpecialist));
        return roles;
    }
}
