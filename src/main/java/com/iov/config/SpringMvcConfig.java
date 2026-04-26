package com.iov.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.iov.controller","com.iov.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
