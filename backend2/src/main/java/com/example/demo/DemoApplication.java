package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DemoApplication {

    /*
         JJM Madushanka Kumara
         GS/COMP/280
         University of Sri Jayewardenepura
     */



    @GetMapping("/hello")
    public String hello() {
        return "Hello from Java Backend!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
