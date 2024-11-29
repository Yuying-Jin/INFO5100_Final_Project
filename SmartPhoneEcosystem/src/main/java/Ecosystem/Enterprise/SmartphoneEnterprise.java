package Ecosystem.Enterprise;

import Ecosystem.Product.SmartphoneProductCatalog;
import Ecosystem.Role.Role;
import java.util.ArrayList;

public class SmartphoneEnterprise extends Enterprise {
    
    private SmartphoneProductCatalog productCatalog;
    
    public SmartphoneEnterprise(String name){
        super(name,EnterpriseType.SmartphoneEnterprise);
        productCatalog = new SmartphoneProductCatalog();
    }

    public SmartphoneProductCatalog getProductCatalog() {
        return productCatalog;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
