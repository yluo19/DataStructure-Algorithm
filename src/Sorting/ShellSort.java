package Sorting;

/**
 * 希尔排序
 *
 */
public class ShellSort {

    private static void swap (int[] arr, int i, int j) {

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void shellSort(int[] arr){

        int h = arr.length / 2;
        int N = arr.length;

        while(h >= 1){
            for(int i = h; i < N; i++){
                for(int j = i; j >= h; j -= h){
                    if (arr[j] < arr[j-h])
                        swap(arr, arr[j], arr[j-h]);
                }
            }

            h /= 2;
        }
    }

    public static void main(String[] args) {

        int[] arr = {9,8,7,6,5,4,3,2,1};

        shellSort(arr);

        for(int i : arr)
            System.out.println(i);
    }
}
