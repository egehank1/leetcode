
class Solution {
    public int lengthOfLongestSubstring(String s) {
                if (s.length() == 0 || s.length() == 1)
            return s.length();

            boolean[] hasVisited = new boolean[128];
            int l = 0;
            int left = 0, right = 0;
            while(right < s.length()){
                if(hasVisited[s.charAt(right) - ' '] == false){
                    hasVisited[s.charAt(right) - ' '] = true;
                    right++;
                    l = Math.max(l, right - left);
                } else {
                hasVisited[s.charAt(left) - ' '] = false;
                left++;
            }
        }
            return l;
    }
}
