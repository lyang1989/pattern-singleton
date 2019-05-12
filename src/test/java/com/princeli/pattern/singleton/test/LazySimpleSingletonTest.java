package com.princeli.pattern.singleton.test;

/**
 * @author : princeli
 * @version 1.0
 * @className LazySimpleSingletonTest
 * @date 2019-05-11 20:51
 * @description: TODO
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        //LazySimpleSingleton.getInstance();
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();

        System.out.println("Exector End");

    }
}
