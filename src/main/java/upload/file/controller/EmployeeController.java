package upload.file.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import upload.file.dto.request.EmployeeDTO;
import upload.file.service.EmployeeService;

@Controller
@RequestMapping("/employeeController")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/renderAll")
    public String renderAllEmployee(Model model){
        model.addAttribute("employeeList", employeeService.renderAll());
        return "employees";
    }
    @GetMapping("/initCreate")
    public String initCreateEmployee(Model model){
        model.addAttribute("employeeDTO", new EmployeeDTO());
        return "newEmployee";
    }
    @PostMapping("/create")
    public String createEmployee(EmployeeDTO employeeDTO){
        boolean result = employeeService.createEmployee(employeeDTO);
        if (result)
            return "redirect:renderAll";
        return "error";
    }
}
