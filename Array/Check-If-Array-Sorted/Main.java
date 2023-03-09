class Main {
    public static boolean isSorted(int arr[]) {
        for(int idx = 0; idx < arr.length-1; idx++) {
            if(arr[idx] > arr[idx + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        if (isSorted(arr)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
