class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxLen = 0;
        int left = 0;
        int maxCount = 0;

        for(int right=0; right<s.length(); right ++){
            int currIdx = s.charAt(right) - 'A';
            count[currIdx]++;

            maxCount = Math.max(maxCount, count[currIdx]);
            int windowSize = right-left+1;

            if(windowSize-maxCount>k){
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;
    }
}
