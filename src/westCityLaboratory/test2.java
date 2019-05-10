package westCityLaboratory;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int loop;
        int[] p=new int[65];
        String[] name=new String[65];
        for (int i=0;i<65;++i){
            p[i]=i;
        }
        loop=input.nextInt();
        int i=0;
        while (i<loop+1){
            name[i]=input.nextLine();
            i++;
        }
        String temp;
        temp=input.nextLine();
        char[] c=temp.toCharArray();
        int w=Integer.parseInt(c[0]+""),s=Integer.parseInt(c[2]+"");
        w=(w+loop-1)%loop;
        --loop;
        do {
            w=(w+s-1)%loop;
            System.out.print(name[p[w]]+" ");
            for (int j=w;j<loop-1;++j) p[j]=p[j+1];
            --loop;
        }while (loop==0);
    }
}
