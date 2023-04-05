public class binarySearchAlgo {
    public static int search(int[] nums, int target) {
        // Initialize variables for beginning, end, and middle indices
        int beg = 0;
        int end = nums.length - 1;
        int mid = nums.length / 2;

        // Continue searching until search range is exhausted
        while (beg <= end) {
            // Check if target value is at middle index
            if (nums[mid] == target) {
                // If so, return index of target value
                return mid;
            } else if (nums[mid] < target) {
                // If target value is greater than middle value, restrict search range to upper half
                beg = mid + 1;
            } else if (nums[mid] > target) {
                // If target value is less than middle value, restrict search range to lower half
                end = mid - 1;
            }

            // Update middle index for new search range
            mid = (beg + end) / 2;
        }

        // If target value was not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Create array of sample values
        int[] numsArray = new int[]{1, 3, 5, 7, 9, 11, 13};

        // Search for two different target values and print result
        System.out.println(search(numsArray, 1));
        System.out.println(search(numsArray, 100));
    }
}
