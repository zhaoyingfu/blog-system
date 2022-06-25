package com.sangeng;

import com.sangeng.util.RedisCache;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * @author Welfare
 * @version 1.0
 * @date 2022/5/12 21:54
 */
@SpringBootTest(classes = SanGengBlogApplication.class)
@RunWith(SpringRunner.class)
public class RedisTest {

    @Autowired
    private RedisCache redisCache;

    @Test
    public void insertRedis(){
        Map<String, Integer> viewCountMap = new HashMap<>();
        viewCountMap.put("t",123);
        redisCache.setCacheMap("book:price",viewCountMap);
    }

    @Test
    public void testList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
    }

    @Test
    public void testPredicate(){
        //Predicate是一个条件接口
        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>6;
            }
        };

        //lambda表达式
        Predicate<String> p2 = s -> s.length()<10;


    }
}
