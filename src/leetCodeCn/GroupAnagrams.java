package leetCodeCn;

import java.util.*;

/**
 * @Author: 墨抒颖
 * @email: webresult@qq.com
 * @Create: 2019/7/8 17:04
 * @Modify: 2019/7/8 17:04
 * @vision: 1.0.0
 */

public class GroupAnagrams {
    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> temp = new ArrayList<>();
        Map<String, Integer> hashMap = new HashMap<>();

        for (String str : strs) {
            String s = sort(str);
            Integer index = hashMap.get(s);
            if (index == null) {
                List<String> list = new ArrayList<>();
                list.add(str);
                temp.add(list);
                hashMap.put(s, temp.size() - 1);
            } else {
                temp.get(index).add(str);
            }
        }

        return temp;
    }

    private String sort(String s) {
        char[] cs = s.toCharArray();
        Arrays.sort(cs);
        return new String(cs);
    }
}
