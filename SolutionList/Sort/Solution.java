package SolutionList.Sort;

import java.util.Arrays;

class Solution {
    /*
     快速排序
        基本思想
        ·选择一个基准值
        ·通过一趟排序 将要排序的数据 分割成独立的两部分
        ·其中一部分的所有数据都比另一部分的所有数据要小
        ·然后再按此方法对这两部分数据分别进行快速排序
        ·整个排序过程可以递归进行 以此达到整个数据变成有序序列
     */
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        quickSort(nums, 0, len - 1);
        return nums;
    }
    public void quickSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int point = findPoint(nums, l, r);
        quickSort(nums, l, point);
        quickSort(nums, point + 1, r);
    }
    public int findPoint(int[] nums, int l, int r) {
        int temp = nums[l];
        while (l < r) {
            while (l < r && nums[r] >= temp) --r;
            nums[l] = nums[r];
            while (l < r && nums[l] <= temp) ++l;
            nums[r] = nums[l];
        }
        nums[l] = temp;
        return l;
    }
    /*
      堆排序
     */
    public int[] sortArray2(int[] nums) {
        heapSort(nums);
        return nums;
    }
    public void heapSort(int[] nums) {
        int len = nums.length-1;
        makeHeap(nums,len);
        for(int i=len;i>=1;--i){
            swap(nums,i,0);
            --len;
            remakeHeap(nums,len,0);
        }
    }
    public void makeHeap(int[] nums,int len) {
        for(int i=len/2;i>=0;--i){
            remakeHeap(nums,len,i);
        }
    }
    public void remakeHeap(int[] nums,int len,int i) {
        for(;(i<<1)+1<=len;){
            int l=(i<<1)+1;
            int r=(i<<1)+2;
            int big;

            if (l<=len&&nums[l]>=nums[i]){
                big = l;
            }else{
                big = i;
            }

            if(r<=len&&nums[r]>=nums[big]){
                big = r;
            }

            if(big!=i){
                swap(nums,big,i);
                i = big;
            }else{
                break;
            }
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
