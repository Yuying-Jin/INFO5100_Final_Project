package Ecosystem.Organization;
import Ecosystem.Role.Role;
import java.util.ArrayList;

public class AssemblyOrganization extends Organization{

    public AssemblyOrganization() {
        super(Organization.Type.Assembly.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
//        roles.add(new LabAssistantRole());
        return roles;
    }
}
