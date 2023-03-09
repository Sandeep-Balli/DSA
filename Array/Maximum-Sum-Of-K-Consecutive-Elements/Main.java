public class Main {
    public static int maxSum(int arr[], int k) {
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += arr[i];
        }
        int res = curr;
        for (int i = k; i < arr.length; i++) {
            curr += arr[i] - arr[i - k];
            res = Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 30, -5, 20, 7 };
        System.out.println("The maximum su of K consecutive elements is: " + maxSum(arr, 4));
    }
}
