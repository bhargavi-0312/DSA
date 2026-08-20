class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int target=0;
        for(int a=0;a<nums.length;a++){
            if(a!=0 && nums[a]==nums[a-1]){
                continue;
            }int b=a+1;
            int c=nums.length-1;
            while(b<c){
                int sum=nums[a]+nums[b]+nums[c];
                if(sum==target){
                    List<Integer> t=new ArrayList<>();
                    t.add(nums[a]);
                    t.add(nums[b]);
                    t.add(nums[c]);
                    ans.add(t);
                    b++;
                    c--;
                while(b<c && nums[b]==nums[b-1]){
                    b++;
                }while(b<c && nums[c]==nums[c+1]){
                    c--;
                }
            }else if(sum<target){
                b++;
            }else{
                c--;
            }
            }
        }
        return ans;
    }
}