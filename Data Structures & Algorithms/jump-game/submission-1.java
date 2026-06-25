class Solution {
  public boolean function(int[] nums,int i)
  {
    if(i>=nums.length-1)
    {
      return true;
    }
    if(nums[i]==0)
    {
      return false;
    }
    int temp=1;
    while(temp<=nums[i])
    {
      if(function(nums,i+temp))
      {
        return true;
      }
      temp++;
    }
    return false;
  }
    public boolean canJump(int[] nums) {
      
       return function(nums,0);
    }
}
