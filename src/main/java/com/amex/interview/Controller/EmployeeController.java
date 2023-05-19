package com.amex.interview.Controller;

import com.amex.interview.Dao.EmployeeRepository;
import com.amex.interview.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;



    @GetMapping
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    @GetMapping("/{username}")
    public Employee getUsername(@PathVariable String username){
        return employeeRepository.findByName(username);
    }

    @PostMapping()
    public Employee createEmployee(@RequestBody Employee employee){
        Employee employee1 = employeeRepository.save(employee);
        return employee1;
    }

//    @GetMapping("/{username}")
//    public ResponseEntity<Employee> getUsername(@PathVariable String username){
//        Optional<Employee> employee = employeeRepository.findByName(username);
//
//    }

}
