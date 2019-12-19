package com.el.base.design.prototype;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 11:16
 * @Version V1.0
 */
public class PrototypeTest {
    public static void main(String[] args) {
        System.out.println("通过原型完成对象的创建");

        Sheep sheep = new Sheep("tom",1,"白色");
        Sheep sheep1 = new Sheep("tom",2,"黑色");


        Sheep clone1 = (Sheep) sheep.clone();

        Sheep clone2 = (Sheep) sheep.clone();

        Sheep clone3 = (Sheep) sheep.clone();

        System.out.println("sheep :"+sheep +"hashcode:"+sheep.hashCode());
        System.out.println("clone1 :"+sheep +"hashcode:"+clone1.hashCode());
        System.out.println("clone2 :"+sheep +"hashcode:"+clone2.hashCode());
        System.out.println("clone3 :"+sheep +"hashcode:"+clone3.hashCode());



        DeepPrototype p = new DeepPrototype();
        p.name = "宋江";
        p.deepCloneTarget = new DeepCloneTarget("大牛", "小牛");

        //方式1 完成深拷贝

//		DeepProtoType p2 = (DeepProtoType) p.clone();
//
//		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

        //方式2 完成深拷贝
        DeepPrototype p2 = (DeepPrototype) p.deepClone();

        System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneTarget.hashCode());
        System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneTarget.hashCode());
    }
}