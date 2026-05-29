class Solution {
    public int lengthOfLongestSubstring(String s) {
       int p1=0;
       int p2=0;
        HashSet<Character> set=new HashSet<>();
        int len=0;
        int n=s.length();
        while(p2<n)
        {
            char c=s.charAt(p2);
                while(set.contains(c))
                {
                    set.remove(s.charAt(p1));
                    p1++;
                }
                set.add(c);
            len=Math.max(len,p2-p1+1);
            p2++;
        }
        return len;
    }
}
