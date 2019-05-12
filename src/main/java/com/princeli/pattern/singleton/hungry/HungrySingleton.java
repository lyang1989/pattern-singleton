package com.princeli.pattern.singleton.hungry;

/**
 * @author : princeli
 * @version 1.0
 * @className HungrySingleton
 * @date 2019-05-11 20:38
 * @description: TODO
 */
public class HungrySingleton {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
