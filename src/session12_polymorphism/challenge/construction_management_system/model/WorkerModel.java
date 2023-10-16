package session12_polymorphism.challenge.construction_management_system.model;

public class WorkerModel extends User{

    private String responsability;
    public WorkerModel(String firstName, String secondName) {
        super(firstName, secondName);
    }

    public String getResponsability() {
        return responsability;
    }

    public void setResponsability(String responsability) {
        this.responsability = responsability;
    }
}
