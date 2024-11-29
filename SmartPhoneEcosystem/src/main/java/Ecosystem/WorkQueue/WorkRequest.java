/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecosystem.WorkQueue;

import Ecosystem.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author sunny
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private boolean isApproved;
    private double cost;
    
     public WorkRequest() {
        this.message = "";
        this.sender = null;
        this.receiver = null;
        this.status = "";
        this.requestDate = new Date();
        this.resolveDate = null;
        this.isApproved = false;
        this.cost = 0.0;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount ua) {
        this.sender = ua;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount ua) {
        this.receiver = ua;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String s) {
        this.status = s;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date d) {
        this.requestDate = d;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(boolean info) {
        this.isApproved = info;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
