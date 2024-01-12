package org.example.roll.service.impl;

import org.example.roll.entity.Student;
import org.example.roll.mapper.StudentMapper;
import org.example.roll.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public void add(Student student) {
        studentMapper.add(student);
    }

    @Override
    public List<Student> list() {
        return studentMapper.list();
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }

    @Override
    public void remove(String id) {
        studentMapper.remove(id);
    }

    @Override
    public Student findByName(String name) {
        return studentMapper.findByName(name);
    }

    @Override
    public Student findByStudentsId(String studentsId) {
        return studentMapper.findByStudentsId(studentsId);
    }

    @Override
    public Student findByGrade(Integer grade) {
        return studentMapper.findByGrade(grade);
    }

    @Override
    public Student findByClassId(Integer classId) {
        return studentMapper.findByClassId(classId);
    }

    @Override
    public Student findById(String id) {
        return studentMapper.findById(id);
    }
}
