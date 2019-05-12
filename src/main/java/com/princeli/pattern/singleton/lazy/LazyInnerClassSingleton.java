package com.princeli.pattern.singleton.lazy;

/**
 * @author : princeli
 * @version 1.0
 * @className LazyInnerClassSingleton
 * @date 2019-05-11 21:24
 * @description: TODO
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){

        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许构建多个实例");
        }

    }

    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private  static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }


}
