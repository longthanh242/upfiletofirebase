package upload.file.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upload.file.dto.request.EmployeeDTO;
import upload.file.model.Employee;
import upload.file.repository.EmployeeRepository;
import upload.file.service.EmployeeService;
import upload.file.service.UploadFileService;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private UploadFileService uploadFileService;

    @Override
    public List<Employee> renderAll() {
        return employeeRepository.renderAll();
    }

    @Override
    public boolean createEmployee(EmployeeDTO employeeDTO) {
        // 1. Upload File lên Firebase --> URL file trên firebase
        String avatarUrlFirebase = uploadFileService.uploadFileToLocal(employeeDTO.getAvatar());
        // 2. Chuyển DTO --> entity
        Employee employee = Employee.builder().empName(employeeDTO.getEmpName())
                .age(employeeDTO.getAge())
                .avatar(avatarUrlFirebase)
                .build();
        // 3. Gọi sang repository để thêm nhân viên
        return employeeRepository.createEmployee(employee);
    }
}
