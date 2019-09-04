package com.feign.service;

import com.feign.fallback.FallBackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign调用 eureka-client服务
 * 该接口不需要实现，通过Feign来动态代理实现
 * @author zhangshichang
 * @date 2019/9/4 下午3:50
 */
@FeignClient(value = "eureka-client", fallback = FallBackImpl.class)
public interface FeignService {

    /**
     * 调用eureka-client服务
     * @param name  参数名
     * @return  String
     */
    @GetMapping("/eurekaClient")
    String feign(@RequestParam(value = "name") String name);
}
