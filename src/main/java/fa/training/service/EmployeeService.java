package fa.training.service;

import fa.training.entities.Employee;
import fa.training.repository.EmployeeRepo;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class EmployeeService {
    private EmployeeRepo employeeRepo;
    public List<Employee> getAllEmployees(Employee employee){
        return employeeRepo.getEmployees();
    }
}