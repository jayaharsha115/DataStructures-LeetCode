class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int sum1=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    int closestSum = Math.abs(sum-target);
                    if(closestSum<min){
                        min=closestSum;
                        sum1=sum;
                    }
                }
            }
        }
        return sum1;
    }
}