package westCityLaboratory;
class human{
    int blood;int speed;int blue;int ATK;String name;
    human(){ blood=100;speed=450;blue=450;ATK=20;name= "刘同瑶"; }
    human(int A,int B,int C,int D,String n){ blood=A;speed=B;blue=C;ATK=D;name=n; }
    void print(){
        System.out.print("人物"+name+"的血量"+blood+"\t");
        System.out.print("人物"+name+"的移速"+speed+"\t");
        System.out.print("人物"+name+"的蓝量"+blue+"\t");
        System.out.print("人物"+name+"的攻击力"+ATK+"\t");
        System.out.println();
    }
    int getBlood(){ return blood; }
    String getName(){ return name;}
    void ATK(int A,String n){ System.out.println("英雄"+name+"受到了"+n+"一次普攻!");blood-=A; }

}
public class OneFor0513 {
    public static void main(String[] args) {
        human human1 =new human();
        human1.print();
        human human2 =new human(343,34234,342,34,"刘同瑶");
        human1.ATK(human2.ATK,human2.getName());
        human1.print();
        human2.print();
    }
}
