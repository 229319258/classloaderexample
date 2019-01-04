package com.ffq;

/**
 * @author ffq
 * @create 2019-01-04 0:38
 **/
public class ThreadE implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println(1);
            try {
                Thread.sleep(5000);
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(Thread.currentThread().isInterrupted()){
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadE());
        thread.start();
//        Thread.sleep(5000);
        thread.interrupt();
    }
}
