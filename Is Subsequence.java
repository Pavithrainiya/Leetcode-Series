class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        // Traverse both strings using two pointers
        while (i < s.length() && j < t.length()) {
            // If characters match, move the pointer in 's'
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always move the pointer in 't'
            j++;
        }

        // If 'i' has reached the end of 's', all characters of 's' were found in 't' in order
        return i == s.length();
    }
}
