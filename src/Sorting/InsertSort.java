package Sorting;

/**
 * 插入排序：
 *
 * 时间复杂度 取决于 数组中《 逆序对 》个数， 所以当数组几乎有序的情况下插入排序很快
 *
 */
public class InsertSort {

    private static void swap (int[] arr, int i, int j) {

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 插入排序
     *
     * 每次插入操作都是 针对 i 这个位置的元素，把 i 这个位置的元素放到该放的位置
     *
     * @param arr
     */
    private static void insertSort(int[] arr) {

        int N = arr.length;

        for(int i = 1 ; i < N ; i ++ ){    // i : [1 , N-1] 决定了比较区间 ： 【1 ，i】
            for (int j = i ; j > 0; j --){// 在比较区间中[i , 1] 从后到前每次比较自己与前一个值，把小的放在前面
                if (arr[j] < arr[j - 1]){
                    swap(arr, j , j-1);
                }
            }
        }

    }


    public static void main(String[] args) {

        int[] arr = {3,2,5,4,1};
        insertSort(arr);
        for(int i : arr)
        System.out.println(i);
    }

}
