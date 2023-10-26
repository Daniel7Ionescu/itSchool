package session12_polymorphism.challenge.construction_management_system.model;

import java.util.List;

public class Team {

    private String name;
    private List<Worker> workerTeam;

    public Team(String name, List<Worker> workerTeam) {
        this.name = name;
        this.workerTeam = workerTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Worker> getWorkers() {
        return workerTeam;
    }

    public void setWorkerTeam(List<Worker> workerTeam) {
        this.workerTeam = workerTeam;
    }

    private String getTeam() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Worker worker : workerTeam) {
            stringBuilder.append(worker.getLastName()).append(" : ").append(worker.getPosition()).append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return name + "\nMembers: " + "\n" + getTeam();
    }
}
