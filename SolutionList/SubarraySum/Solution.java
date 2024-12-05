package SolutionList.SubarraySum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    // 数组中 和为k 的子数组的 个数
    public int subarraySum(int[] nums, int target) {
        int preSum=0;
        int cnt=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int num:nums){
            preSum+=num;
            cnt+=map.getOrDefault(preSum-target,0);
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }

        return cnt;
    }
}