class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> op = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first numbers
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {

                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);

                    op.add(triplet);

                    j++;
                    k--;

                    // Skip duplicate second numbers
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate third numbers
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }

                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return op;
    }
}