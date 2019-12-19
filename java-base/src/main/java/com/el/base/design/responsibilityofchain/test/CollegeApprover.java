package com.el.base.design.responsibilityofchain.test;

/**
 * @author Roman.zhang
 * @Date: 2019/7/9 8:59
 * @Version:V1.0
 * @Description:CollegeApprover
 */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice()>5000 && purchaseRequest.getPrice()<= 10000){
            System.out.println("请求编号 id = "+purchaseRequest.getId()+"被"+this.name+"处理了");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
