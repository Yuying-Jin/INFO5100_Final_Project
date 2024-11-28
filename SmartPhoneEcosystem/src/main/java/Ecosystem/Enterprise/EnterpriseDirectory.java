/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecosystem.Enterprise;

import Ecosystem.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    
    // Create and add enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;

        if (type == Enterprise.EnterpriseType.SmartphoneEnterprise) {
            enterprise = new SmartphoneEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.ComponentSupplierEnterprise) {
            enterprise = new ComponentSupplierEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.EMSEnterprise) {
            enterprise = new EMSEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.LogisticsEnterprise) {
            enterprise = new LogisticsEnterprise(name);
        }

        if (enterprise != null) {
            enterpriseList.add(enterprise);
        }

        return enterprise;
    }

//    //Create enterprise
//    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
//        Enterprise enterprise=null;
//        if(type==Enterprise.EnterpriseType.SmartphoneEnterprise){
//            enterprise=new SmartphoneEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//        return enterprise;
//    }
}
