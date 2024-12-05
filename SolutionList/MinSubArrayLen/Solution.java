package SolutionList.MinSubArrayLen;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int l=0;
        int r=0;
        int sum=0;
        int res=Integer.MAX_VALUE;

        while(r<len){
            sum+=nums[r];
            while (sum>=target) {
                sum -= nums[l];
                int curLen = r - l + 1;
                res = Math.min(res, curLen);
                ++l;
            }
            ++r;
        }

        return res==Integer.MAX_VALUE?0:res;
    }
}
