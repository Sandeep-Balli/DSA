public class Main {

    public static int buyAndSellStock(int arr[]) {
        int maxProfit = 0;
        int minValue = arr[0];

        for (int idx = 1; idx < arr.length; idx++) {
            minValue = Math.min(arr[idx], minValue);

            maxProfit = Math.max(maxProfit, arr[idx] - minValue);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("The maximum profit is: " + buyAndSellStock(arr));
    }
}
