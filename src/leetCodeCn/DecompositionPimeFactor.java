package leetCodeCn;

import java.util.Scanner;

public class DecompositionPimeFactor {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        if(isPrime(num)){
            System.out.println(num);
            return;
        }

    }
    private static boolean isPrime(int N){
        if(N==1||N%2==0&&N!=2){return false;}
        for(int i=3;i<Math.sqrt(N);i++){
            if(N%i==0)return false;
        }
        return true;
    }
    //TODO:获取最小被整除的素数
    private static int minPrime(int N){
        return 1;
    }
    //TODO:顺序获取素数
    private static int getPrime(int N){
        if(N==1)return 2;
        boolean bool=false;
        for (int i=3;i<Integer.MAX_VALUE;i+=2){
            for (int j=2;j<i;j++){
                if(i%j==0) {
                    bool=true;
                    break;
                }
            }
        }
        return 0;
    }
}
