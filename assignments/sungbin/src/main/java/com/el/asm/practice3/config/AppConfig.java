package com.el.asm.practice3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.el.asm.practice3")
@EnableWebMvc
public class AppConfig {

}
