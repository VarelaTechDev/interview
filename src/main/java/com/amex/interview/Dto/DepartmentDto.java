package com.amex.interview.Dto;

import com.amex.interview.Entity.Employee;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

public class DepartmentDto {
    private Long id;
    private String name;

    public DepartmentDto() {
    }

    public DepartmentDto(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
