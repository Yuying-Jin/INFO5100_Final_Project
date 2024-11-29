/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecosystem.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author sunny
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}