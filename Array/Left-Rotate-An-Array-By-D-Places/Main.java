public class Main {
    public static void leftRotateByD(int arr[], int d) {
        int n = arr.length - 1;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n);
        reverse(arr, 0, n);
    }

    public static void reverse(int arr[], int low, int high) {
        while (low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Before rotating");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        leftRotateByD(arr, 2);
        
        System.out.println();
        System.out.println("after rotating");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
