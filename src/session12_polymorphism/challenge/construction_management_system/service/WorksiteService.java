package session12_polymorphism.challenge.construction_management_system.service;

import session12_polymorphism.challenge.construction_management_system.model.Worker;
import session12_polymorphism.challenge.construction_management_system.model.Worksite;
import session12_polymorphism.challenge.construction_management_system.simulate_database.WorkerDBModel;

import java.util.ArrayList;
import java.util.List;

public interface WorksiteService {

    // will call the initDB so there are workers to work with
    void init();

    //create a worksite by looking in the "database" based on requested input
    Worksite createWorksite(String name, String location, String objective, int numOfRegularWorkers, int numOfApprenticeWorkers);

    //maps the workers from the database to the worker in my app and adds them to a list
    List<Worker> mapWorker(List<WorkerDBModel> source);

}
