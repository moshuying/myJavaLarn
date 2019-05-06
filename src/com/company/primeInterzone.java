package com.company;

import java.util.Scanner;

public class primeInterzone {
    public static void main(String[] args) throws Exception{
        boolean bool;//素数判断开关
        int count=0//素数数量统计
                ,twin=0,//孪生素数数量统计
                check;
        int[] temp=new int[117]//最大的区间中素数只有116个
                ,get;//根据输入数字获得区间
        Scanner input =new Scanner(System.in);
        System.out.println("请输入素数区间:1-15");
        while (true){
            check=input.nextInt();
            get=getBlock(check);
            if(get[0]==-1){
                System.out.println("输入类型错误!");
            }else if(get[0]>1){
                break;
            }
        }
        //最外层循环选择区间每次循环值加2
        for(int i=get[0];i<get[1];i+=2){
            bool=true;
            //内层循环从3开始遍历
            for (int j=3;j<i;j++){
                if(i%j==0){
                    bool=false;
                }
            }
            //统计素数和并把素数写入缓存
            if(bool){
                count++;
                temp[count]=i;
                System.out.println(i+" "+count);
            }
        }
        //遍历缓存数组判断孪生数组
        for (int i=1;i<temp.length-1;i++){
            if((temp[i+1]-temp[i])==2){
                twin++;
            }
        }
        System.out.println("大数据1701刘九江201730269:");
        System.out.println("素数S"+check+"区间一共有"+count+"个素数"+"孪生素数一共有"+twin+"个");
    }
    private static int[] getBlock(int check){
        int[] temp=new int[2];
        switch (check){
            case 1: temp[0]=1;temp[1]=72;return temp;
            case 2: temp[0]=73;temp[1]=216;return temp;
            case 3: temp[0]=217;temp[1]=432;return temp;
            case 4: temp[0]=433;temp[1]=720;return temp;
            case 5: temp[0]=721;temp[1]=1080;return temp;
            case 6: temp[0]=1081;temp[1]=1512;return temp;
            case 7: temp[0]=1513;temp[1]=2016;return temp;
            case 8: temp[0]=2017;temp[1]=2592;return temp;
            case 9: temp[0]=2593;temp[1]=3240;return temp;
            case 10: temp[0]=3241;temp[1]=3960;return temp;
            case 11: temp[0]=3961;temp[1]=4751;return temp;
            case 12: temp[0]=4752;temp[1]=5616;return temp;
            case 13: temp[0]=5617;temp[1]=6552;return temp;
            case 14: temp[0]=6553;temp[1]=7560;return temp;
            case 15: temp[0]=7561;temp[1]=8640;return temp;
            default:temp[0]=-1; return temp;
        }
    }
}
