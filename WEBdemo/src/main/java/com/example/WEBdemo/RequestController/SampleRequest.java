package com.example.WEBdemo.RequestController;

import com.example.WEBdemo.RequestPO.StudentPO;
import com.example.WEBdemo.Service.StudentDAO;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//添加注释
@RestController
public class SampleRequest {
    @Autowired
    private StudentDAO studentDAO;

    @RequestMapping("/sampleRequest")
    //前端参数和后端不一致，返回的是null，不会报错
    //required = false代表非必填，默认为必填
    //name = “xxx” 入参的别名
    public String sampleRequest(@RequestParam(name = "name",required = true) String username ,
                                Integer score,
                                @RequestParam(required = false) String sex)
    {
        System.out.println("姓名:" +
                username +
                sex +
                "，成绩:" +
                score);
        return "Success";

    }
    @RequestMapping("/PORequest")
    public String PORequest(StudentPO stu){
        System.out.println(stu.toString());
        return "SUCCESS";
    }

    @RequestMapping("/ComnbileRequest")
    public String ComnbileRequest(StudentPO stu){
        System.out.println(stu.toString());
        return "SUCCESS";
    }

    @RequestMapping("/queryAllStudent")
    public ArrayList<com.example.WEBdemo.DAO.StudentDAO> queryAllStudent(){
        ArrayList<com.example.WEBdemo.DAO.StudentDAO> studentDAOS = studentDAO.findAll();
        return studentDAOS;

    }

    //前端用form表单进行请求，不然取不到页面的值
    @RequestMapping("/addStudent")
    //主键返回，插入成功后返回某个属性值。特定业务可能需要
    @Options(keyProperty = "sid" , useGeneratedKeys = true)
    public String addStudent(com.example.WEBdemo.DAO.StudentDAO stu){
        if (stu != null){
            System.out.println(stu.toString());
            studentDAO.addStudent(stu);
            return "添加成功";
        }
        return "参数不能为空";
    }

}
