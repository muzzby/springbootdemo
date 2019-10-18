package com.example.springbootmybatisxml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootmybatisxml")
public class SpringbootMybtisXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybtisXmlApplication.class, args);
	}

}
