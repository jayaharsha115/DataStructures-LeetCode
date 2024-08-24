class Solution {
    public void generate(int n,List<String> result,int open,int close,String s){
        if(s.length()==(2*n)){
            result.add(s);
            return;
            
        }
        
        if(open<n){
            generate(n,result,open+1,close,s+"(");
        }
        if(close<open){
            generate(n,result,open,close+1,s+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n,result,0,0,"");
        return result;
        
    }
}