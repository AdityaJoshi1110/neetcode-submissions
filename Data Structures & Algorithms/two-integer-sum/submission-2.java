
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int[] diff = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            diff[i] = target - nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] == diff[i]) {
                    arr[0] = Math.min(i, j);
                    arr[1] = Math.max(i, j);
                    return arr;
                }
            }
        }

        return arr;
    }
}
