class Solution {
    // Method to remove duplicates from a sorted array
    public static int removeDuplicates(int[] nums) {
        int count = 0; // Initialize a count for unique elements

        for (int i = 0; i < nums.length; i++) {
            // Check if the current element is not a duplicate
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[count] = nums[i]; // Place the unique element at the next position
                count++; // Increment the count of unique elements
            }
        }
        return count; // Return the count of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2}; // Example input array
        int newLength = removeDuplicates(nums); // Call the removeDuplicates method

        // Print the results
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " "); // Print the modified array
        }
    }
}
