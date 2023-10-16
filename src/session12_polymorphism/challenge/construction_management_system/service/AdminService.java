package session12_polymorphism.challenge.construction_management_system.service;

import session12_polymorphism.challenge.construction_management_system.model.AdminModel;
import session12_polymorphism.challenge.construction_management_system.model.ManagerModel;
import session12_polymorphism.challenge.construction_management_system.model.WorkerModel;
import session12_polymorphism.challenge.construction_management_system.model.WorksiteModel;

public interface AdminService {

    WorksiteModel createWorksite(String name, String objective);
    ManagerModel createManager(String firstName, String lastName);
//    AdminModel createAdmin(String firstName, String lastName);
}
