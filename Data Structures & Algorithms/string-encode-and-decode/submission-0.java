class Solution {

    public String encode(List<String> strs) {
        String result = null;
        StringBuilder sb = new StringBuilder();
        for(String s:strs)
        {
            int l = s.length();
            sb.append(l);
            sb.append("#");
            sb.append(s);
        }
        result = sb.toString();
        return result;
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            // Find the separator after the length
            while (s.charAt(j) != '#') {
                j++;
            }

            // Parse the length of the next string
            int length = Integer.parseInt(s.substring(i, j));

            // Read exactly 'length' characters
            int start = j + 1;
            int end = start + length;

            result.add(s.substring(start, end));

            // Move to the beginning of the next encoded string
            i = end;
        }

        return result;
    }
}
