package com.princeli.pattern.singleton.test;

import com.princeli.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * @author : princeli
 * @version 1.0
 * @className EnumSingletonTest
 * @date 2019-05-12 19:50
 * @description: TODO
 */
public class EnumSingletonTest {

//    public static void main(String[] args) {
//        EnumSingleton s1 = null;
//        EnumSingleton s2 = EnumSingleton.getInstance();
//        FileOutputStream fos = null; try {
//            fos = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(s2);
//            oos.flush();
//            oos.close();
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            s1 = (EnumSingleton)ois.readObject();
//            ois.close();
//            System.out.println(s1);
//            System.out.println(s2);
//            System.out.println(s1 == s2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            Object o1 = c.newInstance("tom",666);

            Object o2 = EnumSingleton.getInstance();

            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
