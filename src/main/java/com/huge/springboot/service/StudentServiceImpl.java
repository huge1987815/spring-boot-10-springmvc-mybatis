package com.huge.springboot.service;

import com.huge.springboot.dao.StudentDao;
import com.huge.springboot.entity.Sclass;
import com.huge.springboot.entity.Student;
import com.huge.springboot.entity.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc:
 * @author:huge
 * @create:2020-07-14 13:39
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;
    //删除学生信息
    @Override
    public int deleteStu(Integer sid) {
        return studentDao.deleteStu(sid);
    }
    //修改学生信息
    @Override
    public int updateStu(Student student) {
        return studentDao.updateStu(student);
    }

    //根据学号查询学生信息
    @Override
    public Student findStudentBySid(Integer sid) {
        return studentDao.findStudentBySid(sid);
    }

    //增加学生信息
    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    //查询所有班级信息
    @Override
    public List<Sclass> findAllClass() {
        return studentDao.findAllClass();
    }

    //查询所有学生信息
    @Override
    public List<StudentVo> findAllStudent(Student student) {
        Map<String, Object> map=new HashMap<>();
        map.put("sname",student.getSname());
        map.put("sex",student.getSex());
        map.put("cid",student.getCid());
        return studentDao.findAllStudent(map);
    }
}
