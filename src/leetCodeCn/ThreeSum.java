package leetCodeCn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);
        int fi = 0;
        while (fi < nums.length - 2) {
            int target = 0 - nums[fi];
            int lo = fi + 1;
            int hi = nums.length - 1;
            while (lo < hi) {
                int tmpSum = nums[lo] + nums[hi];
                if (tmpSum > target) {
                    while (lo < --hi && nums[hi] == nums[hi + 1]) ;
                } else if (tmpSum < target) {
                    while (++lo < hi && nums[lo] == nums[lo - 1]) ;
                } else {
                    res.add(Arrays.asList(nums[fi], nums[lo], nums[hi]));
                    while (++lo < hi && nums[lo] == nums[lo - 1]) ;
                }
            }
            // 去重
            while (++fi < nums.length - 2 && nums[fi] == nums[fi - 1]) ;
        }
        return res;
    }
}
