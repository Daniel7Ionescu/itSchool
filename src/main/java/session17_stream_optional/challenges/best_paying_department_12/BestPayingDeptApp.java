package session17_stream_optional.challenges.best_paying_department_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BestPayingDeptApp {

    public static void main(String[] args) {
        //Given a list of employee objects with attributes:
        // name, department, and salary; find the department with the highest total salary.
        Employee employeeEric = new Employee("Eric", Department.BALLOONS, 13000);
        Employee employeeWendy = new Employee("Wendy", Department.BALLOONS, 17000);
        Employee employeeStan = new Employee("Stan", Department.CHEWING_GUM, 7000);
        Employee employeeKyle = new Employee("Kyle", Department.CHEWING_GUM, 9000);
        Employee employeeKenny = new Employee("Kenny", Department.KICKING_BUTT, 14500);
        Employee employeeButters = new Employee("Butters", Department.KICKING_BUTT, 19500);

        List<Employee> employeeList = Arrays.asList(employeeEric, employeeWendy, employeeStan, employeeKyle, employeeKenny, employeeButters);

        DeptPay.salaryDetails(employeeList);
    }
}
