package Sort;
import test1.*;

import java.util.LinkedList;

/**
 * @Author: 墨抒颖
 * @email: webresult@qq.com
 * @Create: 2019/6/11 12:30
 * @Modify: 2019/6/11 12:30
 */

public class CXLInsertionSort {
    public static void main(String[] args) {
        int[] temp =new int[100];
        part1.insertNum(temp,9,temp.length);
        Sort(temp);
        part1.show(temp);
    }
    public static void Sort(int[] arr){
        for (int i=2;i<=arr.length-1;++i){
            if(arr[i]<arr[i-1]){
                arr[0]=arr[i];//复制为监视哨
                int j=0;
                for (j=i-1;arr[0]<arr[j];--j){
                    arr[j+1]=arr[j];
                }
                arr[j+1]=arr[0];
            }
        }
    }
}
