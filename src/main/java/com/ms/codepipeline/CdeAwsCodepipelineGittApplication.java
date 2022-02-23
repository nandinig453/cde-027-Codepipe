package com.ms.codepipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController

public class CdeAwsCodepipelineGittApplication {
	@GetMapping("/")
	public String hello()
	{
		return "Helloworld";
	}
	@GetMapping("/welcome")
	public String welcome()
	{
		return " Code pipeline";
	}

	public static void main(String[] args) {
		SpringApplication.run(CdeAwsCodepipelineGittApplication.class, args);
	}

}
