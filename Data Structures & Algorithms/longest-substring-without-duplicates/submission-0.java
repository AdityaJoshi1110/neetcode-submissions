class Solution {
public int lengthOfLongestSubstring(String s) {
    int max = 0;
    int len = s.length();

    Set<Character> set = new HashSet<>();
    int left = 0;

    for (int right = 0; right < len; right++) {
        Character a = s.charAt(right);

        while (set.contains(a)) {
            set.remove(s.charAt(left));
            left++;
        }

        set.add(a);

        int cmax = right - left + 1;
        max = Math.max(max, cmax);
    }

    return max;
}
}