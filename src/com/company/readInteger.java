package com.company;

import java.util.Scanner;

public class readInteger {
    public static void main(String[] args) {
        StringBuilder end =new StringBuilder();
        Scanner input =new Scanner(System.in);
        int before=input.nextInt();
        if(before==0)System.out.println("ling");
        int redNum=before;
        redNum=Math.abs(redNum);//取绝对值
        while (redNum!=0){
            int temp=redNum%10;
            end.insert(0,add(temp));
            if (redNum/10>0)end.insert(0," ");
            redNum/=10;
        }
        if (before<0)end.insert(0,"fu ");
        System.out.print(end);
    }
    private static String add(int check){
        switch (check){
            case 0:return "ling";
            case 1:return "yi";
            case 2:return "er";
            case 3:return "san";
            case 4:return "si";
            case 5:return "wu";
            case 6:return "liu";
            case 7:return "qi";
            case 8:return "ba";
            case 9:return "jiu";
            default: return "";
        }
    }
}