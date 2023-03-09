class Main {
    public static int largest(int arr[]) {
        int largestValue = Integer.MIN_VALUE;

        for (int idx = 0; idx < arr.length; idx++) {
            largestValue = Math.max(largestValue, arr[idx]);
        }

        return largestValue;
    }

    public static int secondLargest(int arr[]) {
        int secondLargestValue = Integer.MIN_VALUE;
        int largestValue = largest(arr);
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != largestValue) {
                secondLargestValue = Math.max(secondLargestValue, arr[idx]);
            }
        }
        return secondLargestValue;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 8, 3, 6, 7, 5 };
        System.out.println("The second largest value in the array is: " + secondLargest(arr));
    }
}
