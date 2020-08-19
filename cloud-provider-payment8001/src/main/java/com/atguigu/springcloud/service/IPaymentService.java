package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @program: cloud2020
 * @description:
 * @author: tonglc
 * @create: 2020-08-19 14:15
 **/

public interface IPaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
