package com.amex.interview.Dto;

import com.amex.interview.Entity.Department;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class EmployeeDto {
    private Long id;
    private String name;
    private String role;
    private DepartmentDto departmentDto;

    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String name, String role, DepartmentDto departmentDto) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.departmentDto = departmentDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public DepartmentDto getDepartmentDto() {
        return departmentDto;
    }

    public void setDepartmentDto(DepartmentDto departmentDto) {
        this.departmentDto = departmentDto;
    }
}
