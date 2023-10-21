package session15_equals_hashcode.challenges.generic_repository_16;

import java.util.Objects;

public class Car {

    private String name;
    private boolean isFast;

    public Car(String name, boolean isFast) {
        this.name = name;
        this.isFast = isFast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car color = (Car) o;
        return isFast == color.isFast && Objects.equals(name, color.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isFast);
    }

    @Override
    public String toString() {
        return name + ", is it fast " + isFast;
    }
}
