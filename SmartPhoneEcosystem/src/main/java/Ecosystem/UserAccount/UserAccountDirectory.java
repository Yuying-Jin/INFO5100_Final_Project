/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecosystem.UserAccount;

import Ecosystem.Employee.Employee;
import Ecosystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
            if (ua.getEmail().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount findUserAccount(String acc){
        for (UserAccount ua : userAccountList) {
//            System.out.println("[Debug]" + acc + " " + ua.getUsername() + " " + ua.getEmail());
            if (ua.getEmail().equals(acc)){
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, String email, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmail(email);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public void removeUserAccount(UserAccount userAccount) {
        if (userAccountList != null && userAccount != null) {
            userAccountList.remove(userAccount);
        }
    }
}

