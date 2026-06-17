class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
       int[] op1=new int[n+1];
       int[] op2=new int[n+1];
       op1[0]=0;
       op1[1]=nums[0];
       op2[0]=0;
       op2[1]=0; 
       for(int i=2;i<=n-1;i++)
       {
            op1[i]=Math.max(op1[i-1],nums[i-1]+op1[i-2]);
       }
       op1[n]=op1[n-1];
       for(int i=2;i<=n;i++)
       {
            op2[i]=Math.max(op2[i-1],nums[i-1]+op2[i-2]);
       }
       return Math.max(op1[n],op2[n]);
    }
}
