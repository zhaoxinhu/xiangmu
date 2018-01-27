package org.springboot.manager.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.springboot.manager")
@MapperScan(basePackages = "org.springboot.manager.dao")
public class TestStartService {

    public static void main(String[] args){
        SpringApplication.run(TestStartService.class,args);
        System.out.println("服务器启动成功！");
    }
}
