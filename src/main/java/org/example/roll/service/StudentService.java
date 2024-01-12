package org.example.roll.service;

import org.example.roll.entity.Result;
import org.example.roll.entity.Student;

import java.util.List;

public interface StudentService {
    // 新生入学信息录入
    void add(Student student);

    // 学生信息列表展示
    List<Student> list();

    // 修改学生信息
    void update(Student student);

    // 删除学生信息
    void remove(String id);

    // 根据条件查询学生信息
    List<Student> search(String name, String studentsId, Integer grade, Integer classId);

    /* // 根据学生姓名查询学生信息
    Student findByName(String name);

    // 根据学生学籍编号查询学生信息
    Student findByStudentsId(String studentsId);

    // 根据学生如学年份或者年级查询学生信息
    Student findByGrade(Integer grade);

    // 根据学生班级查询学生信息
    Student findByClassId(Integer classId);

    // 根据学生ID查询学生信息
    Student findById(String id); */

    // 根据条件查询学生信息

}
