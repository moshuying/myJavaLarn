package westCityLaboratory;

import java.util.HashMap;
import java.util.Map;

public class CXL0514 {
    public static void main(String[] args) {
        int[] temp={1,2,4,7,11,15};
        int getnum=15;
        System.out.println(twoSum(temp,getnum)[0]+" "+twoSum(temp,getnum)[1]);
    }
    public static int[] twoSum(int[] nums,int target) {
        Map<Integer,Integer> map =new HashMap<>(nums.length,1);
        for (int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)){
                int index =map.get(temp);
                if(index!=i){
                    return new int[]{i,index};
                }
            }else {
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
