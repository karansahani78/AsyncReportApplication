package com.karan.AsyncReportApplication.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    // This method will run in a separate thread using the 'taskExecutor'
    @Async("TaskExecutor")
    public void generateReport(String reportName){
        try{
            System.out.println("Started generating report [" + reportName + "] in " + Thread.currentThread().getName());
            // Simulating a long-running report generation task
            for(int i=0; i<10; i++){
                System.out.println("Generating report [" + reportName + "] - Step " + (i+1) + " in " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished generating report [" + reportName + "] in " + Thread.currentThread().getName());
    }
}
