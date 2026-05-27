class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
            {
                sb.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c))
            {
                sb.append(c);
            }
            else if(Character.isDigit(c))
            {
                sb.append(c);
            }
        }
        int n=sb.length();
        for(int i=0;i<n/2;i++)
        {
            char st=sb.charAt(i);
            char end=sb.charAt(n-i-1);
            if(st!=end)
            {
                return false;
            }
        }
        return true;
    }
}
