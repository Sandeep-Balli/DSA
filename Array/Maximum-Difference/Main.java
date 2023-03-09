class Main {
    public static int maxDifference(int arr[]) {
        int diff = -1;
        int minValue = arr[0];
        for (int idx = 1; idx < arr.length; idx++) {
            if(arr[idx] < minValue) {
                minValue = arr[idx];
            }
            if(arr[idx] > minValue) {
                diff = Math.max(diff, arr[idx] - minValue);
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 10, 6, 4, 8, 11 };
        System.out.println("The maximum difference is: " + maxDifference(arr));
    }
}