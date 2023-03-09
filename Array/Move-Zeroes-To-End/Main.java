public class Main {
    public static void moveZeroes(int arr[]) {
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (arr[j] == 0) {
                j++;
            } else {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 3, 0, 4, 5, 0 };
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
