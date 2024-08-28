class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            minHeap.add(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] result=new int[k];
        int index=0;
        for(int i=0;i<k;i++){
            result[index++]=minHeap.poll().getKey();
        }
        return result;
    }
}