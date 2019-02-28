package sort;

public class QuickSort {

    public static void main(String[] args) {
        int []arrays={2,5,8,4,9,20,15,1};
        quickSort(arrays,0,arrays.length-1);
    }

    public  static int[] quickSort(int []array,int start,int end){
        if (start>=end){
            return array;
        }
        int right = start;
        int left = end;
        int middle = array[0];
        while (left<right){
            while (array[right]>=middle){
                right=right-1;
            }
            while (array[left]<middle){
                left=left+1;
            }

            

        }
    }
}
