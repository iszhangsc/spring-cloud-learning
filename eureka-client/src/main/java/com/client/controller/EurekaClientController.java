package com.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangshichang
 * @date 2019/9/4 下午3:08
 */
@RestController
public class EurekaClientController {


    @Value("${server.port}")
    private int port;

    @GetMapping("/eurekaClient")
    public String eurekaClient(@RequestParam(required = false, defaultValue = "我是eureka-client") String name) {
        return "来自eureka-client的消息:"+name+":"+port;
    }

}
