import java.util.*;

public class Main {
    public static ArrayList<Integer> majorityElement(int nums[]) {
        int num1 = -1;
        int num2 = -1;
        int count1 = 0;
        int count2 = 0;
        int len = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1) {
                count1++;
            } else if (nums[i] == num2) {
                count2++;
            } else if (count1 == 0) {
                num1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                num2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1) {
                count1++;
            } else if (nums[i] == num2) {
                count2++;
            }
        }

        if (count1 > len / 3) {
            list.add(num1);
        }
        if (count2 > len / 3) {
            list.add(num2);
        }
        return list;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3, 2, 3 };
        ArrayList<Integer> list = majorityElement(nums);
        HashSet<Integer> set = new HashSet<>(list);
        for (int i : set) {
            System.out.print(i + " ");
        }
    }
}
