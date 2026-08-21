import java.util.Arrays; 

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];

                if (currSum == target) {
                    return target;
                }

                if (Math.abs(currSum - target) < Math.abs(closest - target)) {
                    closest = currSum;
                }

                if (currSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closest;
    }
}
