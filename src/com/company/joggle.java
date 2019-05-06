package com.company;

public class joggle {
    public static void main(String[] args) {
        boolean bool;
        int count=0;
        for(int i=73;i<216;i+=2){
            bool=true;
            for (int j=3;j<i;j++){
                if(i%j==0){
                    bool=false;
                    break;
                }
            }
            if(bool){
                count++;
                System.out.println(i+" "+count);
            }
        }
    }
}
