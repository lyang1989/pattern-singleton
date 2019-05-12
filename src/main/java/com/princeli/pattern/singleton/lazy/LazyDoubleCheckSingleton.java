package com.princeli.pattern.singleton.lazy;

/**
 * @author : princeli
 * @version 1.0
 * @className LazyDoubleCheckSingleton
 * @date 2019-05-11 21:08
 * @description: TODO
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton(){

    }

    /**
     * 双重检查锁
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
