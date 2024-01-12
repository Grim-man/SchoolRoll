package org.example.roll.controller;

import org.example.roll.entity.Result;
import org.example.roll.entity.Student;
import org.example.roll.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // 添加学生信息
    @PostMapping
    public Result add(Student student){
        studentService.add(student);
        return Result.success("新生信息录入完毕！");
    }


    // 展示学生信息
    @GetMapping
    public Result<List<Student>> list(){
        List<Student> studentInfos = studentService.list();
        return Result.success(studentInfos);
    }

    // 修改学生信息
    @PutMapping
    public Result update(Student student){
        studentService.update(student);
        return Result.success("学生信息修改完毕！");
    }

    // 删除学生信息
    @DeleteMapping
    public Result remove(String id){
        studentService.remove(id);
        return Result.success("学生信息删除成功！");
    }

    // 根据条件查询学生信息：学生姓名 or 学籍编号 or 年级 or 班级等
    @GetMapping("/search")
    public Result<List<Student>> search(String name, String studentsId, Integer grade, Integer classId){
        List<Student> searchInfos = studentService.search(name, studentsId, grade, classId);
        return Result.success(searchInfos);
    }

    /* // 根据学生ID查询学生信息
    @GetMapping("/search")
    public Result<Student> search(String id){
        Student infoById = studentService.findById(id);
        return Result.success(infoById);
    }

    // 根据学生姓名查询学生信息
    @GetMapping("/searchByName")
    public Result<Student> searchByName(String name){
        Student infoByName = studentService.findByName(name);
        return Result.success(infoByName);
    }

    // 根据学生学籍编号查询学生信息
    @GetMapping("/searchByStudentsId")
    public Result<Student> searchByStudentsId(String studentsId){
        Student infoByStudentsId = studentService.findByStudentsId(studentsId);
        return Result.success(infoByStudentsId);
    }

    // 根据学生入学年份或者年级查询学生信息
    @GetMapping("/searchByGrade")
    public Result<Student> searchByGrade(Integer grade){
        Student infoByGrade = studentService.findByGrade(grade);
        return Result.success(infoByGrade);
    }

    // 根据学生所在班级查询学生信息
    @GetMapping("/searchByClassId")
    public Result<Student> searchByClassId(Integer classId){
        Student infoByClassId = studentService.findByClassId(classId);
        return Result.success(infoByClassId);
    } */
}
