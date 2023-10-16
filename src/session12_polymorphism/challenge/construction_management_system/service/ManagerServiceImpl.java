package session12_polymorphism.challenge.construction_management_system.service;

import session12_polymorphism.challenge.construction_management_system.model.ManagerModel;
import session12_polymorphism.challenge.construction_management_system.model.TeamModel;

public class ManagerServiceImpl implements ManagerService{

    TeamService teamService;

    public ManagerServiceImpl(TeamService teamService){
        this.teamService = teamService;
    }

    @Override
    public ManagerModel createManager(String firstName, String lastName) {
        return new ManagerModel(firstName, lastName);
    }

    @Override
    public TeamModel createTeam(String name, String worksiteName) {
        return new TeamModel(name, worksiteName);
    }

    @Override
    public void addWorkerToTeam() {

    }
}
