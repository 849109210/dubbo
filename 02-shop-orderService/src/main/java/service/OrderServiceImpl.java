package service;

import model.MyOrder;

import java.util.UUID;

/**
 * 张杰
 * 2021/7/24
 */
public class OrderServiceImpl implements MyOrderService{

    public MyOrder creatNewOrder(Integer uid, String name, float price) {
        MyOrder myOrder = new MyOrder();
        myOrder.setUid(uid);
        myOrder.setOrderId(UUID.randomUUID().toString());
        myOrder.setOrderName(name);
        myOrder.setOriderPrice(String.valueOf(price));
        System.out.println("===myOrderService服务的提供者==");
        return myOrder;
    }
}
