package com.wen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by PC-007 on 2019/12/17.
 */
@SpringBootApplication
@EnableEurekaServer
public class WenEurekaApplication {

    public static void main(String[] args){
        SpringApplication.run(WenEurekaApplication.class, args);
    }
}
