package com.example.eco_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*") // Замените на ваш собственный домен
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Разрешенные HTTP-методы
                        .allowedHeaders("*") // Разрешенные заголовки
                        .allowCredentials(true); // Разрешить отправку куки и аутентификацию
            }
        };
    }
}