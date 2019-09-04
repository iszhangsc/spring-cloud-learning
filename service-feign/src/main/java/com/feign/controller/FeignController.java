package com.feign.controller;

import com.feign.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * feign客户端调用 eureka-client
 *
 * @author zhangshichang
 * @date 2019/9/4 下午3:53
 */
@RestController
public class FeignController {

    private final FeignService feignService;

    public FeignController(FeignService feignService) {
        this.feignService = feignService;
    }

    @GetMapping("/feign")
    public String feign(@RequestParam(value = "name") String name) {
        return feignService.feign(name);
    }

}
