package com.ffq.thread;

/**
 * @author ffq
 * @create 2019-01-04 23:41
 **/
public class VolatileDemo {
    private volatile static Boolean v = false;
    private volatile static int i = 0;

    public static void read() {
        while (!v) {
//            System.out.println(1);
        }
        System.out.println("读取成功");
    }

    public static void write() {
        v = true;
        i = 42;
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            read();
        }).start();
        Thread.sleep(1000);
        new Thread(() -> {
            write();
        }).start();

    }
}
