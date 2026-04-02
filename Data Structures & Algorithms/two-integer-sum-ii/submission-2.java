class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // +1 vì đề yêu cầu index bắt đầu từ 1
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[]{-1, -1}; // fallback (thường không cần vì đề đảm bảo có đáp án)
    }
}