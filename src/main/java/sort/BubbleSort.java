package sort;

import java.util.Arrays;

/**
 * @author cyq
 * @date 2019/03/05
 * @description
 **/

public class BubbleSort {

    public static void main(String[] args) {
        int a[]={6,7,8,2,4,1,9};
        bubbleSort(a);
    }

    /**
     * 冒泡排序
     * 思想：每一趟都把最大的数放到了最后一位
     * 第一趟把最大的数放在了最后一位
     * 第二趟把第二大的数放到了倒数第二位
     * 第三躺把第三大的数放到了第三位
     * ......
     * 后面排好的数就不用再排了
     * 时间复杂度 n(n-1)/2=O(n2)
     */
    public static void bubbleSort(int []a){
        for (int i=1;i<a.length;i++){ //外层循环表示循环趟数 n-1次
            for (int j=0;j<a.length-i;j++){
                if (a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
