package com.wen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by PC-007 on 2019/12/11.
 */
@SpringBootApplication
public class WenAuthApplication {
    public static void main(String[] args){
        SpringApplication.run(WenAuthApplication.class, args);
    }
}
