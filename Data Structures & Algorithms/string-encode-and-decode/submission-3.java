class Solution {
     public int k=2;
    public String encode(List<String> strs) {
       StringBuilder sb=new StringBuilder();
       for(String word:strs)
       {
          for(char c:word.toCharArray())
          {
            if(Character.isDigit(c))
            {
                char ch=(char)((c-'0'+k)%10+'0');
                sb.append(ch);
            }
            else if(Character.isLowerCase(c)){
            char ch=(char)((c-'a'+k) % 26 +'a');
            sb.append(ch);
            }else if(Character.isUpperCase(c))
            {
            char ch=(char)((c-'A'+k) % 26 +'A');
            sb.append(ch);  
            }
            else{
                sb.append(c);
            }
          }
          sb.append('-');
       }
       return sb.toString();
    }

    public List<String> decode(String str) {
        String[] words=str.split("-",-1);
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.length-1;i++)
        {
            String word=words[i];
            StringBuilder temp=new StringBuilder();
            for(char c:word.toCharArray())
            {
                if(Character.isDigit(c))
            {
                char ch=(char)((c-'0'-k +10)%10+'0');
                temp.append(ch);
            }
                else if(Character.isLowerCase(c)){
                char ch=(char)((c-'a'-k +26)%26 +'a');
                temp.append(ch);
                }else if(Character.isUpperCase(c)){
                char ch=(char)((c-'A'-k +26)%26 +'A');
                temp.append(ch);   
                }
                else{
                    temp.append(c);
                }
            }
            res.add(temp.toString());
        }
        return res;
    }
}
