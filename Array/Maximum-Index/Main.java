class Main {

    public static int maxDifference(int arr[]) {
        int maxDiff = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i] <= arr[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                i++;
                j = arr.length - 1;
            } else {
                j--;
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int arr[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
        System.out.println("The maximum difference is, " + maxDifference(arr));
    }
}