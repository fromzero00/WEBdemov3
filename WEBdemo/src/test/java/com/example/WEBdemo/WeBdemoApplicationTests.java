package com.example.WEBdemo;

import com.example.WEBdemo.Service.StudentDAO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@SpringBootTest
@RunWith(SpringRunner.class)
//标识当前为Springboot的测试类，加载上下文环境
class WeBdemoApplicationTests {

//	@Autowired
//	private SampleRequest sampleRequest;
	@Autowired
	private StudentDAO studentDAO;

//	@Test
//	void contextLoads() {
//		sampleRequest.sampleRequest("缪雨晨",100,"famle");
//
//	}
	@Test
	public ArrayList<com.example.WEBdemo.DAO.StudentDAO> queryStudent(){
		ArrayList<com.example.WEBdemo.DAO.StudentDAO> findall = studentDAO.findAll();
		return findall;
	}

}
