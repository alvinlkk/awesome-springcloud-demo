package com.alvin.springcloud.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nacos/annotation")
@RefreshScope
public class ValueAnnotationController {

    @Value("${cloud.user.name:}")
    private String username;

    @GetMapping("/username")
    public String getUsername() {
        return username;
    }
}
