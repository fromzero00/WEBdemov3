package com.example.WEBdemo.DAO;

import lombok.Data;

@Data //注解的作用：自动生成set,get，toString等方法
public class StudentDAO {
    private String name;
    private Integer className;
    private Integer chinese;
    private Integer english;
    private Integer math;
    private Integer age;
    private Integer sid;




}

//    @Override
//    public String toString() {
//        return "StudentDAO{" +
//                "name='" + name + '\'' +
//                ", sex='" + sex + '\'' +
//                ", grade=" + grade +
//                '}';
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public Integer getGrade() {
//        return grade;
//    }
//
//    public void setGrade(Integer grade) {
//        this.grade = grade;
//    }
//}
