class Solution {
    // Main method to test the majorityElement function
    public static void main(String[] args) {
        int num[] = {2, 2, 1, 1, 1, 2, 2}; // Input array
        Solution solution = new Solution(); // Create an instance of Solution
        System.out.println(solution.majorityElement(num)); // Call the method on the instance
    }

    // Method to find the majority element
    public int majorityElement(int[] nums) {
        int cand = 0; // Candidate for majority element
        int count = 0; // Counter for the candidate
        
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                cand = nums[i]; // Update candidate
            }
            if (cand == nums[i]) {
                count++; // Increment count if it's the candidate
            } else {
                count--; // Decrement count if it's not
            }
        }
        
        return cand; // Return the candidate as the majority element
    }
}
