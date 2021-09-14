package edu.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitupApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitupApplication.class, args);
		System.out.println("hello github 수정합니다.");
	}

}
