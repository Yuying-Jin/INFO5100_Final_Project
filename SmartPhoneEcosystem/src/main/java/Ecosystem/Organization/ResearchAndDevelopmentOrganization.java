package Ecosystem.Organization;
import Ecosystem.Role.Role;
import java.util.ArrayList;

public class ResearchAndDevelopmentOrganization extends Organization{

    public ResearchAndDevelopmentOrganization() {
        super(Organization.Type.ResearchAndDevelopment.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
//        roles.add(new LabAssistantRole());
        return roles;
    }
}
