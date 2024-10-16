public class Solution {
    public static boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", ""); // Fixed this line
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) { // Corrected charAT to charAt
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test the isPalindrome function
        String testStr = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(testStr)); // Expected output: true
    }
}
