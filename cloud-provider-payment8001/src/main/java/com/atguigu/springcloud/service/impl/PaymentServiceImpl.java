package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.mapper.PaymentMapper;
import com.atguigu.springcloud.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: cloud2020
 * @description:
 * @author: tonglc
 * @create: 2020-08-19 14:18
 **/
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
