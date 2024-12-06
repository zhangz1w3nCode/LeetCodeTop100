package SolutionList.Sort;

class Solution {
    /*
    基本思想：选择一个基准值
    通过一趟排序将要排序的数据分割成独立的两部分
    其中一部分的所有数据都比另一部分的所有数据要小
    然后再按此方法对这两部分数据分别进行快速排序
    整个排序过程可以递归进行，以此达到整个数据变成有序序列
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
}
