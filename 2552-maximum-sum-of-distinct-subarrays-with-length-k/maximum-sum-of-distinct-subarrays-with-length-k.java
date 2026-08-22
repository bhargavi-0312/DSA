import java.util.*;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
    HashSet<Integer> s=new HashSet<>();
    long sum=0;
    long max=0;
    int i=0;
    for(int j=0;j<nums.length;j++){
        while(s.contains(nums[j])){
            s.remove(nums[i]);
            sum-=nums[i];
            i++;
        }
        s.add(nums[j]);
        sum+=nums[j];
        if(j-i+1==k){
            max=Math.max(max,sum);
            s.remove(nums[i]);
            sum-=nums[i];
            i++;
        }
    }return max;
    }
}