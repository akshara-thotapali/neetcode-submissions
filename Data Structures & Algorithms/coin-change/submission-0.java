class Solution {
    public int res;
    public void backtrack(int[] coins,int target,int index,int sum,int count)
    {
        if(sum==target)
        {
            if(count<res){
            res=count;
            }
            return;
        }
        if(sum>target || index==coins.length)
        {
            return;
        }
           backtrack(coins,target,index,sum+coins[index],count+1);
           backtrack(coins,target,index+1,sum,count);
    }
    public int coinChange(int[] coins, int amount) {
       res=Integer.MAX_VALUE;
       backtrack(coins,amount,0,0,0);
       if(res==Integer.MAX_VALUE)
       {
        return -1;
       } 
       return res;
    }
}
