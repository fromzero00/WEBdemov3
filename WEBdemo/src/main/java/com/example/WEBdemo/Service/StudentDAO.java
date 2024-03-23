package com.example.WEBdemo.Service;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
@Mapper
public interface StudentDAO {

    //@delete("delete * from student where id = #{id} ")
    //通过#{}将入参传入sql语句中
    @Select("select * from student")
    public ArrayList<com.example.WEBdemo.DAO.StudentDAO> findAll();
    @Insert("insert into student(className,chinese,english,math,name,age,sid)"+
            "values(#{className},#{chinese},#{english},#{math},#{name},#{age},#{sid})")
    public void addStudent(com.example.WEBdemo.DAO.StudentDAO stu);
}
