class PrefixTree {
     PrefixTree[] child;
     boolean flag;
    public PrefixTree() {
       child=new PrefixTree[26]; 
       flag=false;
    }

    public void insert(String word) {
         PrefixTree temp=this;
        for(int i=0;i<word.length();i++)
        {
            int c=word.charAt(i)-'a';
            if(temp.child[c]==null)
            {
                temp.child[c]=new PrefixTree();
            }
            temp=temp.child[c];
        }
        temp.flag=true;
    }

    public boolean search(String word) {
        int i;
        PrefixTree temp=this;
        for(i=0;i<word.length();i++)
        {
            int c=word.charAt(i)-'a';
            if(temp.child[c]==null)
            {
                return false;
            }
            temp=temp.child[c];
        }
        if(temp.flag)
        {
            return true;
        }
        return false;
    }

    public boolean startsWith(String prefix) {
       int i;
        PrefixTree temp=this;
        for(i=0;i<prefix.length();i++)
        {
            int c=prefix.charAt(i)-'a';
            if(temp.child[c]==null)
            {
                return false;
            }
            temp=temp.child[c];
        }
        return true;
    }
}
