package com.amex.interview.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long did;

    private String dName;

    @OneToMany(mappedBy = "department")
    private List<Employee> employeeSet;


    public Department() {
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public List<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(List<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
