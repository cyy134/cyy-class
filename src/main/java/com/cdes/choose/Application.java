package com.cdes.choose;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

/**
 * 程序入口
 */
@SpringBootApplication
@MapperScan("com.cdes.choose.dao")
public class Application {
        public static void main(String[] args){
                SpringApplication.run(Application.class);
                System.out.print("程序运行中。。。。。。");
        }
}
