package session12_polymorphism.challenge.construction_management_system.simulate_database;

public class WorkerDBModel {

    private int ID;
    private String firstName;
    private String lastName;
    private String position;
    private boolean isAvailable;

    public WorkerDBModel(int ID, String firstName, String lastName, String position) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        isAvailable = true;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
