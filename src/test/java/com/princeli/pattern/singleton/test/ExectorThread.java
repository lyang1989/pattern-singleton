package com.princeli.pattern.singleton.test;

import com.princeli.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author : princeli
 * @version 1.0
 * @className ExectorThread
 * @date 2019-05-11 20:51
 * @description: TODO
 */
public class ExectorThread implements Runnable{

    @Override
    public void run() {
        //LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        //LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        //ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();

        //System.out.println(Thread.currentThread().getName() + ":" + singleton);

        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());



    }
}
