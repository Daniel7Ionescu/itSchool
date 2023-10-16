package session12_polymorphism.challenge.construction_management_system.model;

import java.util.ArrayList;
import java.util.List;

public class TeamModel {

    private String name;
    private String worksiteName;
    private List<WorkerModel> workerList;

    public TeamModel(String name, String worksiteName) {
        this.name = name;
        this.worksiteName = worksiteName;
        workerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorksiteName() {
        return worksiteName;
    }

    public void setWorksiteName(String worksiteName) {
        this.worksiteName = worksiteName;
    }

    public List<WorkerModel> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<WorkerModel> workerList) {
        this.workerList = workerList;
    }
}
