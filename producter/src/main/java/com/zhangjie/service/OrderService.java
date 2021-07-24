package com.zhangjie.service;

import com.zhangjie.pojo.Order;

/**
 * 张杰
 * 2021/7/23
 */
public interface OrderService {
    Order creatOrder(Integer uid, String orderName, float price, Integer amount);
}
