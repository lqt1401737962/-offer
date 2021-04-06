package com.qitong;

import com.qitong.pojo.User;
import com.qitong.utils.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Springboot07RedisApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    RedisUtils redisUtils;

    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("key1", "you are the best!");
        Object key1 = redisTemplate.opsForValue().get("key1");
        System.out.println(key1);
    }

    @Test
    public void test() {
        User user = new User("骐通", 3);
        redisTemplate.opsForValue().set("user", user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

    @Test
    public void testUtils() {
        redisUtils.set("key1", "骐通");
        redisUtils.set("key2", "小七");
        redisUtils.set("key3", "我的");
        System.out.println(redisUtils.get("key1"));
        System.out.println(redisUtils.get("key2"));
        System.out.println(redisUtils.get("key3"));
    }
}
