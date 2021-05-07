package com.lwy.his;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GateWayDemo {
    public static void main(String[] args) {
        SpringApplication.run(GateWayDemo.class,args);
    }
}
