package model;

import lombok.Data;

import java.io.Serializable;

/**
 * 张杰
 * 2021/7/24
 */
public class MyOrder implements Serializable {
    private Integer uid;
    private String orderId;
    private String orderName;
    private String oriderPrice;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOriderPrice() {
        return oriderPrice;
    }

    public void setOriderPrice(String oriderPrice) {
        this.oriderPrice = oriderPrice;
    }

    @Override
    public String toString() {
        return "MyOrder{" +
                "uid=" + uid +
                ", orderId='" + orderId + '\'' +
                ", orderName='" + orderName + '\'' +
                ", oriderPrice='" + oriderPrice + '\'' +
                '}';
    }
}
