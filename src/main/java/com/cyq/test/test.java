package com.cyq.test;

import java.util.*;

/**
 * @author cyq
 * @date 2019/02/15
 * @description
 **/

public class test {

    public static void main(String[] args) {

//        int []test={2,3,4};
//        System.out.println(Arrays.toString(test)); //打印数组

        List<Integer> list = new ArrayList<>();
        list.add(1);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if (it.next()==1){
                it.remove();
            }
        }
        System.out.println(list.toString());


    }

}
