class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        int n=nums.size();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sum=nums.get(i)+nums.get(j);
                if(sum<target){
                    count++;
                }
            }
        }
        return count;
    }
}