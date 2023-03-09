
public class Main {
    public static void leftRotateByOne(int arr[]) {
        int element = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = element;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Before rotating");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        leftRotateByOne(arr);
        System.out.println();
        System.out.println("after rotating");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
