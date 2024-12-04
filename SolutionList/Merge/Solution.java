package SolutionList.Merge;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int sum = m+n;
        while(n>0){
            if(m>0&&nums1[m-1]>nums2[n-1]){
                nums1[--sum] = nums1[--m];
            }else{
                nums1[--sum] = nums2[--n];
            }
        }
    }
}
