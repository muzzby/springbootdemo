package com.first.hello.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author byway
 * 1、RestController的意思就是 Controller 里面的方法都以 json 格式输出
 *
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello Spring Boot 2.0!";
    }
}
