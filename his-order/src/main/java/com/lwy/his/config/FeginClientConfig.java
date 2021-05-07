package com.lwy.his.config;

import feign.Logger;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FeginClientConfig {
    @Bean
    public RequestInterceptor headerInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                // 小示例，没什么卵用
                requestTemplate.header("Content-Type", "application/json");
            }
        };
    }

    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
    }

}
