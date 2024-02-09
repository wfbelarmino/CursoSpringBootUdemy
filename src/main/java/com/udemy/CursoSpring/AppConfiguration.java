package com.udemy.CursoSpring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    public String getMessange(){
        return "Texto de configuração";
    }
}
