package leetCodeCn;

import java.util.Scanner;

public class DecompositionPimeFactor {
    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        int num=input.nextInt();
//        int[] print=getPrime();
        for (int i=0;i<getPrime().length;i++){
            System.out.print(getPrime()[i]+" ");
        }
//        if(isPrime(num)){
//            System.out.println(num);
//            return;
//        }

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
    private static int[] getPrime(){
        int[] primes = new int[20];
        primes[0]=2;
        int cnt=1;
        for (int i=3;i<primes.length;i++){
            for(int j=0;j<cnt;j++){
                if(i%primes[j]==0) continue;
            }
            primes[cnt++]=i;
        }
        return primes;
    }
}
