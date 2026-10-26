package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.example")
public class ProjectConfig {
      @Bean
      public Example example1(){
    	  Example example = new Example();
    	  example.setAnswer("Hello im answer");
    	  return example;
    	  
      }
      
      @Bean
      public Example example2() {
    	  Example example = new Example();
    	  example.setAnswer("Super! Today is great");
    	  return example;
      }
}
