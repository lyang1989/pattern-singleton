package com.princeli.pattern.singleton.test;

import com.princeli.pattern.singleton.register.ContainerSingleton;

/**
 * @author : princeli
 * @version 1.0
 * @className ContainerSingletonTest
 * @date 2019-05-12 20:17
 * @description: TODO
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object obj = ContainerSingleton.getBean("com.princeli.pattern.singleton.test.Pojo");

        System.out.println(obj);


    }
}
