package com.example.configclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @ConditionalOnProperty("lifecycle-bean.enabled")
    @Bean
    public LifecycleBean lifecycleBean() {
        log.info("Lifecycle bean initialized");

        return new LifecycleBean();
    }

}
