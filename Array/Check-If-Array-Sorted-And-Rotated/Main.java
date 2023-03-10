public class Main {

    public static boolean isSortedAndRotated(int arr[]) {
        int breakPoint = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                breakPoint++;
            }
        }
        if (arr[arr.length - 1] > arr[0]) {
            breakPoint++;
        }
        return breakPoint > 1 ? false : true;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };
        System.out.println(isSortedAndRotated(arr));
    }
}
