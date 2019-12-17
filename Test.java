给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。

具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
class Solution {
    public int countSubstrings(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=countSubstrings(s,i,i);
            sum+=countSubstrings(s,i,i+1);
        }
        return sum;
    } 
    private int countSubstrings(String s,int left,int right){
        int l=left;
        int r=right;
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        if(left==right){
            return (r-l)/2;
        }
        return (r-l-1)/2;
    }
}