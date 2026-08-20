class Solution {
    public int maxArea(int[] height) {
        int a=0;
        int b=height.length-1;
        int res=0;
        while(a<b){
            int i=Math.min(height[a],height[b]);
            int j=b-a;
            int whole=i*j;
            res=Math.max(whole,res);
            if(height[a]<height[b]){
                a++;
            }else{
                b--;
            }
        
        }return res;
    }
}