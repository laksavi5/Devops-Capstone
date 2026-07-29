package com.example;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("        DEVOPS CAPSTONE PROJECT         ");
        System.out.println("========================================");
        System.out.println();

        System.out.println("Application Name : DevOps Capstone");
        System.out.println("Developer        : Ram Kumar");
        System.out.println("Build Tool       : Maven");
        System.out.println("CI/CD Tool       : Jenkins");
        System.out.println("Container Tool   : Docker");
        System.out.println("Cloud Platform   : AWS EC2");
        System.out.println("Monitoring       : Prometheus & Grafana");
        System.out.println("Java Version     : " + System.getProperty("java.version"));
        System.out.println("Operating System : " + System.getProperty("os.name"));
        System.out.println("User             : " + System.getProperty("user.name"));
        System.out.println("Execution Time   : " + LocalDateTime.now());

        System.out.println();
        System.out.println("========================================");
        System.out.println(" Maven Build Successful");
        System.out.println(" Jenkins Pipeline Executed Successfully");
        System.out.println(" Docker Image Created Successfully");
        System.out.println(" DevOps CI/CD Pipeline Completed");
        System.out.println("========================================");
    }
}
