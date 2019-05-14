package leetCodeCn;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234543231));
    }
    public static boolean isPalindrome(int x){
        if(x<0||(x%10==0&&x!=0)) return false;
        int re=0;
        while (re<x){
            re=re*10+x%10;x/=10;
        }
        return re==x||re/10==x;
    }
}