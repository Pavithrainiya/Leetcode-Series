import java.util.Arrays;

public class Solution { // Change the class name to 'Solution'
    // Function to merge nums2 into nums1
    public void merge(int[] nums1, int m, int[] nums2, int n) { // Also update the method name to 'merge'
        // Pointers for nums1, nums2, and the merged array
        int i = m - 1; // Pointer for the last element in the initialized part of nums1
        int j = n - 1; // Pointer for the last element in nums2
        int k = m + n - 1; // Pointer for the last element in nums1 (full length)

        // Merge nums1 and nums2 starting from the end
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        // Test arrays (for local testing; not part of the LeetCode submission)
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // nums1 with extra space for nums2
        int[] nums2 = {2, 5, 6}; // nums2
        int m = 3; // Number of initialized elements in nums1
        int n = 3; // Number of elements in nums2

        // Create an instance of the class and call the method
        Solution solution = new Solution(); // Update this to use 'Solution'
        solution.merge(nums1, m, nums2, n); // Update this to use 'merge'

        // Print result (for local testing; not part of the LeetCode submission)
        System.out.println(Arrays.toString(nums1)); // Output the merged array
    }
}
