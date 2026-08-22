class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int m=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                i=j+1;
            }
            m=Math.max(m,j-i+1);
          
        }return m;
        
    }
}