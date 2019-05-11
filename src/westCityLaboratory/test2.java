package westCityLaboratory;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int loop;
        int[] p=new int[65];
        String[] name=new String[65];
        //字符数组从1开始,数组也从1开始
        for (int i=0;i<65;++i){
            p[i] = i + 1;
        }
        //输入部分开始
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
        //输入部分结束,调整输出
        w=(w+loop-1)%loop;
        while (true) {
            w=(w+s-1)%loop;
            System.out.println(name[p[w]]);
            for (int j=w;j<loop-1;++j) p[j]=p[j+1];
            --loop;
            if (loop == 0) break;
        }
    }
    //约瑟夫环递归
    private static int ysfdg(int sum,int value,int n){
        if(n==1){
            return (sum+value-1)%sum;
        }else {
            return (ysfdg(sum-1,value,n-1)+value)%sum;
        }
    }
}
