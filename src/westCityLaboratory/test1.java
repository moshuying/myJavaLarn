package westCityLaboratory;

import java.util.List;

class gather{
    int[] list=new int[100];
    int elem=0;
    public gather(){
        random(list);
        elem=list.length;
    }
    public gather(int len){
        elem=len;
        random(list,len);
    }
    public int getElem(){
        return elem;
    }
    public int[] getList(){
        return list;
    }
    private int findElem(int F){
        for (int i=0;i<elem;i++){
            if(list[i]==F)return list[i];
        }
        return  list[1];
    }
    private void random(int[] list){
        for (int i=0;i<list.length;i++){
            list[i]=(int)(Math.random()*10);
        }
    }
    private void random(int[] list,int len){
        for (int i=0;i<len;i++){
            list[i]=(int)(Math.random()*10);
        }
    }
}

public class experimentOne {
    public static void main(String[] args) {
        gather La=new gather(50);
        gather Lb=new gather(50);

    }
    public static void union(int[] A,int[] B){
        for (int i=0;i<B.length;i++){

        }
    }
}