class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        for(int i=0,j=numbers.length-1;i<j;)
        {
            int sum = numbers[i] + numbers [j];
            if(sum == target)
            {
                arr[0] = i+1;
                arr[1] = j+1; 
            }
            if(target<sum)
            {
                j--;
            }
            else
                i++;
        }
    return arr;
    }
}
