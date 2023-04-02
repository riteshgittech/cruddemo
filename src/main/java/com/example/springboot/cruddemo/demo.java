package com.example.springboot.cruddemo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class demo {
    @Bean
   public RestTemplate getRestTemplate() {
      return new RestTemplate();   
   }
}
