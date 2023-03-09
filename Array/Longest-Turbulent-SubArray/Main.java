public class Main {

    public static int longestTurbulentSubArray(int arr[]) {
        int inc = 1, dec = 1, result = 1;
        for (int idx = 1; idx < arr.length; idx++) {
            if (arr[idx] > arr[idx - 1]) {
                inc = dec + 1;
                dec = 1;
            } else if (arr[idx] < arr[idx - 1]) {
                dec = inc + 1;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            result = Math.max(result, Math.max(inc, dec));
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 4, 2, 10, 7, 8, 8, 1, 9 };
        System.out.println("The length of the longest turbulent sub array is: " + longestTurbulentSubArray(arr));
    }
}
