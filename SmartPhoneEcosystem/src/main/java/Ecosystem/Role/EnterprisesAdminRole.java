package Ecosystem.Role;

import Ecosystem.EcoSystem;
import Ecosystem.Enterprise.Enterprise;
import Ecosystem.Organization.Organization;
import Ecosystem.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.EnterprisesAdminWorkArea.EnterprisesAdminWorkAreaJPanel;

public class EnterprisesAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EnterprisesAdminWorkAreaJPanel(userProcessContainer, enterprise, account);
    }
}
