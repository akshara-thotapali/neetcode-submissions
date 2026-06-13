class WordDictionary {
    WordDictionary[] child;
    boolean flag;
    public WordDictionary() {
        child=new WordDictionary[26];
        flag=false;
    }

    public void addWord(String word) {
        WordDictionary temp=this;
        for(int i=0;i<word.length();i++)
        {
            int c=word.charAt(i)-'a';
            if(temp.child[c]==null)
            {
                temp.child[c]=new WordDictionary();
            }
            temp=temp.child[c];
        }
        temp.flag=true;
    }
   public boolean checkString(WordDictionary temp,String word,int i)
   {
    if(i==word.length())
    {
        return temp.flag;
    }
     char c=word.charAt(i);
     if(c=='.')
     {
        for(int j=0;j<26;j++)
        {
          if(temp.child[j]!=null)
          {
            if(checkString(temp.child[j],word,i+1))
            {
                return true;
            }
          }
        }
     }
     else{
        if(temp.child[c-'a']==null)
        {
            return false;
        }
        else{
            if(checkString(temp.child[c-'a'],word,i+1))
            {
                return true;
            }
        }
     } 
     return false; 
   }
    public boolean search(String word) {
        WordDictionary temp=this;
        // int i=0;
        //     int c=word.charAt(0)-'a';
        //     if(temp.child[c]!=null)
        //     {
        //         temp=temp.child[c];
        //         while(i<word.length())
        //         {
        //             int c=word.charAt(i)-'a';
        //             if(temp.child[c]==null)
        //             {
        //                 break;
        //             }
        //             temp=temp.child[c];
        //             i++;
        //         }
        //     }
        //     if(i==word.length())
        //     {
        //         return true;
        //     }
        //     temp=this;
        //     if(i<word.length()){
              if(checkString(temp,word,0))
              {
                return true;
              }
            return false;
    }
}
