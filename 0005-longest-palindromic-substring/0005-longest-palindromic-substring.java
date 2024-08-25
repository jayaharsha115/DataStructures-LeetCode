class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        int len=0;
        for(int i=0;i<s.length();i++){
            int len1 = palindrome(s,i,i);
            int len2 = palindrome(s,i,i+1);
            
            len = Math.max(len1,len2);
            if(len>end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int palindrome(String s , int start , int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        return end-start-1;
    }
}