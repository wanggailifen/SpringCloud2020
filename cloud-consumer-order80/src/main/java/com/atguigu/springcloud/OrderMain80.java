package com.atguigu.springcloud;

import com.atguigu.myRule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: cloud2020
 * @description:
 * @author: tonglc
 * @create: 2020-08-19 16:52
 **/
@EnableEurekaClient
@SpringBootApplication
//@RibbonClients(value = {
//        @RibbonClient(name = "xxx",configuration = XxxRibbonConfig.class),
//        @RibbonClient(name = "demo",configuration = DemoRibbonConfig.class)
//})
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}