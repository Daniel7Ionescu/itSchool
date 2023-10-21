package session15_equals_hashcode.challenges.simulate_a_cache_of_objects_8;

import java.util.Objects;
import java.util.UUID;

public class Product {

    private UUID id;
    private String name;
    private String type;

    public Product(String name, String type) {
        id = UUID.randomUUID();
        this.name = name;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(type, product.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return name + " : " + type;
    }
}
