/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem.WorkQueue;

/**
 *
 * @author sunny
 */
public class QualityManagementWorkRequest extends WorkRequest {
    
    private AssemblyWorkRequest assemblyWorkRequest;
    public QualityManagementWorkRequest(AssemblyWorkRequest request){
        this.assemblyWorkRequest = request;
    }

    public AssemblyWorkRequest getAssemblyWorkRequest() {
        return assemblyWorkRequest;
    }

    public void setAssemblyWorkRequest(AssemblyWorkRequest assemblyWorkRequest) {
        this.assemblyWorkRequest = assemblyWorkRequest;
    }
    
}
