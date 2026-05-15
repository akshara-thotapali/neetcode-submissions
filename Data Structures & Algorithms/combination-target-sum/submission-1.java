class Solution {
    public void checksum(int[] nums,int index,HashSet<ArrayList<Integer>> set,int target,int sum,ArrayList<Integer> temp)
    {
         if(index==nums.length || sum>target)
        {
            return;
        }
        if(sum==target)
        {
            set.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            if(nums[i]>target)
            {
                return;
            }
            temp.add(nums[i]);
            checksum(nums,i,set,target,sum+nums[i],temp);
            temp.remove(temp.size()-1);
        }  
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
       HashSet<ArrayList<Integer>> set=new HashSet<>();
       ArrayList<Integer> temp=new ArrayList<>();
       checksum(nums,0,set,target,0,temp);
       List<List<Integer>> list=new ArrayList<>();
       for(ArrayList<Integer> l:set)
       {
        list.add(l);
       }
       return list;
    }
}
