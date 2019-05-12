package leetCodeCn;

public class unint32_t {
    public static int main(int n) {
        int re=0;
        for(int i=0;i<32;i++){
            re |=((n>>i)&1)<<(31-i);
        }
        return re;
    }
}
