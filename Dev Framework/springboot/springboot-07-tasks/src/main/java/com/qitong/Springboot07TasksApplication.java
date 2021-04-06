package com.qitong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;

//开启异步任务服务

@EnableAsync
@EnableScheduling //开启定时任务
@SpringBootApplication
public class Springboot07TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot07TasksApplication.class, args);
    }

}
