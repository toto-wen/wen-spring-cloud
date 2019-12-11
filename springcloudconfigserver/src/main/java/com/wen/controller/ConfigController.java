package com.wen.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by PC-007 on 2019/12/11.
 */
@RestController
@Log4j2
public class ConfigController {
    @Value("${user.name}")
    private String name;

    @PostMapping("test")
    public void test(){
      log.info(name);
    }
}
