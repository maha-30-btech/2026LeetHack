import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int res = 0;
        boolean found=false;
        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                i++;
            } else {
                res = nums[i];
                found=true;
                break;
            }
        }
        if(!found){
            res=nums[n-1];
        }
        return res;
    }
}
