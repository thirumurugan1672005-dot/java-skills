package com.sample1;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;




@Configuration
@ComponentScan(basePackages = "com.sample1.service")
@EnableAspectJAutoProxy
public class ProjectConfig {
      @Bean
      public LoggingAspect loggingAspect() {
    	  return new LoggingAspect();
      }
      @Bean
      public SecurityAspect secuityAspect() {
    	  return new SecurityAspect();
      }
}
