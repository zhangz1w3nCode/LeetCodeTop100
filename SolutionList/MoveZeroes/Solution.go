package main

func moveZeroes(nums []int) {
	l := 0
	r := 0
	for r < len(nums) {
		if nums[r] != 0 {
			swap(nums, l, r)
			l++
		}
		r++
	}
}
func swap(nums []int, l int, r int) {
	temp := nums[l]
	nums[l] = nums[r]
	nums[r] = temp
}
