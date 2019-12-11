package com.wen.config;

import com.wen.domain.User;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by PC-007 on 2019/12/11.
 */
@ConfigurationProperties(prefix = "user", ignoreInvalidFields = true)
@Data
@Component
public class config {
    private String name;
    private Integer age;

    @Bean
    public User getUser(){
        User user = new User();
        user.setAge(age);
        user.setName(name);

        return user;
    }
}
