class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        int[] max=new int[n];
        int[] min=new int[n];
        max[0]=nums[0];
        min[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            int curr=nums[i];
            int option1=max[i-1]*curr;
            int option2=min[i-1]*curr;
            max[i]=Math.max(curr,Math.max(option1,option2));
            min[i]=Math.min(curr,Math.min(option1,option2));
            res=Math.max(res,max[i]);
        }
        return res;
    }
}
