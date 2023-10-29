package session17_stream_optional.challenges.challenges_1_to_10;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return firstName + " " + lastName + " : " + age;
    }
}
