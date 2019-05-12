package com.princeli.pattern.singleton.test;

import com.princeli.pattern.singleton.lazy.LazyDoubleCheckSingleton;

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
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
