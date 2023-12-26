class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public static int binarySearch(int[] array, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (array[mid] == target) {
            return mid;
        }
        if (array[mid] < target) {
            return binarySearch(array, mid + 1, end, target);
        }
        if (array[mid] > target) {
            return binarySearch(array, start, mid - 1, target);
        }
        return -1;
    }
}