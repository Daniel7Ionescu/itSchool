package session12_polymorphism.challenge.construction_management_system.service;

import session12_polymorphism.challenge.construction_management_system.model.Team;
import session12_polymorphism.challenge.construction_management_system.model.Worker;
import session12_polymorphism.challenge.construction_management_system.model.Worksite;
import session12_polymorphism.challenge.construction_management_system.simulate_database.WorkerDBModel;
import session12_polymorphism.challenge.construction_management_system.simulate_database.WorkerService;

import java.util.ArrayList;
import java.util.List;

public class WorksiteServiceImpl implements WorksiteService {
    WorkerService workerService;

    public WorksiteServiceImpl(WorkerService workerService) {
        this.workerService = workerService;
    }

    private WorkerDBModel getAvailableWorkerFromDBByPosition(String position) {
        WorkerDBModel workerDBModel = workerService.getAvailableWorkerByPosition(position);
        workerDBModel.setAvailable(false);
        return workerDBModel;
    }

    @Override
    public void init() {
        workerService.initDB();
    }

    @Override
    public Worksite createWorksite(String name, String location, String objective, int numOfRegularWorkers, int numOfApprenticeWorkers) {
        //create a temp list based, based on DB model
        List<WorkerDBModel> tempList = new ArrayList<>();

        //look for the number of workers by position in DB and add to tempList
        //regular
        for (int count = 0; count < numOfRegularWorkers; count++) {
            WorkerDBModel workerDBModel = getAvailableWorkerFromDBByPosition("regular");
            tempList.add(workerDBModel);
        }

        //apprentice
        for (int count = 0; count < numOfRegularWorkers; count++) {
            WorkerDBModel workerDBModel = getAvailableWorkerFromDBByPosition("apprentice");
            tempList.add(workerDBModel);
        }

        //create a team
        Team team = new Team(location + " : " + name, mapWorker(tempList));

        //create and return worksite
        Worksite worksite = new Worksite(name, location, objective, team);
        return worksite;
    }

    @Override
    public List<Worker> mapWorker(List<WorkerDBModel> source) {
        List<Worker> destination = new ArrayList<>();
        for (WorkerDBModel workerDBModel : source) {
            destination.add(new Worker(workerDBModel.getFirstName(), workerDBModel.getLastName(), workerDBModel.getPosition()));
        }
        return destination;
    }
}
