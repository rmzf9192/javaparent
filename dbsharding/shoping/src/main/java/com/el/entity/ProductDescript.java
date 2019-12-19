package com.el.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author roman zhangfei
 * @Date 2019/12/5 17:32
 * @Version V1.0
 */
public class ProductDescript {

    private Long id;

    /**
     * 所属商品id
     */
    private Long productInfoId;

    /**
     * 商品描述
     */
    private String descript;

    /**
     * 所属店铺id
     */
    private Long storeInfoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(Long productInfoId) {
        this.productInfoId = productInfoId;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Long getStoreInfoId() {
        return storeInfoId;
    }

    public void setStoreInfoId(Long storeInfoId) {
        this.storeInfoId = storeInfoId;
    }
}