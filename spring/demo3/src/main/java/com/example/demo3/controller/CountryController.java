package com.example.demo3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.dto.Country;

@RestController
public class CountryController {
      @GetMapping("/india")
      public ResponseEntity<Country>india() {
    	  Country c = Country.of("india",1000L);
    	  return ResponseEntity.status(HttpStatus.ACCEPTED)
    			  .header("continent","asia")
    			  .header("capital","delhi")
    			  .header("food","biriyani")
    			  .body(c);
      }
}
