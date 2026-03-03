import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left=0;
        int maxLen = 0;
        HashSet<Character> set=new HashSet<>();

        for(int r=0;r<n;r++){
            while (set.contains(s.charAt(r))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(r));
            maxLen=Math.max(maxLen,r-left+1);
        }
        return maxLen;
        
    }
}