package com.wdjr.springboot.mapper;

import com.wdjr.springboot.bean.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * CourseMapper继承基类
 */
@Repository
public interface CourseMapper  {
    /*
    int deleteByPrimaryKey(PK id);

    int insert(Course record);

    int insertSelective(Course record);*/

     List<Course> getCourseList() ;

    /*
    Course selectByPrimaryKey(PK id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);*/

}