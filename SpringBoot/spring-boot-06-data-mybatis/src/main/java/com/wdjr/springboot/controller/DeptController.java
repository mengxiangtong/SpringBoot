package com.wdjr.springboot.controller;

import com.wdjr.springboot.bean.Department;
import com.wdjr.springboot.mapper.DepartmentMapper;
import com.wdjr.springboot.service.DepartmentService;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
//import lombok.extern.slf4j.Slf4j;

//@Slf4j
@RestController
@RequestMapping("")
public class DeptController {

     Logger log  =  LoggerFactory.getLogger(getClass());

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    private DepartmentService departmentService;


    @RequestMapping("/getDept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        log.info("---controller-----getDepartment-");
        return departmentService.getDeptById(id);
    }

    @RequestMapping("/delDept/{id}")
    public int delDept(@PathVariable("id") Integer id){
        return departmentMapper.deleteDeptById(id);
    }

    @RequestMapping("/update/{id}")
    public int updateDept(@PathVariable("id") Integer id){
        return departmentMapper.updateDept(new Department(id, "开发部"));
    }

    /*
useGeneratedKeys=“true” keyProperty=“id”
useGeneratedKeys设置为 true 时，表示如果插入的表id以自增列为主键，则允许 JDBC 支持自动生成主键，并可将自动生成的主键id返回。
useGeneratedKeys参数只针对 insert 语句生效，默认为 false；
    * */

    //deptName  canshu
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @GetMapping("/insert")
    //@RequestMapping(value="insert",produces = "application/json;charset=UTF-8")
    public int insertDept(@Param("deptName")  Department department){
        System.out.println(" ----insertDept---controller");
       // log.error("-------insert-");
        log.info("-----999--------log--log--");
        return departmentService.insertDept(department);
    }





}
