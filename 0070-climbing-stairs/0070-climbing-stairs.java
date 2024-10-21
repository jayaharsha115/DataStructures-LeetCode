class Solution {
    int f(int n,ArrayList<Integer> dp)
    {
        if(n==0) return 1;
        if(n==1) return 1;
        if(dp.get(n)!=-1) return dp.get(n);
        dp.set(n,f(n-1,dp)+f(n-2,dp));
        return dp.get(n);
    }
    public int climbStairs(int n) {
        ArrayList<Integer> dp=new ArrayList<>();
        for(int i=0;i<=n;i++){
            dp.add(-1);
        }
        return f(n,dp);
    }
}