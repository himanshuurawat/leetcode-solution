class Solution:
    def sortedSquares(self, nums: list[int]) -> list[int]:
        n= len(nums)
        result = [0]*n
        left=0
        right=n-1
        for pos in range(n-1,-1,-1):
            if abs(nums[left])>abs(nums[right]):
                result[pos]=nums[left]*nums[left]
                left+=1
            else:
                result[pos]=nums[right]*nums[right]
                right-=1
        return result
        