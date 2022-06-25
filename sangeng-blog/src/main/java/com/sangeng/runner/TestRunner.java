package com.sangeng.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 测试CommandLineRunner
 * @author Welfare
 * @version 1.0
 * @date 2022/5/12 20:16
 */
@Component
public class TestRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("程序初始化！！！！");
    }
}
