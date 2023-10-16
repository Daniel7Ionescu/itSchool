package session12_polymorphism.challenge.construction_management_system.service;

import session12_polymorphism.challenge.construction_management_system.model.TeamModel;
import session12_polymorphism.challenge.construction_management_system.model.WorkerModel;

public interface TeamService {

    TeamModel createTeam(String name, String worksiteName);
    void addWorkerToTeam(WorkerModel workerModel, TeamModel teamModel);
}
