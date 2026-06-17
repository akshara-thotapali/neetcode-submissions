class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<n;i++)
        {
            int curr=nums[i];
            int option1=max*curr;
            int option2=min*curr;
            max=Math.max(curr,Math.max(option1,option2));
            min=Math.min(curr,Math.min(option1,option2));
            res=Math.max(res,max);
        }
        return res;
    }
}
