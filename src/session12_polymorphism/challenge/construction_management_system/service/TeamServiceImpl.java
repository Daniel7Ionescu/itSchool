package session12_polymorphism.challenge.construction_management_system.service;

import session12_polymorphism.challenge.construction_management_system.model.TeamModel;
import session12_polymorphism.challenge.construction_management_system.model.WorkerModel;

public class TeamServiceImpl implements TeamService{
    @Override
    public TeamModel createTeam(String name, String worksiteName) {
        return new TeamModel(name, worksiteName);
    }

    @Override
    public void addWorkerToTeam(WorkerModel workerModel, TeamModel teamModel) {
        teamModel.getWorkerList().add(workerModel);
    }
}
