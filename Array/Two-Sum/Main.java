import java.util.*;

public class Main {
    public static int[] twoSum(int nums[], int target) {
        int arr[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int idx = 0; idx < nums.length; idx++) {
            if (map.containsKey(target - nums[idx])) {
                arr[0] = idx;
                arr[1] = map.get(target - nums[idx]);
                break;
            }
            map.put(nums[idx], idx);
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int result[] = twoSum(nums, 9);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
