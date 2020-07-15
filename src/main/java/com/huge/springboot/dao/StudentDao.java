package com.huge.springboot.dao;

import com.huge.springboot.entity.Sclass;
import com.huge.springboot.entity.Student;
import com.huge.springboot.entity.StudentVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc:
 * @author:huge
 * @create:2020-07-14 12:25
 */
@Mapper
public interface StudentDao {
    //删除学生
    int deleteStu(@Param("sid")Integer sid);
    //修改学生
    int updateStu(Student student);
    //根据学号查询学生信息
    Student findStudentBySid(@Param("sid")Integer sid);
    //增加学生
    int addStudent(Student student);
    //查询所有班级信处
    List<Sclass> findAllClass();
    //查询所有学生信息
    List<StudentVo> findAllStudent(Map<String,Object> map);
}
