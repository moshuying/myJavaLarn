package test1;

import java.util.Arrays;
import java.util.Random;

import static test1.part1.*;

/**
 * @Author: 墨抒颖
 * @email: webresult@qq.com
 * @Create: 2019/6/6 23:43
 * @Modify: 2019/06/07 00:02
 */

public class part2 {
    public static void main(String[] args) {
        //创建线性表并插入100以内的随机数
        int[] A =new int[10];
//        insertNum(A);
        int[] B =new int[10];
        Random ran =new Random();
        for (int i=0;i<B.length;i++){
            B[i]=ran.nextInt(10);
        }
        Arrays.sort(B);
        //展示插入后的表A
        System.out.println("修改之前的线性表A");
        show(A);
        System.out.println("");
        //展示插入后的表B
        System.out.println("修改之前的线性表B");
        show(B);
        System.out.println("");
        union(A,B);
        System.out.println("修改之后的线性表A");
        show(A);

    }
    public static void union(int[] arrA,int[] arrB){
        for (int i=0;i<arrB.length;i++){
            if(find(arrB,arrB[i])<=0){
                arrA[i]=arrB[i];
            }
        }
    }
    public static int find(int[] arr, int val){
        int count=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==val){
                count++;
            }
        }
        return count;
    }

}
