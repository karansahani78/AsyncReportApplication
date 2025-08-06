package com.karan.AsyncReportApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig {
    @Bean(name = "TaskExecutor")
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // thread that always keep alive
        executor.setCorePoolSize(3);
        // minimum threads that created if needed
        executor.setMaxPoolSize(5);
        // 100 tasks can wait in a queue before being rejected
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("ReportThread-");
        executor.initialize();
        return executor;

    }


}
