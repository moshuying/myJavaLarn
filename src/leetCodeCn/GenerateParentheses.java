package leetCodeCn;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.print(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> temp = new ArrayList<String>();
        generate(temp, "", 0, 0, n);
        return temp;
    }
    public static void generate(List<String> res , String ans, int con1, int con2, int n){
        if(con1 > n || con2 > n) return;
        if(con1 == n && con2 == n)  res.add(ans);
        if(con1 >= con2){
            String ans1 = new String(ans);
            generate(res, ans+"(", con1+1, con2, n);
            generate(res, ans1+")", con1, con2+1, n);
        }
    }
}
