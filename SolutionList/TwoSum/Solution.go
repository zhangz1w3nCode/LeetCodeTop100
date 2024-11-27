package main

func twoSum(nums []int, target int) []int {
	cache := make(map[int]int)
	for i, num := range nums {
		if j, ok := cache[target-num]; ok {
			return []int{j, i}
		}
		cache[nums[i]] = i
	}
	return nil
}
