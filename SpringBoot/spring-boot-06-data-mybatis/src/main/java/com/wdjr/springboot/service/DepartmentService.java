package com.wdjr.springboot.service;

import com.wdjr.springboot.bean.Department;
import org.springframework.beans.factory.annotation.Autowired;

public interface DepartmentService {

    //@Autowired
   // Department department = null;

    public int insertDept(Department department);

    public Department  getDeptById(Integer id );

}
