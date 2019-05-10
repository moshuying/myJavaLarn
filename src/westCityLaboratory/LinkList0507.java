package westCityLaboratory;

import java.util.Random;
import java.util.Scanner;

public class LinkList0507 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Node.LinList linList=new Node.LinList();
        Random r=new Random();
        int n=5;
        try{
            for (int i=0;i<n;i++){
                linList.insert(i,r.nextInt(20));
            }
            linList.insert(5,r.nextInt(30));
            linList.print();
            linList.delete(4);
            System.out.println();
            linList.print();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
