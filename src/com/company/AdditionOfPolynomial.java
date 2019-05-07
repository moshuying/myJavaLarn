package com.company;

import java.util.Scanner;

public class AdditionOfPolynomial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] Pow = new int[101];//Pow数组记录系数，下标是幂指数
        int index,val,MaxIndex=-1;//先标记为-1，表示找不到
        for(int i=1;i<=2;++i) {//遍历两次，输入两个多项式
            while(true) {
                index=scan.nextInt();
                val = scan.nextInt();
                Pow[index] += val;
                if(index==0)break;//当输入幂指数是0，表示完成一个多项式的输入，跳出
            }
        }
        for(int i=100;i>=0;--i){//找到第一个非0系数的幂指数
            if(Pow[i]!=0){
                MaxIndex=i;//将第一个非0系数的幂指数给MaxIndex后跳出
                break;
            }
        }
        if(MaxIndex==-1){//表示整个多项式为0，直接输出0即可
            System.out.println(0);
        }
        else if(MaxIndex==0){//如果0次幂系数不为0，说明非0次幂的系数都为0，直接输出0次幂的系数
            System.out.println(Pow[MaxIndex]);
        }
        else{//先输出第一个非0次幂系数的项
            if(Pow[MaxIndex]>1||Pow[MaxIndex]<-1)System.out.print(Pow[MaxIndex]+"x");//如果系数不是1或-1且不是0，直接输出第一项的系数和x
            else if(Pow[MaxIndex]==1)System.out.print("x");//如果系数是1，输出x
            else if(Pow[MaxIndex]==-1)System.out.print("-x");//如果系数是-1，输出-x
            if(MaxIndex!=1)System.out.print(MaxIndex);//如果此时的幂指数不是1，接着就可以输出幂指数
            for(int i=MaxIndex-1;i>0;--i){//处理除首尾外中间的部分，因为已经有第一项了，所以接下来遇到系数是正数，前面可以直接输出'+'
                if(Pow[i]>1)System.out.print("+"+Pow[i]+"x");//当系数大于1时
                else if(Pow[i]==1)System.out.print("+x");//当系数是1时，直接输出+x
                else if(Pow[i]==-1)System.out.print("-x");//当系数是-1时，直接输出-x
                else if(Pow[i]<-1)System.out.print(Pow[i]+"x");//当系数小于-1时
                else continue;//这句话其实是多余的，为了呼应美hhh~，即系数为0时，直接跳过
                if(Pow[i]!=0 && i>1)System.out.print(i);    //如果系数不为0且幂指数不为1，才可以输出这个幂指数
            }//最后处理尾巴即0次幂，这时候就不用管系数是不是1或-1，因为最后一项是不含x的，所以只需按照剩下的规则格式输出即可
            if(Pow[0]>0)System.out.print("+"+Pow[0]);
            if(Pow[0]<0)System.out.print(Pow[0]);
        }
        scan.close();
    }
}
