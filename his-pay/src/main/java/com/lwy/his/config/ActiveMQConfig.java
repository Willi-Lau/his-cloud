package com.lwy.his.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

@Configuration
@EnableJms
public class ActiveMQConfig {

    /**
     * 注入Queue名字
     */
    @Value("${myqueuepay}")
    private String myQueuePay;
    /**
     * 创建返回Queue
     * @return
     */
    @Bean
    public Queue queue(){
        return new ActiveMQQueue(myQueuePay);
    }
}
