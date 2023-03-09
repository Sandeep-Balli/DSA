import java.util.*;

public class Main {
    public static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[arr.length - 1]);
        int curr_max = arr[arr.length - 1];
        for (int i = arr.length - 2; i > 0; i--) {
            if (arr[i] > curr_max) {
                curr_max = Math.max(curr_max, arr[i]);
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 14, 1, 6, 3, 1, 5, -3 };
        ArrayList<Integer> list = new ArrayList<>();
        list = leaders(arr);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
