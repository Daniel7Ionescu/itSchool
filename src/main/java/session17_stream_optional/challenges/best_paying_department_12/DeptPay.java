package session17_stream_optional.challenges.best_paying_department_12;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeptPay {

    static void printBestDepartmentTotalSalary(List<Employee> employeeList) {
        String departmentTotalSalary = employeeList.stream()
                .collect(Collectors.toMap(Employee::getDepartment, Employee::getSalary,
                        (existing, replacement) -> existing + replacement))
                .entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get().toString();
        System.out.println(departmentTotalSalary);
    }
}
