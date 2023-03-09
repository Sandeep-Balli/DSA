class Main {

    public static int maxSubaraySum(int arr[]) {
        int currSum = 0;
        int maxSum = arr[0];

        for (int idx = 0; idx < arr.length; idx++) {
            currSum += arr[idx];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;

    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("The maxium subarray sum is: " + maxSubaraySum(arr));
    }
}