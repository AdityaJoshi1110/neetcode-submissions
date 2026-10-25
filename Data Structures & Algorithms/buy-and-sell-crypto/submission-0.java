class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int size = prices.length;
        int [] min = new int [size];
        min[size-1] = prices[size-1];
        for(int i=size-2;i>=0;i--)
        {
            if(min[i+1]>prices[i])
              min[i] = min[i+1];
            else
              min[i] = prices[i];
        }
        System.out.println(Arrays.toString(min));
        for(int i=0;i<size-1;i++)
        {
            int temp = min[i+1]-prices[i];
            if(profit < (temp))
               profit = temp;
        }

     return profit;
    }
}
