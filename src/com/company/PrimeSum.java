package com.company;

import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        int m =input.nextInt();
        isPrime(n,m);
    }
    private static void isPrime(int n,int m){
        boolean bool;
        int count=0,temp=0;
        for(int i=2;i<10000;i++){
            bool=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    bool=false;
                    break;
                }
            }
            if(bool){
                count++;
                if(count>=n)temp+=i;
                if(count==m){
                    System.out.println(temp);
                    return;
                }
            }
        }
    }
}
