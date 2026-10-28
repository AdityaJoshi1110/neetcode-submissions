class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length();
        int left = 0;
        int maxFreq =0;
        for (int right = 0;right<len;right++)
        {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));

        while ((right - left + 1) - maxFreq > k) {
            char leftChar = s.charAt(left);

            map.put(leftChar, map.get(leftChar) - 1);
            left++;
        }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
