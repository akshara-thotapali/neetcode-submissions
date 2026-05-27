class Solution {
    public int[] productExceptSelf(int[] nums) {
      int product=1;
      int n=nums.length;
      int count=0;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==0)
        {
            count++;
        }else{
        product=product*nums[i];
        }
      }  
      int[] res=new int[n];
      for(int i=0;i<nums.length;i++)
      {
        if(count==0){
        res[i]=product/nums[i];
        }else if(count==1)
        {
            if(nums[i]==0)
            {
                res[i]=product;
            }
            else{
                res[i]=0;
            }
        }
        else{
            res[i]=0;
        }
      }
      return res;
    }
}  
