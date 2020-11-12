package com.example.demo;

import com.example.demo2.TestDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		TestDemo2.Print();
		SpringApplication.run(DemoApplication.class, args);
	}

}
