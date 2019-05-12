package com.princeli.pattern.singleton.test;

import com.princeli.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @author : princeli
 * @version 1.0
 * @className LazyInnerClassSingletonTest
 * @date 2019-05-11 21:43
 * @description: TODO
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {


        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();

            Object o2 = LazyInnerClassSingleton.getInstance();

            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
