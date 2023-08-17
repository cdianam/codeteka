package com.sbt.demo.config;

import com.sbt.demo.http.PetController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@AutoConfiguration
@ComponentScan(basePackageClasses = {
    PetController.class, // controllers
    ControllerConfig.class // configs
})
public class ControllerConfig implements WebMvcConfigurer {

    @Value("${sbt-demo.http.allowed-origin-patterns}")
    private String[] allowedOriginPattern;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOriginPatterns(allowedOriginPattern)
            .allowedMethods(CorsConfiguration.ALL); // PUT not allowed by default
    }
}
