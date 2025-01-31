package Ecosystem.Organization;
import Ecosystem.Role.Role;
import java.util.ArrayList;

public class DistributionTransportationOrganization extends Organization{

    public DistributionTransportationOrganization() {
        super(Organization.Type.DistributionTransportation.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role(Role.RoleType.DistributionManager));
        roles.add(new Role(Role.RoleType.TransportationPlanner));
        return roles;
    }
}
