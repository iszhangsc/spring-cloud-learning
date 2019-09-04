package com.feign.fallback;

import com.feign.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * 服务宕机后断路器返回提示信息
 * @author zhangshichang
 * @date 2019/9/4 下午4:34
 */
@Component
public class FallBackImpl implements FeignService {
    @Override
    public String feign(String name) {
        return "hi," + name + ",sorry server error!";
    }
}
