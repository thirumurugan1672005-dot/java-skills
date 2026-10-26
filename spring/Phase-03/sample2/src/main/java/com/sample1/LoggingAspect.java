package com.sample1;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import com.sample1.model.Comment;

@Aspect
@Order(1)
public class LoggingAspect {
   private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
   @Around("@annotation(ToLog)")
   public Object log(ProceedingJoinPoint method) throws Throwable {
	   String methodName = method.getSignature().getName();
	   Object[] args = method.getArgs();
	   logger.info("Method with name "+methodName+" with parameters as "+Arrays.toString(args)+" will execute");
	   
	   Comment comment = new Comment();
	   comment.setText("Today is bad day!");
	   Object[] diffArguments = {comment};
	   Object returnedValue  = method.proceed(diffArguments);
	   
	   logger.info("Method ends and returns a value : "+returnedValue);
	   
	   
	   return "FAILED";
	   
   }
   
}
