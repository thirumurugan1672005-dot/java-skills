package com.sample1;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class SecurityAspect {
	private Logger logger = Logger.getLogger(SecurityAspect.class.getName());
     @Around("@annotation(ToLog)")
     public void security(ProceedingJoinPoint joinPoint) throws Throwable {
    	 logger.info("Security method calls ");
    	 Object returnedValue = joinPoint.proceed();
    	 logger.info("Method returns "+returnedValue);
     }
}
