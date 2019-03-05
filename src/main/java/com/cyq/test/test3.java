package com.cyq.test;

import java.util.*;

/**
 * @author cyq
 * @date 2019/03/01
 * @description Java采用了中间缓存变量的机制
 **/

public class test3 {
    public static void main(String[] args) {
        int j = 0;
        short s=16;
        byte a=2,b=4,c;
        for (int i = 0; i < 100; i++) {
            j = ++j;
        }

        Map<String,String> map = new HashMap<>();
        Map<String,String> map2 = new Hashtable<>();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        Vector<String> vector = new Vector<>();
        Set<String> set ;

        System.out.println(j);
    }

}
