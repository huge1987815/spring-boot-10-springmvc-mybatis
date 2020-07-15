package com.huge.springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huge.springboot.entity.Sclass;
import com.huge.springboot.entity.Student;
import com.huge.springboot.entity.StudentVo;
import com.huge.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Desc:
 * @author:huge
 * @create:2020-07-14 13:42
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    //删除学生
    @RequestMapping("deleteStu")
    public String deleteStu(@RequestParam("sid")Integer sid){
        return studentService.deleteStu(sid)>0?"redirect:findAllStudent":"redirect:findAllStudent";
    }
    //修改学生
    @RequestMapping("updateStudent")
    public String updateStudent(Student student){
        return studentService.updateStu(student)>0?"redirect:findAllStudent":"redirect:update";
    }
    //增加学生
    @RequestMapping("addStudent")
    public String addStudent(Student student){
        return studentService.addStudent(student)>0?"redirect:findAllStudent":"redirect:add";
    }
    //查询所有学生信息
    @RequestMapping("findAllStudent")
    public String findAllStudent(Model model,Student student, @RequestParam(defaultValue = "1")Integer pageNum){
        PageHelper.startPage(pageNum,3);
        List<StudentVo> allStudent = studentService.findAllStudent(student);
        PageInfo<StudentVo> page=new PageInfo<>(allStudent);
        List<Sclass> allClass = studentService.findAllClass();
        model.addAttribute("page",page);
        model.addAttribute("classList",allClass);
        model.addAttribute("sname",student.getSname());
        model.addAttribute("sex",student.getSex());
        model.addAttribute("cid",student.getCid());
        return "student";
    }
    //跳转页面
    @RequestMapping("{page}")
    public String infoPage(@PathVariable String page,Model model,@RequestParam(required = false,name = "sid")Integer sid){
        List<Sclass> allClass = studentService.findAllClass();
        Student student = studentService.findStudentBySid(sid);
        model.addAttribute("classList",allClass);
        model.addAttribute("student",student);
        return page;
    }
}
