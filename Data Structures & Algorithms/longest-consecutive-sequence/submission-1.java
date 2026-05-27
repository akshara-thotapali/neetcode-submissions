class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       int count=0;
       for(int i=0;i<nums.length;i++)
       {
            set.add(nums[i]);
       }
       for(int i:set)
       {
            if(!set.contains(i-1))
            {
               int maxi=1;
               int curr=i+1;
                while(set.contains(curr))
                {
                    maxi++;
                    curr++;
                }
            count=Math.max(count,maxi);
            }
       } 
       return count;
    }
}
