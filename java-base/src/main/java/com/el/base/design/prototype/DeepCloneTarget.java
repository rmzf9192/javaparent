package com.el.base.design.prototype;

import lombok.Data;

import java.io.Serializable;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 11:33
 * @Version V1.0
 */
@Data
public class DeepCloneTarget implements Serializable,Cloneable {

    private String cloneName;
    private String cloneClass;

    public DeepCloneTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    public Object clone() throws CloneNotSupportedException {
       return super.clone();
    }
}