package com.ribbon.controller;

import com.ribbon.service.RibbonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangshichang
 * @date 2019/9/4 下午3:16
 */
@RestController
public class RibbonController {

    private final RibbonService ribbonService;

    public RibbonController(RibbonService ribbonService) {
        this.ribbonService = ribbonService;
    }

    @GetMapping("/ribbon")
    public String ribbon(@RequestParam String name) {
        return ribbonService.ribbonService(name);
    }

}
