class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums,k)-atMostK(nums,k-1);
    }
    int atMostK(int[] nums,int k){
        int i=0,res=0;
        Map<Integer,Integer> c=new HashMap<>();
        for(int j=0;j<nums.length;++j){
            if(c.getOrDefault(nums[j],0)==0)k--;
            c.put(nums[j],c.getOrDefault(nums[j],0)+1);
            while(k<0){
                c.put(nums[i],c.get(nums[i])-1);
                if(c.get(nums[i])==0)k++;
                i++;
            }res+=j-i+1;
        }return res;
    }
}