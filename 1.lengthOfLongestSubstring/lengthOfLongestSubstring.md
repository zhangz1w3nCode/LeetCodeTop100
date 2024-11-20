### 📌lengthOfLongestSubstring
```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0) return 0;
        int len = s.length();
        int[] markArray = new int[128];

        int l=0;
        int r=0;
        int res=0;

        while(r<len){
            markArray[s.charAt(r)]++;
            while(markArray[s.charAt(r)]>1){
                markArray[s.charAt(l)]--;
                ++l;
            }
            int curLen = r-l+1;
            res=Math.max(res,curLen);
            ++r;
        }

        return res;
    }
}
```