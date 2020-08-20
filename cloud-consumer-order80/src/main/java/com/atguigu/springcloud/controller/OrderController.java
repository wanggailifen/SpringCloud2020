package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud2020
 * @description:
 * @author: tonglc
 * @create: 2020-08-19 16:56
 **/
@RestController
@Slf4j
@RequestMapping("/consumer/payment")
public class OrderController {
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/create")
    public CommonResult<Payment> create(Payment payment) {
        CommonResult result = restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
        return result;
    }
    @GetMapping("/get/{id}")
    public CommonResult<Payment> getpayment(@PathVariable Long id) {
        CommonResult result = restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        return result;
    }
}
