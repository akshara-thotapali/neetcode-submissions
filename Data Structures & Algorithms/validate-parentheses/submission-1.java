class Solution {
    public char closeFind(char top)
    {
        if(top=='(')
        {
            return ')';
        }
        else if(top=='[')
        {
            return ']';
        }
        return '}';
    }
    public boolean isValid(String s) {
       Stack<Character> st=new Stack<>();
       int n=s.length();
       for(int i=0;i<n;i++)
       {
        char c=s.charAt(i);
            if(c=='{' || c=='[' || c=='(')
            {
                st.push(c);
            }
            else {
                if(st.isEmpty())
                {
                    return false;
                }
                char ch=closeFind(st.peek());
                if(c==ch)
                {
                    st.pop();
                }
                else{
                    return false;
                }
            }
       } 
       if(st.isEmpty()){
        return true;
       }
       return false;
    }
}
