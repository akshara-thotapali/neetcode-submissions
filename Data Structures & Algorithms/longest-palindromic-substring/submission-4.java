class Solution {
    public String longestPalindrome(String s) {
       int n=s.length();
       if(n==1)
       {
        return s;
       } 
       int even=0;
       String st="";
       for(int i=0;i<n-1;i++)
       {
        int j=i+1;
        int k=i;
        int count=0;
             while(k>=0 && j<n && s.charAt(k)==s.charAt(j))
             {
               count+=2;
               k--;
               j++;
             }
        if(count>even)
        {
            even=count;
            st=s.substring(k+1,j);
        }
       }
       int odd=0;
       String str=s.substring(0,1);
       for(int i=1;i<n-1;i++)
       {
        int j=i-1;
        int k=i+1;
        int count=1;
            while(j>=0 && k<n && s.charAt(j)==s.charAt(k))
            {
                count+=2;
                j--;
                k++;
            }
        if(count>odd)
        {
            odd=count;
            str=s.substring(j+1,k);  
        }
       }
       if(even>odd)
       {
        return st;
       }
       return str;
    }
}
