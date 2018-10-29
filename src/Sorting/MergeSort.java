package Sorting;

import java.util.Arrays;

public class MergeSort {

    private static void mergeSort(int[] arr) {

        int N = arr.length;
        __mergeSort(arr, 0, N-1);
    }
    // 将arr[l...mid] 和 arr[mid+1...r] 两部分进行归并
    // 实际上merge操作才是对小数组进行排序

    /**
     *
     *  需要辅助数组来复制原数组
     *
     * @param arr
     * @param l
     * @param mid
     * @param r
     */
    private static void __merge(int[] arr, int l, int mid, int r) {

        int[] aux = new int[r-l+1];
        for(int i = l; i <= r; i++)
            aux[i-l] = arr[i];

        int i = l, j = mid+1;

        for(int k = l; k <= r; k++){

            if(i > mid){
                arr[k] = aux[j-l];
                j++;
            }else if (j > r){
                arr[k] = aux[i-l];
                i++;
            }
            else if(aux[i-l] < aux[j-l]){
                arr[k] = aux[i-l];
                i++;
            }else {
                arr[k] = aux[j-l];
                j++;
            }
        }
    }
    // 对arr[l...r] 的范围进行排序
    private static void __mergeSort(int[] arr, int l, int r){

        if( l >= r)
            return;
        int mid = l + (r - l)/2;
        __mergeSort(arr, l , mid);
        __mergeSort(arr, mid+1, r);
        if(arr[mid] > arr[mid+1])
            __merge(arr, l, mid, r);
    }
    public static void main(String[] args) {

        int[] arr = {9,8,7,6,5,4,3,2,1};

        mergeSort(arr);

        for (int i : arr)
            System.out.print(i + " ");
    }
}
