package com.cyq.test;

/**
 * @author cyq
 * @date 2019/03/01
 * @description
 **/

public class test2 {

    static {
        int x = 5;
    }

    static int x, y;
    public static void main(String[] args) {
        x--;
        myMethod();
        int z=1;
        System.out.println(z);
        System.out.println(x + y++ + x);
    }

    public static void myMethod() {
        y = x++ + ++x;

    }
}
