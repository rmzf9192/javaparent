package com.el.controller;

import com.el.entity.ProductInfo;
import com.el.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author roman zhangfei
 * @Date 2019/12/5 16:47
 * @Version V1.0
 */
@RestController
public class SellerController {
    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public String createProject(@RequestBody ProductInfo productInfo){
        productService.createProduct(productInfo);
        return "创建成功";
    }

}