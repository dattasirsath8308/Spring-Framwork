package com._9_2_xml_Annotation_Based_Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com._9_2_xml_Annotation_Based_Configuration")
public class AppConfig {

//	In the @ComponentScan annotation, basePackages attribute specifies the package where Spring should scan for components.
	
}
