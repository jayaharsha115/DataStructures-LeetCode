class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currResult = new ArrayList<>();
        constructSubSet(nums, 0, currResult, result);

        return result;
    }

    private void constructSubSet(int[] nums, int index, List<Integer> currResult, List<List<Integer>> result) {
    
        if (index == nums.length) {
            result.add(new ArrayList<>(currResult));
            return;
        }

        currResult.add(nums[index]);
        constructSubSet(nums, index+1, currResult, result);
        currResult.remove(currResult.size() - 1);
        constructSubSet(nums, index + 1, currResult, result);
    }
}