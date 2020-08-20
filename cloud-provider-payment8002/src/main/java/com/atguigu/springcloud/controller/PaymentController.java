package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @program: cloud2020
 * @description:
 * @author: tonglc
 * @create: 2020-08-19 14:23
 **/
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {

        int result = paymentService.create(payment);
        log.info("插入结果" + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据成功了,端口号：" + serverPort, result);
        }
        return new CommonResult(444, "插入数据失败", null);
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果" + payment);

        if (payment != null) {
            return new CommonResult(200, "查询成功" + serverPort, payment);
        }
        return new CommonResult(444, "没有对应记录，ID：" + id, null);
    }
}
