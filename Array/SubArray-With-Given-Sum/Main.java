
public class Main {
    public static boolean isSubSum(int arr[], int sum) {
        int curr = 0, j = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            curr += arr[idx];
            while (sum < curr) {
                curr = curr - arr[j];
                j++;
            }
            if (curr == sum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        System.out.println(isSubSum(arr, 23));
    }
}
