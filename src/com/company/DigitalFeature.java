package com.company;

import java.util.Scanner;

public class DigitalFeature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp=input.nextInt(),count=0,binay=0,dig,math=1;
        do{
            count++;
            dig=temp%10;
            if((dig+count)%2==0){ binay=binay+math;}
            temp/=10;
            math=math*2;
        }while (temp>0);
        System.out.print(binay);
    }
}
