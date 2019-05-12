package com.princeli.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @author : princeli
 * @version 1.0
 * @className SeriableSingleton
 * @date 2019-05-12 19:28
 * @description: TODO
 */
public class SeriableSingleton implements Serializable {

    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton(){

    }

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }
}
