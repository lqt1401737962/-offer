package com.qitong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket1() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("小七");
    }

    @Bean
    public Docket docket2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("丽丽丽丽");
    }

    @Bean
    public Docket docket3() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("啊啊啊啊");
    }

    @Bean
    public Docket docket(Environment environment) {
        Profiles profiles = Profiles.of("dev");
        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(flag)
                .groupName("通哥")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qitong.controller"))
                .build();
    }

    //配置apinfo文档信息
    private ApiInfo apiInfo() {
        Contact contact = new Contact("QiTong吖", "https://blog.csdn.net/weixin_45399846", "energybee@qq.com");
        return new ApiInfo("通哥的Api Documentation",
                "吾生也有涯,而知也无涯",
                "t1.0",
                "https://blog.csdn.net/weixin_45399846",
                contact,
                "Apache 2.0",
                "https://blog.csdn.net/weixin_45399846",
                new ArrayList());
    }
}
