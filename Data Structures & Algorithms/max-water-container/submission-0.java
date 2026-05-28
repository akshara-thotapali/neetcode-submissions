class Solution {
    public int maxArea(int[] heights) {
        int p1=0;
        int p2=heights.length-1;
        int ans=0;
        while(p1<p2)
        {
           int mini=Math.min(heights[p1],heights[p2]);
           ans=Math.max(ans,(p2-p1)*mini);
            if(heights[p1]<heights[p2])
            {
                p1++;
            }
            else{
                p2--;
            }
        }
        return ans;
    }
}
