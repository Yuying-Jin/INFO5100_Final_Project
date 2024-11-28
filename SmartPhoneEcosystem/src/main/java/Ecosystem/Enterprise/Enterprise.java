 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecosystem.Enterprise;

import Ecosystem.Organization.Organization;
import Ecosystem.Organization.OrganizationDirectory;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType {
        SmartphoneEnterprise("Smartphone Enterprise"),
        ComponentSupplierEnterprise("Component Supplier Enterprise"),
        EMSEnterprise("EMS Enterprise"),
        LogisticsEnterprise("Logistics Enterprise");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }


    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
}
