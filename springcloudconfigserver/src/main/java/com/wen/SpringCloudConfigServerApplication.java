package com.wen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Desc: 配置中心启动类
 */
@SpringBootApplication
public class SpringCloudConfigServerApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringCloudConfigServerApplication.class, args);
    }
}
