package test6;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author: Gosin
 * @Date: 2019/6/4 10:28
 */

public class num1 {

    public static void main(String[] args) {
        Random r=new Random();
        final int MAXSIZE =100,key=-999999;
        int[] temp =new int[MAXSIZE+1];
        temp[0]=key;
        for(int i=1;i<MAXSIZE;i++){
            temp[i]=r.nextInt(100);
        }
        Scanner input =new Scanner(System.in);
        int serch=input.nextInt();
        int serchNum=MAXSIZE;
        do{
            if (temp[serchNum]==serch){
                System.out.println("key:"+serch+",val:"+serchNum);
                break;
            }else if(temp[serchNum]==key){
                System.out.println("not found!");
            }
            serchNum--;
        }while(temp[serchNum]!=key);
    }
}
