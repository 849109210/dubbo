package service;

import model.MyOrder;

/**
 * 张杰
 * 2021/7/24
 */
public interface MyOrderService {
    MyOrder creatNewOrder(Integer uid,String name,float price);
}
