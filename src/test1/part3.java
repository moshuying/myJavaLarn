package test1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

import static test1.part1.*;

/**
 * @Author: 墨抒颖
 * @email: webresult@qq.com
 * @Create: 2019/6/7 0:02
 * @Modify: 2019/06/07 10:58
 */

public class part3 {
    public static void main(String[] args) {
        //创建线性表并插入100以内的随机数
        LinkedList<Integer> A = new LinkedList<Integer>()
                           ,B=new LinkedList<Integer>()
                           ,C=new LinkedList<Integer>();
        insertList(A,10,100);
        insertList(B,10,100);
        Collections.sort(A);
        Collections.sort(B);
        //展示插入后的表A
        System.out.println("修改之前的线性表A");
        showList(A);
        System.out.println("");
        //展示插入后的表B
        System.out.println("修改之前的线性表B");
        showList(B);
        System.out.println("");
        System.out.println("得到的结果线性表C");
//        System.out.println(union(A,B).toString());
        showList(union(A,B));
    }
    private static LinkedList union(LinkedList<Integer> arrA, LinkedList<Integer> arrB){
        LinkedList<Integer> temp =new LinkedList<Integer>();
        for (int i=0;i<arrA.size();i++){
                temp.add(arrA.get(i));
                temp.add(arrB.get(i));
        }
        Collections.sort(temp);
        return temp;
    }
    public static void showList(LinkedList<Integer> arr){
        for (int val:arr){
            System.out.print(val+"\t");
        }
    }
    //线性表,要插入的数值,最大值
    public static void insertList(LinkedList<Integer> arr,int num,int max) {
        Random ran =new Random();
        for (int i=0;i<num;i++){
            arr.add(ran.nextInt(max));
        }
    }
}
