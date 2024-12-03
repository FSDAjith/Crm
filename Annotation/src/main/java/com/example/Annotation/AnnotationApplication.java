package com.example.Annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //is combination of Configration,auto EnableAtoConfigration
						// and ComponentScan
public class AnnotationApplication {
	public static void main(String[] args) {
		SpringApplication.run(AnnotationApplication.class, args);
	}

}
