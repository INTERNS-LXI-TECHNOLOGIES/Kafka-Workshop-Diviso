package com.diviso.kafka.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.diviso.kafka")
public class FeignConfiguration {

}
