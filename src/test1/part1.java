package test1;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author: 墨抒颖
 * @Email:  webresult@qq.com
 * @Create: 2019/6/6 22:55
 * @Modify: 2019/06/07 10:47
 */ 

public class part1 {
    public static void main(String[] args) {
        //创建线性表并插入100以内的随机数
        int[] A =new int[10];
        insertNum(A);
        int[] B =new int[10];
        insertNum(B);
        //展示插入后的表A
        System.out.println("修改之前的线性表A");
        show(A);
        System.out.println("");
        //展示插入后的表B
        System.out.println("修改之前的线性表B");
        show(B);
        System.out.println("");
        //修改线性表A
        union(A,B);
        System.out.println("修改之后的线性表A");
        Arrays.sort(A);
        show(A);
    }
    //构建新的集合,A中包含A和B都不重复的数字
    public static void union(int[] arrA,int[] arrB){
        for (int i=0;i<arrB.length;i++){
            if(find(arrB,arrA[i])){
                arrA[i+(arrA.length/2)-1]=arrB[i];
            }
        }
    }
    //找不到返回真,找到返回假
    public static boolean find(int[] arr,int A){
        for (int value : arr) {
            if (value == A) {
                return false;
            }
        }
        return true;
    }
    //展示所有元素
    public static void show(int[] arr){
        for (int value : arr) {
            System.out.print(value + "\t");
        }
    }
    //随机插入数字
    public static void insertNum(int[] arr){
        Random ran =new Random();
        for (int i=0;i<arr.length/2;i++){
            arr[i]=ran.nextInt(100);
        }
    }
}
