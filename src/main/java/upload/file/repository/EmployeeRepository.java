package upload.file.repository;

import upload.file.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> renderAll();
    boolean createEmployee(Employee employee);
}
