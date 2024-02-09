package com._9_3_Java_Based_Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com._9_2_xml_Annotation_Based_Configuration")
public class StudentConfig {

	
	@Bean
	public Student studentObj()
	{
		return new Student();
		
	}

}
