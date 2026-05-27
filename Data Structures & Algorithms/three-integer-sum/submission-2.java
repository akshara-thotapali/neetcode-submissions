class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> res=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int target=-(nums[i]);
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
               if(nums[j]+nums[k]==target)
               {
                     ArrayList<Integer> temp=new ArrayList<>();
                     temp.add(nums[i]);
                     temp.add(nums[j]);
                     temp.add(nums[k]);
                    res.add(temp);
                    j++;
                    k--;
               } 
               else if(nums[j]+nums[k]<target)
               {
                j++;
               }
               else{
                k--;
               }
            }
        }
        List<List<Integer>> list=new ArrayList<>(res);
        return list;
    }
}
