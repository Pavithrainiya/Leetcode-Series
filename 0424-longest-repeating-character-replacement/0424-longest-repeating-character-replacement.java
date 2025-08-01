class Solution {
    public int characterReplacement(String s, int k) {
        int[] occurance = new int[26];
        int left = 0, answer = 0, maxOcc = 0;

        for (int right = 0; right < s.length(); right++) {
            maxOcc = Math.max(maxOcc, ++occurance[s.charAt(right) - 'A']);
            
            if (right - left + 1 - maxOcc > k) {
                occurance[s.charAt(left) - 'A']--;
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}
