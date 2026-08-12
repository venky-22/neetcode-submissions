class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        int[] charIndex = new int[128];
        int left = 0;
        for(int right=0; right<n; right++){
            char currentChar = s.charAt(right);

            left = Math.max(left, charIndex[currentChar]);

            maxLen = Math.max(maxLen, right-left+1);

            charIndex[currentChar] = right+1;
        }

        return maxLen;
    }
}
