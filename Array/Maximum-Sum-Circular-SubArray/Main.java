public class Main {
    public static int maxSubarraySumCircular(int[] nums) {
        int maxNormal = normalMaxSubArray(nums);
        if (maxNormal < 0) {
            return maxNormal;
        }
        int arrSum = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            arrSum += nums[idx];
            nums[idx] = -nums[idx];
        }
        int maxCircularSubArray = arrSum + normalMaxSubArray(nums);
        return Math.max(maxCircularSubArray, maxNormal);
    }

    public static int normalMaxSubArray(int nums[]) {
        int currSum = 0;
        int maxSum = nums[0];
        for (int idx = 0; idx < nums.length; idx++) {
            currSum += nums[idx];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = { 8, -4, 3, -5, 4 };
        System.out.println("The maximum circular subarray sum is: " + maxSubarraySumCircular(nums));
    }
}
