package session15_equals_hashcode.practice.equal_and_hashcode;

import java.util.HashSet;
import java.util.Set;

public class TestApp {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setFirstName("Eric");
        emp1.setLastName("Cartman");

        Employee emp2 = new Employee();
        emp2.setId(1);
        emp2.setFirstName("Eric");
        emp2.setLastName("Cartman");

        System.out.println("emp1 equals emp2: " + emp1.equals(emp2));
        System.out.println("emp1 hashcode: " + emp1.hashCode());
        System.out.println("emp2 hashcode: " + emp2.hashCode());

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        System.out.println("Set size: " + employeeSet.size());
    }
}
