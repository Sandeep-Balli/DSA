
public class Main {
    public static int removeDuplicates(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 30, 30, 30, 30 };
        System.out.println("Before Removal");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int res = removeDuplicates(arr);

        System.out.println("After Removal");

        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
