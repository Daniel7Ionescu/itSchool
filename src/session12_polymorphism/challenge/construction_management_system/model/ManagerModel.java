package session12_polymorphism.challenge.construction_management_system.model;

public class ManagerModel extends User {

    private String specialty;

    public ManagerModel(String firstName, String secondName) {
        super(firstName, secondName);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
