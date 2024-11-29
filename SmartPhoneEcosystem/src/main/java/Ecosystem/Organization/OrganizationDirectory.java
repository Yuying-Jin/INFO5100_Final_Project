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

        
        String organizationClassName = type.getValue()
            .replaceAll("and", "And") 
            .replaceAll("[^\\p{L}]", ""); 

        try {
            Class<?> clazz = Class.forName("Ecosystem.Organization." + organizationClassName);
            organization = (Organization) clazz.getDeclaredConstructor().newInstance();

            if (organization != null) {
                organizationList.add(organization);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return organization;
    }

}