package com.example.WEBdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})  连接数据库就不需要了
@SpringBootApplication
@MapperScan("com.example.WEBdemo.Service")
public class WeBdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeBdemoApplication.class, args);
	}

}
