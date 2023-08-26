// blog: https://velog.io/@eello/LeetCode-169.-Majority-Element
class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
            }
            
            if (majority == nums[i]) {
                count += 1;
            } else {
                count -= 1;
            }
        }

        return majority;
    }
}