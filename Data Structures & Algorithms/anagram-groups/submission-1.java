class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[] a = new int[26];
            String str = strs[i];

            for (int j = 0; j < str.length(); j++) {
                int temp = str.charAt(j) - 'a';
                a[temp]++;
            }

            String key = Arrays.toString(a);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
