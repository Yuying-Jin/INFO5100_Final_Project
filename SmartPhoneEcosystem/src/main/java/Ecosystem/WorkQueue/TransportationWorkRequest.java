/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem.WorkQueue;

/**
 *
 * @author sunny
 */
public class TransportationWorkRequest extends WorkRequest {
    private String transporationMode;
    private String logisticProviders;

    public TransportationWorkRequest() {
    }

    public String getTransporationMode() {
        return transporationMode;
    }

    public void setTransporationMode(String transporationMode) {
        this.transporationMode = transporationMode;
    }

    public String getLogisticProviders() {
        return logisticProviders;
    }

    public void setLogisticProviders(String logisticProviders) {
        this.logisticProviders = logisticProviders;
    }
    
    
}
