package session18_recap.challenges.class_pair_16;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cargo {

    private String cargoType;
    private double tonnage;

    @Override
    public String toString() {
        return  cargoType +  ", tonnage " + tonnage + " tonnes";
    }
}
