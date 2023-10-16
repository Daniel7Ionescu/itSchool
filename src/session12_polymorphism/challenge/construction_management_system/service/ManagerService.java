package session12_polymorphism.challenge.construction_management_system.service;

import session12_polymorphism.challenge.construction_management_system.model.ManagerModel;
import session12_polymorphism.challenge.construction_management_system.model.TeamModel;

public interface ManagerService {

    ManagerModel createManager(String firstName, String lastName);
    TeamModel createTeam(String name, String worksiteName);
    void addWorkerToTeam();
}
