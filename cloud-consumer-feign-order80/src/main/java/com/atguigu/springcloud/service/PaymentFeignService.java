package com.atguigu.springcloud.service;


import com.atguigu.springcloud.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tonglc
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
@RequestMapping(value = "/payment")
public interface PaymentFeignService {

    @GetMapping(value = "/get/{id}")
    CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/feign/timeout")
    public String paymentFeignTimeout();

}
 