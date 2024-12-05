package SolutionList.MajorityElement;

class Solution {
    public int majorityElement(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        int res=nums[0];
        int cnt=1;

        for(int i=1;i<nums.length;++i){

            if(res==nums[i]){
                cnt++;
            }else{
                --cnt;
                if(cnt==0){
                    res=nums[i];
                    cnt=1;
                }
            }

        }
        
        return res;
    }
}