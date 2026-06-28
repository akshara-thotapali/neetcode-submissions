class Solution {
    public int calculateBits(int i)
    {
        int count=0;
        while(i>0)
        {
            if((i&1)==1)
            {
                count++;
            }
            i=i>>1;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            res[i]=calculateBits(i);
        }
        return res;
    }
}
