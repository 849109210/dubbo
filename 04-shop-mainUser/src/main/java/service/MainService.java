package service;

import model.MyOrder;

/**
 * 张杰
 * 2021/7/24
 */
public interface MainService {
    MyOrder buy(Integer uid,String name,float price);
}
