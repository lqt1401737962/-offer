package com.qitong;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootTest
class Springboot07TasksApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage smm = new SimpleMailMessage();
        smm.setSubject("你好啊,辛苦了骐通");
        smm.setText("健康类风湿的了解开发时间点三大类健康副驾驶的吉林省的");
        smm.setFrom("energybee@qq.com");
        smm.setTo("energybee@qq.com");
        javaMailSender.send(smm);

    }

}
