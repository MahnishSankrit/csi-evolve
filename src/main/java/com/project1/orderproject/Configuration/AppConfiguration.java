package com.project1.orderproject.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfiguration {
     @Bean 
    public PasswordEncoder passwordEncoder() {
        return  new BCryptPasswordEncoder();
    }

   
}
