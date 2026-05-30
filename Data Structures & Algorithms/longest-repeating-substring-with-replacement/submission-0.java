class Solution {
    public int characterReplacement(String s, int k) {
       int[] freq=new int[26];
       int p1=0;
       int p2=0;
       int maxfreq=0;
       int len=0;
       while(p2<s.length())
       {
          char c=s.charAt(p2);
          freq[c-'A']++;
          maxfreq=Math.max(maxfreq,freq[c-'A']);
          while((p2-p1+1)-maxfreq>k)
          {
            freq[s.charAt(p1)-'A']--;
            p1++;
          }
            len=Math.max(len,p2-p1+1);
            p2++;
       }
       return len;
    }
}
