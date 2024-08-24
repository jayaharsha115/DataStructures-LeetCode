class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int water=0;
        while(left<right){
            int currentWater=Math.min(height[left],height[right])*(right-left);
            water=Math.max(water,currentWater);
            if(height[left]<height[right]) left++;
            else{
                right--;
            }
        }
        return water;
    }
}