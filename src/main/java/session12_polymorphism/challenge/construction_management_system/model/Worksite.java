package session12_polymorphism.challenge.construction_management_system.model;

public class Worksite {

    private String name;
    private String location;
    private String objective;
    private Team workerTeam;

    public Worksite(String name, String location, String objective, Team workerTeam) {
        this.name = name;
        this.location = location;
        this.objective = objective;
        this.workerTeam = workerTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Team getWorkerTeam() {
        return workerTeam;
    }

    public void setWorkerTeam(Team workerTeam) {
        this.workerTeam = workerTeam;
    }

    @Override
    public String toString() {
        return "Worksite: " +  name + " - " + location + " : " + objective +
                "\nAssigned team: " + workerTeam;
    }
}
