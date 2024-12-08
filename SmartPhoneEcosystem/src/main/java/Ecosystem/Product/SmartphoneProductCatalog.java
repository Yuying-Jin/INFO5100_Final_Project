/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem.Product;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SmartphoneProductCatalog {
    
    private ArrayList<SmartphoneProduct> productCatalog;

    
    public SmartphoneProductCatalog(){
        productCatalog = new ArrayList<SmartphoneProduct>();
    }
    
    public SmartphoneProduct addProduct(String name, double budget) {
        SmartphoneProduct product = new SmartphoneProduct(name, budget);
        productCatalog.add(product);
        return product;
    }

    public void removeProduct(SmartphoneProduct product) {
        productCatalog.remove(product);
    }

    public ArrayList<SmartphoneProduct> getProductCatalog() {
        return productCatalog;
    }
    
    public SmartphoneProduct searchProductByName(String name){
        for (SmartphoneProduct product : productCatalog) {
            System.out.println("Product name: " + name);

            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println("Product found: " + product);
                return product; 
            }
        }
        return null;
    }

}
