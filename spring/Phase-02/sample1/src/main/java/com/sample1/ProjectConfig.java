package com.sample1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.sample1.repo","com.sample1.proxies","com.sample1.service"})
public class ProjectConfig {

}
