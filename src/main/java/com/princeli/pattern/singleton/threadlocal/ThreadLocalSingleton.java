package com.princeli.pattern.singleton.threadlocal;

/**
 * @author : princeli
 * @version 1.0
 * @className ThreadLocalSingleton
 * @date 2019-05-12 20:26
 * @description: 伪线程安全
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
             new ThreadLocal<ThreadLocalSingleton>(){
                 @Override
                 protected ThreadLocalSingleton initialValue() {
                     return new ThreadLocalSingleton();
                 }
             };


    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
