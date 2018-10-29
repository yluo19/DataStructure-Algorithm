package Sorting;

public class BubbleSort {


    private static void bubbleSort(int[] arr){

        int N = arr.length;

        for (int i = N - 1; i > 0;  i--){  // 【 N-1 , 1 】根据 i-- 来每次把余下中最大的数放在 i 的位置上
            for(int j = 0; j < i; j++ ){ // 比较 j 和 j+1 把大的放在后面，这样可以找出最大的数放在 i 的位置
                if(arr[j+1] < arr[j]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i , int j ){ //swap需要数组arr来完成

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};

        bubbleSort(arr);

        for (int i : arr)
            System.out.println(i);
    }
}
