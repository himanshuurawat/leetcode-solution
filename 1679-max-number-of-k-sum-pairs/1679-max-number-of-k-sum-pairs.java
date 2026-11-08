class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        int count = 0;

        while (left < right) {

            int total = nums[left] + nums[right];

            if (total == k) {
                count++;
                left++;
                right--;
            }

            else if (total < k) {
                left++;
            }

            else {
                right--;
            }
        }

        return count;  
    }
}