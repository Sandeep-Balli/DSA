class Main {

    public static int largestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int idx = 0; idx < arr.length; idx++) {
            largest = Math.max(largest, arr[idx]);
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 8, 3, 6, 7, 5 };
        System.out.println("Largest element in the array is: " + largestElement(arr));

    }
}