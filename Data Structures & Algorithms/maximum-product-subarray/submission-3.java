class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            int product=1;
            for(int j=i;j<n;j++)
            {
              product*=nums[j]; 
              res=Math.max(res,product);
            }
        }
        return res;
    }
}
