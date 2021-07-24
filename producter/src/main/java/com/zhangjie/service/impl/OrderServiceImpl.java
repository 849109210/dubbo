package com.zhangjie.service.impl;

import com.zhangjie.pojo.Order;
import com.zhangjie.service.OrderService;

import java.util.UUID;

/**
 * 张杰
 * 2021/7/23
 */
public class OrderServiceImpl implements OrderService {
    public Order creatOrder(Integer uid, String orderName, float price, Integer amount) {
        System.out.println("==开始创建订单==");
        Order order = new Order();
        order.setOrderId(UUID.randomUUID().toString());
        order.setUid(uid);
        order.setOrderName(orderName);
        order.setPrice(price);
        order.setAmount(amount);
        return order;
    }
}
