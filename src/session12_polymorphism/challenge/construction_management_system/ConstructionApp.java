package session12_polymorphism.challenge.construction_management_system;

import session12_polymorphism.challenge.construction_management_system.model.AdminModel;
import session12_polymorphism.challenge.construction_management_system.model.ManagerModel;
import session12_polymorphism.challenge.construction_management_system.model.WorksiteModel;
import session12_polymorphism.challenge.construction_management_system.service.*;

public class ConstructionApp {

    public static void main(String[] args) {
        TeamService teamService = new TeamServiceImpl();

        WorksiteService worksiteService = new WorksiteServiceImpl();
        ManagerService managerService = new ManagerServiceImpl(teamService);


        AdminService admin = new AdminServiceImpl(worksiteService, managerService);
        WorksiteModel worksite1 =  admin.createWorksite("Lavender St. 28, Mr. Garrison", "House extension: Studio");
        ManagerModel managerEric =  admin.createManager("Eric", "Cartman");



    }
}
