package Ecosystem.Role;

import Ecosystem.EcoSystem;
import Ecosystem.Enterprise.Enterprise;
import Ecosystem.Organization.Organization;
import Ecosystem.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.ComponentDevelopmentEngineerRole.ComponentDevelopmentWorkAreaJPanel;

public class ComponentDevelopmentEngineerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ComponentDevelopmentWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
    }
}
