package com.princeli.pattern.singleton.lazy;

/**
 * @author : princeli
 * @version 1.0
 * @className LazySimpleSingleton
 * @date 2019-05-11 20:44
 * @description: TODO
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton(){

    }

    public synchronized static LazySimpleSingleton getInstance(){
        if (lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
