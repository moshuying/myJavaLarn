package stack;

import java.util.Scanner;

/**
 * @Author: 墨抒颖
 * @Create: 2019/6/4 17:44
 * @Modify: 2019/06/04 18:54
 */

public class title2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        Integer sum,temp = 0;
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        for(int i=number;i>=1;i=i/2){
            if(i%2==0){
                sum=0;
            }else {
                sum=1;
            }
            stack.push(sum);
            temp++;
        }
        for (int i=0;i<temp;i++){
            System.out.print(stack.pop());
        }
    }
}
