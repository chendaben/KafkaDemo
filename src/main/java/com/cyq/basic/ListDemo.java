package com.cyq.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        testToString();
    }

    public static void testToString(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
