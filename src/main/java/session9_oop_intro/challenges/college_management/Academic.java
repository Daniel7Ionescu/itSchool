package session9_oop_intro.challenges.college_management;

public class Academic {

    private String id;
    private String rank;
    private String firstName;
    private String lastName;

    public Academic(String rank, String firstName, String lastName) {
        this.rank = rank;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getRank() {
        return rank;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
