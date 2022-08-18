package com.example.seataorderservice2001.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seataorderservice2001.domain.Order;

public interface OrderService extends IService<Order> {
    void create(Order order);

    void paymentZipkin();
}
