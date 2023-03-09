public class Main {
    public static int buyAndSellStock(int arr[]) {
        int maxProfit = 0;
        for (int idx = 1; idx < arr.length; idx++) {
            if (arr[idx] > arr[idx - 1]) {
                maxProfit += arr[idx] - arr[idx - 1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 1, 2, 8 };
        System.out.println("The maximum profit is: " + buyAndSellStock(arr));
    }
}
