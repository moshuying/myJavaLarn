package leetCodeCn;

public class LongestCommonPrefix {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==1) return strs[0];
        StringBuilder temp=new StringBuilder();
        if (strs.length>1){
            int len =strs[0].length();
            for (int i =0 ;i<len;i++){
                char curr =strs[0].charAt(i);//取字
                for (int j=1;j<strs.length;j++){
                    if (strs[j].length()<=i||strs[j].charAt(i)!=curr){
                        return temp.toString();
                    }
                    if (strs[j].charAt(i)==curr&&j==strs.length-1){
                        temp.append(curr);
                    }
                }
            }
        }
        return temp.toString();
    }
}
