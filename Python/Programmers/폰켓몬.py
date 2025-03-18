def solution(nums):
    unique = len(set(nums))
    max = len(nums) // 2
    return min(unique, max)