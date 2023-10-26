package session12_polymorphism.challenge.construction_management_system.simulate_database;

import java.util.ArrayList;
import java.util.List;

public class WorkerServiceImpl implements WorkerService {

    //my DB
    private List<WorkerDBModel> workerDB = new ArrayList<>();

    private void createWorkerAndAddToDB(String firstName, String lastName, String position) {
        WorkerDBModel worker = new WorkerDBModel(workerDB.size() + 1, firstName, lastName, position);
        workerDB.add(worker);
    }

    @Override
    public void initDB() {
        createWorkerAndAddToDB("Eric", "Cartman", "regular");
        createWorkerAndAddToDB("Kyle", "Broflovski", "regular");
        createWorkerAndAddToDB("Stan", "Marsh", "regular");
        createWorkerAndAddToDB("Kenny", "McCormick", "regular");
        createWorkerAndAddToDB("Butters", "Stotch", "Apprentice");
        createWorkerAndAddToDB("Craig", "Tucker", "Apprentice");
        createWorkerAndAddToDB("Tweek", "Tweak", "Apprentice");
    }

    @Override
    public void setWorkerAvailability(int id, boolean status) {
        for (WorkerDBModel worker : workerDB) {
            if (worker.getID() == id) {
                worker.setAvailable(status);
                break;
            }
        }
    }

    @Override
    public WorkerDBModel getWorkerFromDBByID(int id) {
        WorkerDBModel result = null;
        for (WorkerDBModel worker : workerDB) {
            if (worker.getID() == id) {
                result = worker;
                break;
            }
        }
        return result;
    }

    @Override
    public WorkerDBModel getAvailableWorkerByPosition(String position) {
        WorkerDBModel result = null;
        for (WorkerDBModel worker : workerDB) {
            if (worker.getPosition().equalsIgnoreCase(position) && worker.isAvailable()) {
                result = worker;
                break;
            }
        }
        return result;
    }
}
