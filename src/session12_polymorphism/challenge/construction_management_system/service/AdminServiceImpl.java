package session12_polymorphism.challenge.construction_management_system.service;

import session12_polymorphism.challenge.construction_management_system.model.AdminModel;
import session12_polymorphism.challenge.construction_management_system.model.ManagerModel;
import session12_polymorphism.challenge.construction_management_system.model.WorkerModel;
import session12_polymorphism.challenge.construction_management_system.model.WorksiteModel;

public class AdminServiceImpl implements AdminService{

    WorksiteService worksiteService;
    ManagerService managerService;

    public AdminServiceImpl(WorksiteService worksiteService, ManagerService managerService) {
        this.worksiteService = worksiteService;
        this.managerService = managerService;
    }

    @Override
    public WorksiteModel createWorksite(String name, String objective) {
        return worksiteService.createWorksite(name, objective);
    }

    @Override
    public ManagerModel createManager(String firstName, String lastName) {
        return null;
    }

    //    @Override
//    public AdminModel createAdmin(String firstName, String lastName) {
//        return new AdminModel(firstName, lastName);
//    }
}
