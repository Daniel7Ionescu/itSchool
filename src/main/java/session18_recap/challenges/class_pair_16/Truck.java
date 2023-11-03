package session18_recap.challenges.class_pair_16;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Truck {

    private String model;
    private boolean isElectric;

    @Override
    public String toString() {
        return  model +  ", electric: " + isElectric;
    }
}
