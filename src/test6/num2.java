package test6;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author: Gosin
 * @Date: 2019/6/4 10:51
 */

public class num2 {
    public static void main(String[] args) {
        Random r=new Random();
        final int MAXSIZE =100,key=-999999;
        int[] temp =new int[MAXSIZE+1];
        temp[0]=key;
        for(int i=1;i<temp.length;i++){
            temp[i]=r.nextInt(100);
        }
        Scanner input =new Scanner(System.in);
        int serch=input.nextInt();
        int serchNum=temp.length;
        QuickSort(temp);
        int ans=serch(temp,serch);
        System.out.println("num:"+serch+",key:"+ans+",val:"+temp[ans]);
    }
    private static int serch(int[] arr,int key){
        int maxArr =arr.length-1;//初始最大下标
        int minArr=0;  //最小下标
        int index=(minArr+maxArr)/2;//中间下标
        for (int i=0;i<arr.length;i++){
            if(arr[index]>key){//数组中间下标值比key大时
                maxArr=index;//重设最大下标
                index=index/2;//重设最小下标
            }else if(arr[index]<key){//数组中间下标值比key小时,说明key在数组的后半段
                minArr=index;
                index=(minArr+maxArr)/2;
            }else {
                break;
            }
        }
        return index;
    }
    public static void QuickSort(int[] L) {
        Qsort(L,1,L.length-1);
    }

    private static void Qsort(int[] L,int low,int high) {
        int pivot;
        if(low<high) {
            //将L[low,high]一分为二,算出枢轴值pivot,该值得位置固定,不用再变化
            pivot=partition0(L,low,high);

            //对两边的数组分别排序
            Qsort(L,low,pivot-1);
            Qsort(L,pivot+1,high);
        }
    }

    //  选择一个枢轴值(关键字) 把它放到某个位置 使其左边的值都比它小 右边的值都比它大
    private static int partition0(int[] L,int low,int high) {
        int pivotkey;
        pivotkey=L[low];
        //顺序很重要，要先从右边找
        while(low<high) {
            while(low<high && L[high]>=pivotkey) {  //从后往前找到比key小的放到前面去
                high--;
            }
            swap(L,low,high);
            while(low<high && L[low]<=pivotkey) {  //从前往后找到比key大的 放到后面去
                low++;
            }
            swap(L,low,high);
        } //遍历所有记录  low的位置即为 key所在位置, 且固定,不用再改变
        return low;
    }
    //交换数组的两个位置
    private static void swap(int[] L,int i,int j) {
        int temp=L[i];
        L[i]=L[j];
        L[j]=temp;
    }
}
