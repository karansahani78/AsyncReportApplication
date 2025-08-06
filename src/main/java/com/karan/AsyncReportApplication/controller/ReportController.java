package com.karan.AsyncReportApplication.controller;

import com.karan.AsyncReportApplication.service.ReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/reports")
public class ReportController {
    private final ReportService reportService;
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }
    @GetMapping("/generate")
    public ResponseEntity<String> generateReport(@RequestParam String reportName) {
        // Call the service to generate the report asynchronously
        reportService.generateReport(reportName);
        return ResponseEntity.status(HttpStatus.CREATED).body("Report generation started for: " + reportName);
    }
}
