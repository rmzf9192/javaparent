package com.el.base.design.prototype;

import lombok.Data;

import java.io.*;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 11:36
 * @Version V1.0
 */
@Data
public class DeepPrototype implements Serializable,Cloneable {

    public String name;
    public DeepCloneTarget deepCloneTarget;

    public DeepPrototype() {
        super();
    }

    /**
     * 深拷贝：使用clone方式
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        Object deep = null;

        deep = super.clone();

        DeepPrototype deepPrototype = (DeepPrototype) deep;

        deepPrototype.deepCloneTarget = (DeepCloneTarget) deepCloneTarget.clone();

        return deepPrototype;
    }

    /**
     * 序列化与反序列化：深拷贝
     * @return
     */
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {

            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype deepPrototype = (DeepPrototype) ois.readObject();
            return deepPrototype;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

}