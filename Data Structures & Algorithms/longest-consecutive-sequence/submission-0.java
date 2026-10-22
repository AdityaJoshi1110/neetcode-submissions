class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // Step 1: Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Find the beginning of each sequence
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                // Step 3: Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                // Step 4: Update maximum length
                longest = Math.max(longest, count);
            }
        }

        return longest;

    
    }
}
