package Sorting;

public class QuickSort {

    // arr[l...p-1] < p & arr[p+1...r] > p
    private static int _partition(int[] arr, int l, int r) {

        int v = arr[l];

        int j = l;

        for (int i = l+1; i <= r; i++){
            if( arr[i] < v){
                swap(arr, j+1, i);
                j++;
            }
        }

        swap(arr, l, j);

        return j;

    }

    private static void __quickSort(int[] arr, int l, int r){

        if(l >= r)
            return;

        int p = _partition(arr, l, r); //p 是个索引 把数组分成2部分
        __quickSort(arr, l, p-1);
        __quickSort(arr, p+1, r);
    }


    public static void quickSort(int[] arr){

        int N = arr.length;
        __quickSort(arr, 0 , N-1);
    }


    private static void swap(int[] arr, int i , int j ){ //swap需要数组arr来完成

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {

    }
}
