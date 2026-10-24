class Solution {
    public int trap(int[] height) {
        int s = height.length;
        int left[] = new int[s];
        int right[] = new int[s];
        left[0]=height[0];
        right[s-1]=height[s-1];
        int l=height[0];
        int r=height[s-1];
        int max =0;
        for (int i=1,j=s-2;i<s;i++,j--)
        {
            if(l<height[i])
            {
                l=height[i];
                left[i]=l;
            }
            if(r<height[j])
            {
                r=height[j];
                right[j]=r;
            }
            left[i]=l;    
            right[j]=r;
        }

        for(int i=0;i<s;i++)
        {
            max = max+Math.min(left[i],right[i])-height[i];
        }
    return max;
    }
}
