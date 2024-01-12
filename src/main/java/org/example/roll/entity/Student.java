package org.example.roll.entity;

import lombok.Data;

@Data
public class Student {
    /**
     * 学生ID
     */
    private String id;
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学生性别
     */
    private String gender;
    /**
     * 年级
     */
    private Integer grade;
    /**
     * 班级
     */
    private Integer classId;
    /**
     * 学生信息编号
     */
    private String studentsId;
    /**
     * 家庭住址
     */
    private String address;
    /**
     * 监护人联系方式01
     */
    private String phone01;
    /**
     * 监护人联系方式02
     */
    private String phone02;

}

