import java.util.*;

class Main {

    public static int longestSubarray(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            map.put(sum, i);
        }
        return maxLen;
    }

    public static int longestSubarrayOptimalSolution(int arr[], int k) {
        int sum = arr[0];
        int maxLen = 0;
        int left = 0;
        int right = 0;

        while (right < arr.length) {
            while (left <= right && sum > k) {
                sum = sum - arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < arr.length) {
                sum += arr[right];
            }
        }

        return maxLen;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
        int k = 6;
        int result = longestSubarrayOptimalSolution(arr, k);
        System.out.println(result); // Output: 4
    }
}
