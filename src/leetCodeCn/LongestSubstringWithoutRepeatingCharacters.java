package leetCodeCn;

/**
 * @Author: 墨抒颖
 * @email: webresult@qq.com
 * @Create: 2019/7/9 22:45
 * @Modify: 2019/7/9 22:45
 * @vision: 1.0.0
 */

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int pre = -1;
        for (int i = 0; i < s.length(); i++) {
            for(int j = pre + 1; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)){
                    pre = j;
                    break;
                }
            }
            longest = Math.max(i - pre, longest);
        }
        return longest;
    }
}
