package SolutionList.MoveZeroes;


class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int l =0;
        int r =0;

        while(r<len){
            if(nums[r]!=0){
                swap(nums,l,r);
                ++l;
            }
            ++r;
        }
    }

    public void swap(int[]nums,int l, int r){
        int t = nums[l];
        nums[l]=nums[r];
        nums[r]=t;
    }
}
