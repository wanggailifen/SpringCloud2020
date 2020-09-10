package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tonglc
 */
@Configuration
public class GateWayConfig {

    /**
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_rote_atguigu", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }

/*      获取当前时间
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        - After=2020-03-08T10:59:34.102+08:00[Asia/Shanghai]
        - Before=2020-03-08T10:59:34.102+08:00[Asia/Shanghai]

        - Between=2020-03-08T10:59:34.102+08:00[Asia/Shanghai] ,  2020-03-08T10:59:34.102+08:00[Asia/Shanghai]
        - Cookie=username,atguigu    #并且Cookie是username=zhangshuai才能访问
        - Host=**.atguigu.com
        - Method=GET
        - Query=username, \d+        #要有参数名称并且是正整数才能路由


*/

}