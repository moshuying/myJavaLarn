package westCityLaboratory;
import java.util.Scanner;
public class OneFor0507 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        char temp;
        while (true){
            temp=input.next().charAt(0);
            if(temp=='q'){
                break;
            }else {
                System.out.println("输入的数据有误");
            }
        }
        System.out.println("大数据1701刘九江 201730269 ");
    }
}
