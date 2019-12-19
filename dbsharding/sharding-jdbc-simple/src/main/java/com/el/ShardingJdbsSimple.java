package com.el;

import org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author roman zhangfei
 * @Date 2019/12/4 16:57
 * @Version V1.0
 */
//@SpringBootApplication(exclude = SpringBootConfiguration.class)
@SpringBootApplication
public class ShardingJdbsSimple {
    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbsSimple.class,args);
    }
}