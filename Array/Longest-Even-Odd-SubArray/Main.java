class Main {

    public static int longestSubArray(int arr[]) {
        int curr = 1;
        int max = 1;

        for (int idx = 1; idx < arr.length; idx++) {
            if ((arr[idx] % 2 == 0 && arr[idx - 1] % 2 != 0) || (arr[idx] % 2 != 0 && arr[idx - 1] % 2 == 0)) {
                curr += 1;
                max = Math.max(max, curr);
            } else {
                curr = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 20, 6, 3, 8 };
        System.out.println("The length of the longest even odd subarray is: " + longestSubArray(arr));
    }
}