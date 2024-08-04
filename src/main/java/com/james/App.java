package com.james;

import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main( String[] args ) {
        SpringApplication.run(Application.class, args);
    }
}
