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

    public AssemblyWorkRequest() {
    }

    public int getFailgureQuant() {
        return failgureQuant;
    }

    public void setFailgureQuant(int failgureQuant) {
        this.failgureQuant = failgureQuant;
    }
    
}
