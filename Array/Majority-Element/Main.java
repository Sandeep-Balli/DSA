
public class Main {

    public static int majorityElement(int[] a) {
        int count = 0;
        int item = 0;
        for (int idx : a) {
            if (count == 0) {
                item = idx;
            }
            if (idx == item) {
                count++;
            } else {
                count--;
            }
        }
        return item;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 1, 1, };
        System.out.println("The majority element in the array is: " + majorityElement(arr));
    }
}
