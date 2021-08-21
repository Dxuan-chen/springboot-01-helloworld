package com.atguigu.boot.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 功能描述：
 * 定时任务
 */
@Component
@Slf4j
public class ScheduledTasks {

//    @Scheduled(fixedRate = 3000)
    @Scheduled(cron = "0/2 * * * * ? ")
    public void taskService(){
        log.info("<<定时任务执行>>"+System.currentTimeMillis());
    }
}
