package session12_polymorphism.challenge.construction_management_system.simulate_database;

public interface WorkerService {

    void initDB(); //add workers to a collection to simulate a DB
    void setWorkerAvailability(int id, boolean status);
    WorkerDBModel getWorkerFromDBByID(int id);
    WorkerDBModel getAvailableWorkerByPosition(String position);

}
