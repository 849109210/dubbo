package com.zhangjie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 张杰
 * 2021/7/23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
    private Integer uid;
    private String orderId;
    private String orderName;
    private float price;
    private Integer amount;


}
