class Main {

    public static void sortZeroOneTwo(int arr[]) {
        int zero = 0;
        int one = 0;
        int two = arr.length - 1;
        while (one <= two) {
            switch (arr[one]) {
                case 0: {
                    int temp = arr[zero];
                    arr[zero] = arr[one];
                    arr[one] = temp;
                    one++;
                    zero++;
                    break;
                }
                case 1: {
                    one++;
                    break;
                }
                case 2: {
                    int temp = arr[one];
                    arr[one] = arr[two];
                    arr[two] = temp;
                    two--;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 0, 0, 1, 2 };
        System.out.println("Before Sorting");
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
        }
        sortZeroOneTwo(arr);
        System.out.println();
        System.out.println("After Sorting");
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
        }
    }
}
