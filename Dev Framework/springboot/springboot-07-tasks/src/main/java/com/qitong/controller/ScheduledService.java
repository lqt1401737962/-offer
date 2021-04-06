package com.qitong.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    @Scheduled(cron = "0/4 * * * * ?")
    public void hello() {
        System.out.println("你呗执行了........冲啊");
    }
}
