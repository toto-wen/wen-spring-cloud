package com.wen.controller;

import com.wen.domain.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by PC-007 on 2019/12/11.
 */
@RestController
@Log4j2
public class ConfigController {

    @Resource
    private User user;


    @PostMapping("/test")
    public void test(){
        log.info("user信息: "+user.toString());
    }
}
