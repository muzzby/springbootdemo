package com.example.springbootmybatisannotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootmybatisannotation")
public class SpringbootMybatisAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisAnnotationApplication.class, args);
	}

}
