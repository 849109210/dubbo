package service.impl;

import model.Address;
import model.MyOrder;
import service.MainService;
import service.MyOrderService;
import service.UserService;

/**
 * 张杰
 * 2021/7/24
 */
public class MainServiceImpl implements MainService {

    private MyOrderService myOrderService;

    public MyOrderService getMyOrderService() {
        return myOrderService;
    }

    public void setMyOrderService(MyOrderService myOrderService) {
        this.myOrderService = myOrderService;
    }

    public MyOrder buy(Integer uid, String name,float price) {
        MyOrder myOrder = myOrderService.creatNewOrder(uid, name, price);
        return myOrder;
    }
}
