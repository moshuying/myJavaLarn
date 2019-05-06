package com.company;
import java.util.Scanner;
//奇偶个数
public class OddAndEvenNumber {
    public static void main(String[] args)  {
        Scanner input=new Scanner(System.in);
        int check,num1=0,num2=0;
        while (true){
            check=input.nextInt();
            if(check==-1)break;
            if(check%2==0){
                ++num1;
            }else {
                ++num2;
            }
        }
        System.out.print(num2+" "+num1);
    }
}
