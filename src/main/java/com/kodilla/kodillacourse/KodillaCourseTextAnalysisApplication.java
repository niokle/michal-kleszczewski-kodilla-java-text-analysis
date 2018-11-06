package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseTextAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseTextAnalysisApplication.class, args);

        Report report = new Report();
        report.getReport("/Users/michalkleszczewski/Documents/Development/Projects/kodilla-course-text-analysis/src/main/resources/test.txt");
    }
}
