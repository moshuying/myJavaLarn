package leetCodeCn;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVII"));
    }
    public static int romanToInt(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'I':count+=1;break;
                case 'V':if(i!=0 && s.charAt(i-1)=='I')count+=3;else count+=5;break;
                case 'X':if(i!=0 && s.charAt(i-1)=='I')count+=8;else count+=10;break;
                case 'L':if(i!=0 && s.charAt(i-1)=='X')count+=30;else count+=50;break;
                case 'C':if(i!=0 && s.charAt(i-1)=='X')count+=80;else count+=100;break;
                case 'D':if(i!=0 && s.charAt(i-1)=='C')count+=300;else count+=500;break;
                case 'M':if(i!=0 && s.charAt(i-1)=='C')count+=800;else count+=1000;break;
            }
        }
        return  count;
    }
}
