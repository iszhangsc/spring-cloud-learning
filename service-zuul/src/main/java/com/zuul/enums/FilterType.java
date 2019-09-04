package com.zuul.enums;

/**
 * @author zhangshichang
 * @date 2019/9/4 下午5:14
 */
public enum FilterType {

    /**
     * 路由之前
     */
    PRE("pre"),
    /**
     * 路由之时
     */
    ROUTING("routing"),
    /**
     * 路由之后
     */
    POST("post"),
    /**
     * 发送错误调用
     */
    ERROR("error");

    /**
     * 过滤器类型
     */
    private String type;

    public String getType() {
        return type;
    }

    FilterType(String type) {
        this.type=type;
    }

}
