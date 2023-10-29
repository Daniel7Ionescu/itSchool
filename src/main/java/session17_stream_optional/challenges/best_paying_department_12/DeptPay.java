package session17_stream_optional.challenges.best_paying_department_12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeptPay {

    static void salaryDetails(List<Employee> employeeList){
        //all employees salaries in a map departmentName : salary
        Map<Department, Double> departmentTotalSalary = employeeList.stream()
                .collect(Collectors.toMap(Employee::getDepartment, Employee::getSalary,
                        (existing, replacement) -> existing + replacement));
        System.out.println("Total salary by department: " + departmentTotalSalary);

        //department with the highest total salary
        Map.Entry<Department, Double> bestPayingDept = null;
        for (Map.Entry<Department, Double> entry : departmentTotalSalary.entrySet()) {
            if (bestPayingDept == null || entry.getValue().compareTo(bestPayingDept.getValue()) > 0) {
                bestPayingDept = entry;
            }
        }
        System.out.println("Best paying department: " + bestPayingDept);
    }
}
