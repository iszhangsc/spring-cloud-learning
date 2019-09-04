package com.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangshichang
 * @date 2019/9/4 下午3:10
 */
@Service
public class RibbonService {

    private final RestTemplate restTemplate;

    public RibbonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * 基于 restTemplate 调用 eureka client服务
     * <code>@HystrixCommand</code>指定熔断方法
     * @param name 参数
     * @return String
     */
    @HystrixCommand(fallbackMethod = "fallBack")
    public String ribbonService(String name) {
        return restTemplate.getForObject("http://eureka-client/eurekaClient?name="+name, String.class);
    }

    public String fallBack(String name) {
        return "hi," + name + ",sorry server error!";
    }

}
