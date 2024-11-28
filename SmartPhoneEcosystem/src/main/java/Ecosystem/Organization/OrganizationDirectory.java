package Ecosystem.Organization;

import Ecosystem.Organization.Organization.Type;
import java.util.ArrayList;


public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type) {
        Organization organization = null;

        if (type.getValue().equals(Type.UIUX.getValue())) {
            organization = new UIUXOrganization();
        } else if (type.getValue().equals(Type.ManufacturingManagement.getValue())) {
            organization = new ManufacturingManagementOrganization();
        } else if (type.getValue().equals(Type.ResearchAndDevelopment.getValue())) {
            organization = new ResearchAndDevelopmentOrganization();
        } else if (type.getValue().equals(Type.Assembly.getValue())) {
            organization = new AssemblyOrganization();
        } else if (type.getValue().equals(Type.QualityManagement.getValue())) {
            organization = new QualityManagementOrganization();
        } else if (type.getValue().equals(Type.WarehouseManagement.getValue())) {
            organization = new WarehouseManagementOrganization();
        } else if (type.getValue().equals(Type.DistributionTransportation.getValue())) {
            organization = new DistributionTransportationOrganization();
        }

        if (organization != null) {
            organizationList.add(organization);
        }

        return organization;
    }

}