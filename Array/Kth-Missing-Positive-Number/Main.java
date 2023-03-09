
public class Main {
    public static int missingNumber(int arr[], int k) {
        for (int idx : arr) {
            if (idx <= k) {
                k++;
            }
        }
        return k;
    }

    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - (mid + 1) < k)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start + k;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.println("The Kth missing positive number is: " + missingNumber(arr, k));
    }
}
