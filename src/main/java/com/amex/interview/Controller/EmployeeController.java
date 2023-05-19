package com.amex.interview.Controller;

import com.amex.interview.Dao.DepartmentRepository;
import com.amex.interview.Dao.EmployeeRepository;
import com.amex.interview.Dto.DepartmentDto;
import com.amex.interview.Dto.EmployeeDto;
import com.amex.interview.Entity.Department;
import com.amex.interview.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    // localhost:8080/employees
//    [
//    {
//        "id": 1,
//            "name": "Software Engineer",
//            "role": null,
//            "departmentDto": {
//        "id": 1,
//                "name": "Engineering"
//    }
//    },
//    {
//        "id": 2,
//            "name": "Data Scientist",
//            "role": null,
//            "departmentDto": {
//        "id": 2,
//                "name": "Data Science"
//    }
//    },
//    {
//        "id": 3,
//            "name": "Product Manager",
//            "role": null,
//            "departmentDto": {
//        "id": 3,
//                "name": "Product Management"
//    }
//    }
//]
    @GetMapping
    public List<EmployeeDto> getAllEmployees() {

        List<Employee> employeeList = employeeRepository.findAll();

        if(employeeList.isEmpty()) return null;

        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        for(Employee e: employeeList){
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setId(e.getId());
            employeeDto.setName(e.getName());
            employeeDto.setName(e.getRole());

            // Grab the department
            Department department = e.getDepartment();
            DepartmentDto departmentDto = new DepartmentDto();
            departmentDto.setId(department.getId());
            departmentDto.setName(department.getName());


            employeeDto.setDepartmentDto(departmentDto);

            employeeDtoList.add(employeeDto);
        }

        return employeeDtoList;
    }

    // localhost:8080/employees/John Doe
//    {
//        "id": 1,
//            "name": "John Doe",
//            "role": "Software Engineer",
//            "departmentDto": {
//        "id": 1,
//                "name": "Engineering"
//    }
//    }

    @GetMapping("/{name}")
    public EmployeeDto getEmployeeByName(@PathVariable String name) {
        Employee employeeOptional = employeeRepository.findByName(name);
        if(employeeOptional != null){
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setId(employeeOptional.getId());
            employeeDto.setName(employeeOptional.getName());
            employeeDto.setRole(employeeOptional.getRole());

            Department department = employeeOptional.getDepartment();


            DepartmentDto departmentDto = new DepartmentDto();
            departmentDto.setId(department.getId());
            departmentDto.setName(department.getName());

            employeeDto.setDepartmentDto(departmentDto);

            return employeeDto;
        }
        else{
            return null;
        }
    }

    @GetMapping("/employee/{id}")
    public EmployeeDto getEmployeeByName(@PathVariable Long id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);

        if(employeeOptional.isPresent()){
            Employee employee = employeeOptional.get();

            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setId(employee.getId());
            employeeDto.setName(employee.getName());
            employeeDto.setRole(employee.getRole());

            Department department = employee.getDepartment();
            DepartmentDto departmentDto = new DepartmentDto();

            departmentDto.setName(department.getName());
            departmentDto.setId(department.getId());

            employeeDto.setDepartmentDto(departmentDto);


            return employeeDto;
        }
        else return null;
    }
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeRepository.findById(id);
    }
}