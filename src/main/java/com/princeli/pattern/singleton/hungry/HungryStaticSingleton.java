package com.princeli.pattern.singleton.hungry;

/**
 * @author : princeli
 * @version 1.0
 * @className HungryStaticSingleton
 * @date 2019-05-11 20:42
 * @description: TODO
 */
public class HungryStaticSingleton {

    private final static HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){

    }

    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
