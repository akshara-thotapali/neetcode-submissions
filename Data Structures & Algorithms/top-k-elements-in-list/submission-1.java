class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        ArrayList<Integer> list=new ArrayList<>(map.keySet());
        list.sort((a,b)-> map.get(b)-map.get(a));
        int[] res=new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}
