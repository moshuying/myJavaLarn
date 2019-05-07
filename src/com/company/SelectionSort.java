package com.company;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {54, 45, 42, 5245, 25, 34, 23};
        for (int num : arr) {
            System.out.print(num + " ");
        }
        //选择排序的优化
        for (int i = 0; i < arr.length - 1; i++) {//做第i趟排序
            int k = i;
            for (int j = k + 1; j < arr.length; j++) {
                if (arr[j] > arr[k]) {
                    k = j;//记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束,也就是找到本轮循环的最小的数以后,再进行交换
            if (i != k) {//交换a[i]和a[k]
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
