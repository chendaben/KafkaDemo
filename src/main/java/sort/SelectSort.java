package sort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int []arrays={3,5,8,4,9,20,15,1,2};
        selectSort(arrays);
    }

    /**
     * 选择排序
     * 思想：对于给定的一组记录，经过第一轮比较后得到最小的记录，然后将该记录与第一个记录的位置进行交换；
     *      接着对不包括第一个记录以外的其他记录进行第二轮比较，得到最小的记录并与第二个记录进行位置交换；
     *      重复该过程，直到进行比较的记录只有一个时为止
     * @param array
     */
    public  static void selectSort(int []array){
        for (int i = 0; i <array.length-1 ; i++) {
            int min=i;
            for (int j = i+1; j <array.length ; j++) {
                if (array[j]<array[min]){
                    min=j;
                }
            }
            if (min>i){
                int tmp =array[i];
                array[i]=array[min];
                array[min]=tmp;
            }
        }
        System.out.println(Arrays.toString(array));


    }
}
