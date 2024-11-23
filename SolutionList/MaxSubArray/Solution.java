package SolutionList.MaxSubArray;

class Solution {
    public int maxSubArray1(int[] nums) {
        int max=nums[0];
        int pre=0;
        for(int num:nums){
            pre = Math.max(pre+num,num);
            max = Math.max(max,pre);
        }
        return max;
    }
    public int maxSubArray2(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        int res = nums[0];
        dp[0] = nums[0];

        for(int i=1;i<len;++i){
            if(dp[i-1]>0){
                dp[i] = dp[i-1]+nums[i];
            }else{
                dp[i] = nums[i];
            }
            res = Math.max(res,dp[i]);
        }

        return res;
    }
}
