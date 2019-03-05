package com.cyq.test;

/**
 * @author cyq
 * @date 2019/02/26
 * @description
 **/

public class test1 {

    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        myThread.setName("线程1");
        myThread.start();

        Thread myThread2 = new Thread(new MyThread2());
        myThread2.start();
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println(this.getName()+" test");
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println(" test");
    }
}
