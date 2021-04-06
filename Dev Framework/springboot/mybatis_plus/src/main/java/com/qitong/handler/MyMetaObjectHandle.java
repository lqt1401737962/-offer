package com.qitong.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class MyMetaObjectHandle implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {

        log.info("info ......insertFill");
        this.setFieldValByName("creatTime" ,new Date(),metaObject);
        this.setFieldValByName("updateTime" ,new Date(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("info ......updateFill");
        this.setFieldValByName("updateTime" ,new Date(),metaObject);
    }
}
