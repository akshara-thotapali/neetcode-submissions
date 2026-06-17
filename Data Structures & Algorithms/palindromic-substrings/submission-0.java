class Solution {
    public int countSubstrings(String s) {
       int count=0;
       int n=s.length(); 
       for(int i=0;i<n-1;i++)
       {
        int k=i;
        int j=i+1;
        while(k>=0 && j<n && s.charAt(j)==s.charAt(k))
        {
            count++;
            k--;
            j++;
        }
       }
       for(int i=1;i<n-1;i++)
       {
        int j=i-1;
        int k=i+1;
        while(j>=0 && k<n && s.charAt(j)==s.charAt(k))
        {
            count++;
            j--;
            k++;
        }
       }
       return count+n;
    }
}
