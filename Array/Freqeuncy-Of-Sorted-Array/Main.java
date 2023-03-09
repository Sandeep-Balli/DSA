class Main {
    public static void printFrequency(int arr[]) {
        int count = 1;
        for (int idx = 0; idx < arr.length - 1; idx++) {
            System.out.println();
            if (arr[idx] != arr[idx + 1]) {
                System.out.print("Element = " + arr[idx] + " " + "Frequency = " + count);
                count = 1;
            } else {
                count++;
            }
        }
        System.out.println("Element = " + arr[arr.length - 1] + " " + "Frequency = " + count);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 10, 20, 30, 30 };
        printFrequency(arr);
    }
}