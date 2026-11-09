class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:
      windowSum = sum(nums[:k])

      maxSum = windowSum

      for i in range(k, len(nums)):

            windowSum += nums[i] - nums[i - k]

            maxSum = max(maxSum, windowSum)
      return maxSum / k   