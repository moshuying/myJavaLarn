package leetCodeCn;

public class NumFor1 {
    public static int main(int i) {
        i = (i & 0x55555555) + ((i >> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >> 2) & 0x33333333);
        i = (i & 0x0F0F0F0F) + ((i >> 4) & 0x0F0F0F0F);
        i = (i * (0x01010101) >> 24);
        return i;
    }
}
