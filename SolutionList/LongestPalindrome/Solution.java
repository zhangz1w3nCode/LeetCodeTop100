package SolutionList.LongestPalindrome;

class Solution {
    String res ="";
    public String longestPalindrome(String s) {
        if(s.length()==0) return res;

        for(int i=0;i<s.length();++i){
            handle(s,i,i);
            handle(s,i,i+1);
        }

        return res;
    }

    public void handle(String s,int i,int j){
        int len = s.length();

        while(i>=0&&j<=len-1&&s.charAt(i)==s.charAt(j)){
            String currStr = s.substring(i,j+1);
            if(currStr.length()>res.length()){
                res = currStr;
            }
            --i;
            ++j;
        }
    }


    public String longestPalindrome2(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;
    }
}
