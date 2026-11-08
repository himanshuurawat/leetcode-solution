class Solution {
public:
    int maxOperations(vector<int>& nums, int k) {
       sort(nums.begin(), nums.end());

        int left = 0;
        int right = nums.size() - 1;

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
};