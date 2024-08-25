class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(true){
            int sum=0;
            int rem = 0;
            while(n>0){
                rem = n%10;
                sum = sum+ (rem * rem);
                n = n/10;
            }
            if (sum==1) return true;
            n=sum;
            if(seen.contains(n)){
                return false;
            }
            seen.add(n);
        }
    }
}