package com.princeli.pattern.singleton.register;

/**
 * @author : princeli
 * @version 1.0
 * @className EnumSingleton
 * @date 2019-05-12 19:46
 * @description: TODO
 */
public enum  EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
