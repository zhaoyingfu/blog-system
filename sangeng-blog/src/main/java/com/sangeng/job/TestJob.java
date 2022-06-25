package com.sangeng.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Welfare
 * @version 1.0
 * @date 2022/5/12 20:22
 */
@Component
public class TestJob {

    /*@Scheduled(cron = "0/5 * * * * ?")
    public void testJob(){
        //要执行的代码
        System.out.println("执行定时任务！"+new SimpleDateFormat("yyyyMMddHHmmss") .format(new Date() ));
    }*/
}
