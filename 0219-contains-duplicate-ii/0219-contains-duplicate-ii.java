class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(result.containsKey(nums[i])){
                int j=result.get(nums[i]);
                if((i-j)<=k){
                    return true;
                }
                
            }
            result.put(nums[i],i);
        }
        return false;
    }
}