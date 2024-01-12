package org.example.roll.mapper;

import org.apache.ibatis.annotations.*;
import org.example.roll.entity.Student;

import java.util.List;

@Mapper
public interface StudentMapper {
    // 添加学生基础信息
    @Insert("insert into student(name,gender,garde)" +
            "values (#{name},#{gender},#{grade})")
    void add(Student student);

    // 学生信息列表展示
    @Select("select * from student")
    List<Student> list();

    // 修改学生信息
    @Update("update student set name=#{name}," +
            "gender=#{gender}," +
            "class_id=#{class_id}," +
            "address=#{address}," +
            "phone01=#{phone01}," +
            "phone02=#{pnhone02} " +
            "where id=#{id}")
    void update(Student student);

    // 删除学生信息
    @Delete("delete from student where id=#{id}")
    void remove(String id);

    // 根据学生姓名查询学生信息
    @Select("select * from student where name=#{name}")
    Student findByName(String name);

    // 根据学生学籍编号查询学生信息
    @Select("select * from student where students_id=#{studentsId}")
    Student findByStudentsId(String studentsId);

    // 根据学生如学年份或者年级查询学生信息
    @Select("select * from student where grade=#{grade}")
    Student findByGrade(Integer grade);

    @Select("select * from student where class_id=#{classId}")
    Student findByClassId(Integer classId);

    // 根据学生ID查询学生信息
    @Select("select * from student where id=#{id}")
    Student findById(String id);
}
