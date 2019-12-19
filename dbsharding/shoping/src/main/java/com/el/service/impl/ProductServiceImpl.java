package com.el.service.impl;

import com.el.dao.ProductDao;
import com.el.entity.ProductDescript;
import com.el.entity.ProductInfo;
import com.el.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author roman zhangfei
 * @Date 2019/12/5 10:49
 * @Version V1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    @Transactional
    public void createProduct(ProductInfo product) {
        ProductDescript productDescript = new ProductDescript();
        //设置商品描述信息
        productDescript.setDescript(product.getDescript());
        //调用dao向商品信息表
        productDao.insertProductInfo(product);
        //将商品信息id设置到productDescript
        productDescript.setProductInfoId(product.getProductInfoId());
        //设置店铺id
        productDescript.setStoreInfoId(product.getStoreInfoId());
        //向商品描述信息表中插入数据
        productDao.insertProductDescript(productDescript);
    }

    @Override
    public List<ProductInfo> queryProduct(int page, int pageSize) {
        int start = (page - 1) * pageSize;
        return productDao.selectProductList(start,pageSize);
    }
}