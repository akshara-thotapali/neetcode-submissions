class Node{
    Node[] child;
    boolean flag;
    Node(){
        child=new Node[26];
        flag=false;
    }
}
class Solution {
    public void insert(Node root,String word)
    {
        Node temp=root;
        for(int i=0;i<word.length();i++)
        {
            int c=word.charAt(i)-'a';
            if(temp.child[c]==null)
            {
                temp.child[c]=new Node();
            }
            temp=temp.child[c];
        }
        temp.flag=true;
    }
    public boolean search(String st,Node root,int index,Boolean[] dp )
    {
        if(index==st.length())
        {
            return true;
        }
        if(dp[index]!=null)
        {
            return dp[index];
        }
        Node temp=root;
        for(int i=index;i<st.length();i++)
        {
            int c=st.charAt(i)-'a';
            if(temp.child[c]==null)
            {
                dp[index]=false;
                return false;
            }
            temp=temp.child[c];
            if(temp.flag)
            {
                if(search(st,root,i+1,dp))
                {
                    dp[index]=true;
                    return true;
                }
            }
        }
        dp[index]=false;
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Node root=new Node();
        for(int i=0;i<wordDict.size();i++)
        {
            insert(root,wordDict.get(i));
        }
        Boolean[] dp=new Boolean[s.length()];
        if(search(s,root,0,dp))
        {
            return true;
        }
        return false;
    }
}
