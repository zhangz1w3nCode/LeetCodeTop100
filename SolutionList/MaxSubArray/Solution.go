package main

import (
	"fmt"
)

func maxSubArray(nums []int) int {
	res := nums[0]
	pre := 0

	for _, num := range nums {
		pre = max(pre+num, num)
		res = max(res, pre)
	}

	return res
}

func maxSubArray2(nums []int) int {
	res := nums[0]
	dp := make([]int, len(nums))
	dp[0] = nums[0]

	for i := 1; i < len(nums); i++ {
		if dp[i-1] > 0 {
			dp[i] = dp[i-1] + nums[i]
		} else {
			dp[i] = nums[i]
		}
		res = max(res, dp[i])
	}

	return res
}

func main() {
	nums := []int{-1, 0, 1, 2, -1, -4}
	fmt.Println(maxSubArray2(nums))
}
