class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int frequency=-1;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(frequency==-1){
                frequency=entry.getValue();
            }
            else if(entry.getValue()!=frequency){
                return false;
            }
            
        }
        return true;
    }
}