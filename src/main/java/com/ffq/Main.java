package com.ffq;

import java.util.concurrent.Executors;

/**
 * @Author: ffq
 * @Description:
 * @Date: Create in 19:42 2019/1/3
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClassLoader classLoader = new MyClassLoader();
//        Class<?> people = Class.forName("com.ffq.People", true, classLoader);
        Class<?> aClass = classLoader.loadClass("com.ffq.People");
        System.out.println(aClass.getClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader());
//        System.out.println(people.getClassLoader());
    }
}
