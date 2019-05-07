package westCityLaboratory;

import java.util.Scanner;

public class MathBlackHole {
    public static void main(String[] args) {
        int[] renum;
        Scanner input =new Scanner(System.in);
        int before=input.nextInt();
        renum=rebulid(before);
        System.out.println(renum[0]);
        System.out.println(renum[1]);
    }
    private static int[] rebulid(int num){
        int max=0,min=0,cookie=0;
        int[] callBcak=new int[2],temp=new int[4];
        for(int i=0;i<temp.length;i++){
            temp[i]=num%10;num/=10;
        }
        //TODO:完善排序算法
        selectionSort(temp);
        //最大数
        max=getMax(max,temp);
        min=getMin(min,temp);
        callBcak[0]=max;
        callBcak[1]=min;
        return callBcak;
    }

    private static void selectionSort(int[] temp) {
        int n = temp.length;
        for (int i = 0; i < n; i++) {
            int k = i;
            //找出最小值的下标
            for (int j = i + 1; j < n; j++) {
                if (temp[j] < temp[k]) {
                    k = j;
                }
            }
            //将最小值放到未排序记录的第一个位置
            if (k > i) {
                int tmp = temp[i];
                temp[i] = temp[k];
                temp[k] = tmp;
            }
        }
    }
    private static int getMax(int max,int[] temp){
        max+=temp[3]*1000;
        max+=temp[2]*100;
        max+=temp[1]*10;
        max+=temp[0];
        return max;
    }
    private static int getMin(int min,int[] temp){
        min+=temp[0]*1000;
        min+=temp[1]*100;
        min+=temp[2]*10;
        min+=temp[3];
        return min;
    }
}

