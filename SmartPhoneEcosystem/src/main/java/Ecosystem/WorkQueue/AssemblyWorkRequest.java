/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem.WorkQueue;

/**
 *
 * @author sunny
 */
public class AssemblyWorkRequest extends WorkRequest {
    private int failgureQuant;
    private double failgureCost;

    public AssemblyWorkRequest() {
    }

    public int getFailgureQuant() {
        return failgureQuant;
    }

    public void setFailgureQuant(int failgureQuant) {
        this.failgureQuant = failgureQuant;
    }

    public double getFailgureCost() {
        return failgureCost;
    }

    public void setFailgureCost(double failgureCost) {
        this.failgureCost = failgureCost;
    }
    
    
    
}
