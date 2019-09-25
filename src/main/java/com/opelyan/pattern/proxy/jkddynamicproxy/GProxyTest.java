package com.opelyan.pattern.proxy.jkddynamicproxy;


/**
 * Created by Tom on 2019/3/10.
 */
public class GProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new GMeipo().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
