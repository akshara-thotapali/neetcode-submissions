class Solution {
    public boolean checkBit(int n,int i)
    {
        if(((n>>i)&1)==1)
        {
            return true;
        }
        return false;
    }
    public int reverseBits(int n) {
        int ans=0;
        for(int i=31;i>=0;i--)
        {
            if(checkBit(n,i))
            {
                ans+=(1<<(31-i));
            }
        }
        return ans;
    }
}
