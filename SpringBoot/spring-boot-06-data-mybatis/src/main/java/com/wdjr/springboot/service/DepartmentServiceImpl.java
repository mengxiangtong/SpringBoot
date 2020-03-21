package com.wdjr.springboot.service;


import com.wdjr.springboot.bean.Department;
import com.wdjr.springboot.mapper.DepartmentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */

@Service
public class DepartmentServiceImpl implements  DepartmentService {

    Logger log  =  LoggerFactory.getLogger(getClass());

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public int insertDept(Department department) {
        log.info("-----DepartmentServiceImpl-------insertDept-----");

        return departmentMapper.insertDept(department );
    }

    @Override
    public Department  getDeptById(Integer id ){
        log.info("-----DepartmentServiceImpl-----getDeptById----");
        return departmentMapper.getDeptById(id);
    }


}
