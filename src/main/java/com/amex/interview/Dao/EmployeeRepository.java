package com.amex.interview.Dao;

import com.amex.interview.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //Employee findByEmployeeName(String name);
    Employee findByName(String name);
}
