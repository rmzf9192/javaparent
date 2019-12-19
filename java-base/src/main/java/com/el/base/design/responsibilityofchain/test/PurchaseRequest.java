package com.el.base.design.responsibilityofchain.test;

/**
 * @author Roman.zhang
 * @Date: 2019/7/9 8:56
 * @Version:V1.0
 * @Description:PurchaseRequest 请求类
 */
public class PurchaseRequest {
    private int type = 0;
    private float price = 0.0f;
    private int id = 0;

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
