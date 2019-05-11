package leetCodeCn;

public class IntegerInversion {
    public static int main(int x) {
        if ((x > 0 && x < 10) || (x < 0 && x > -10)) {
            return x;
        }
        int result = 0;
        int low = (int) -Math.pow(2, 31), high = (int) Math.pow(2, 31) - 1;
        while (x >= 10 || x <= -10) {
            if (x % 10 != 0 || result != 0) {
                result = result * 10 + x % 10;
            }
            x /= 10;
        }
        low = ((low) / 10);
        high = ((high) / 10);

        if ((result > 0 && result <= high) || (result >= low && result < 0) || result==0) {
            result = result * 10 + x;
            return result;
        } else {
            return 0;
        }
    }
}
