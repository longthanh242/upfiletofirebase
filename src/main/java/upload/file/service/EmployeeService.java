package upload.file.service;

import upload.file.dto.request.EmployeeDTO;
import upload.file.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> renderAll();

    boolean createEmployee(EmployeeDTO employeeDTO);
}
