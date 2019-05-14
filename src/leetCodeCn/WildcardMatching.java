package leetCodeCn;

public class WildcardMatching {
    public boolean isMatch(String s,String p){
        boolean[][] value=new boolean[p.length()+1][s.length()+1];
        value[0][0]=true;
        for (int i=1;i<s.length();i++){
            value[0][i]=false;
        }
        for (int i=1;i<=p.length();i++){
            if(p.charAt(i-1)=='*'){
                for (int j=1;j<=s.length();i++){
                    value[i][j]=(value[i][j-1]||value[i-1][j]);
                }
            }else if(p.charAt(i-1)=='?'){
                value[i][0]=false;
                for (int j=1;j<s.length();j++){
                    value[i][j]=value[i-1][j-1];
                }
            }else {
                value[i][0]=false;
                for(int j=1;j<=s.length();j++){
                    value[i][j]=s.charAt(j-1)==p.charAt(i-1)&&value[i-1][j-1];
                }
            }
        }
        return value[p.length()][s.length()];
    }
}
