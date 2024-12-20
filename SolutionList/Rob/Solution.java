package SolutionList.Rob;

class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len==0) return 0;
        if(len==1) return nums[0];
        if(len==2) return Math.max(nums[0],nums[1]);

        int[]dp = new int[len];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<len;++i){
            int todayNoRob = dp[i-1];
            int todayDoRob = dp[i-2]+nums[i];
            dp[i] = Math.max(todayNoRob,todayDoRob);
        }

        return dp[len-1];
    }
}
