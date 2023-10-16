package session13_recap.challenges.inheritance;

public class Dog extends Animal {

    private String breed;
    private String size;

    public Dog(String name, String species, int age, String breed, String size) {
        super(name, species, age);
        this.breed = breed;
        this.size = size;
    }

    public void bark(){
        System.out.println(getName() + " the " + breed + " barks loudly!");
    }

    public void fetch(){
        System.out.println("Using its " + size + " size, " + getName() + " the " + breed + " is quite good at fetching!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
