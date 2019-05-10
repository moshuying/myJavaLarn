package westCityLaboratory;

import java.util.Scanner;

public class MathBlackHole {
    public static void main(String[] args) {
        //return 6174;
        int[] renum;
        Scanner input =new Scanner(System.in);
        int before=input.nextInt(),temp=0;
        do {
            renum=rebulid(before);
            before=renum[0]-renum[1];
            if (temp==before)break;
            temp=before;
        }while (true);
        System.out.println(before);
    }
    private static int[] rebulid(int num){
        int[] callBcak=new int[2],temp=new int[(num+"").length()];
        for(int i=0;i<temp.length;i++){
            temp[i]=num%10;num/=10;
        }
        selectionSort(temp);
        callBcak[0]=getMax(callBcak[0],temp);
        callBcak[1]=getMin(callBcak[1],temp);
        return callBcak;
    }

    private static void selectionSort(int[] temp) {
        int n = temp.length;
        for (int i = 0; i < n; i++) {
            int k = i;
            for (int j = i + 1; j < n; j++) {
                if (temp[j] < temp[k]) {
                    k = j;
                }
            }
            if (k > i) {
                int tmp = temp[i];
                temp[i] = temp[k];
                temp[k] = tmp;
            }
        }
    }
    private static int getMax(int max,int[] temp){
        for (int i=temp.length-1;i>=0;i--){
            max*=10;
            max+=temp[i];
        }
        return max;
    }
    private static int getMin(int min,int[] temp){
        for (int i=0;i<temp.length;i++){
            min*=10;
            min+=temp[i];
        }
        return min;
    }
}

