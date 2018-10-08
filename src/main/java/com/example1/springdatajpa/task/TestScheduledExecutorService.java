package com.example1.springdatajpa.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 2-ScheduledExecutorService实现定时任务
 */
public class TestScheduledExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        LocalDateTime current = LocalDateTime.now();
        // 参数：1、任务体 2、首次执行的延时时间
        //      3、任务执行间隔 4、间隔时间单位
        service.scheduleAtFixedRate(()->System.out.println("task ScheduledExecutorService "+current.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))), 3, 1, TimeUnit.SECONDS);
    }
}
