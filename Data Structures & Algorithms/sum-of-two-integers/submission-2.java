class Solution {
    public int getSum(int a, int b) {
        int c=0;
        int ans=0;
       for(int i=0;i<32;i++)
       {
        int bita=((a>>i)&1);
        int bitb=((b>>i)&1);
         if(bita==1 && bitb==1)
         {
            if(c==1)
            {
                ans+=(1<<i);
            }
                c=1;
         }
         else if(bita==1 || bitb==1)
         {
            if(c==1)
            {
                c=1;
            }
            else{
                ans+=(1<<i);
                c=0;
            }
         }
         else
         {
            if(c==1)
            {
                ans+=(1<<(i));
                c=0;
            }
         }
       }
       return ans;
    }
}
