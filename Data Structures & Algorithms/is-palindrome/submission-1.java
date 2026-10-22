class Solution {
    public boolean isPalindrome(String s) {
        String lc = s.toLowerCase();
        String lowerCaseMessage = lc.replaceAll("[^a-zA-Z0-9]",""); 
        char[] arr = lowerCaseMessage.toCharArray();
        for(int i=0,j=arr.length-1;i<j;i++,j--)
        {
            if(arr[i]!=arr[j])
                return false;
        }
        return true;

    }
}
