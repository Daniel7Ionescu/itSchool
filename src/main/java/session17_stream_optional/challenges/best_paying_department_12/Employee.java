package session17_stream_optional.challenges.best_paying_department_12;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private Department department;
    private double salary;
}
