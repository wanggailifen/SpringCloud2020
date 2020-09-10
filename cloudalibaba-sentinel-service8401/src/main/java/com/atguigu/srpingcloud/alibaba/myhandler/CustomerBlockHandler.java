package com.atguigu.srpingcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.CommonResult;

public class CustomerBlockHandler {

    public static CommonResult handlerException1(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息1....CustomerBlockHandler1");

    }


    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息2....CustomerBlockHandler2");

    }
}
 