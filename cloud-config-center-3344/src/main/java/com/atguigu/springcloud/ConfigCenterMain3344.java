package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 刷新配置请求
 * 全局刷新
 * POST：http://localhost:3344/actuator/bus-refresh
 * 定点刷新
 * POST：http://localhost:3344/actuator/bus-refresh/config-client:3355
 *
 * @author tonglc
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}