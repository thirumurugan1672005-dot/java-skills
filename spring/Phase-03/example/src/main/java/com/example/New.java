package com.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class New {
   public New() {
	   System.out.println("New is created");
   }
}
