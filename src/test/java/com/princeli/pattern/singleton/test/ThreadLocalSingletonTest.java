package com.princeli.pattern.singleton.test;

import com.princeli.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author : princeli
 * @version 1.0
 * @className ThreadLocalSingletonTest
 * @date 2019-05-12 20:29
 * @description: TODO
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":"+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":"+ThreadLocalSingleton.getInstance());


        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();



    }
}
