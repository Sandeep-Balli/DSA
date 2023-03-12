import java.util.*;

public class Main {
    public static int longestStreak(int nums[]) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            hs.add(i);
        }

        int maxStreak = 0;
        int count = 0;

        for (int i : nums) {
            if (!hs.contains(i - 1)) {
                count = 1;
                while (hs.contains(i + count)) {
                    count++;
                }
                maxStreak = Math.max(maxStreak, count);
            }
        }

        return maxStreak;

    }

    public static void main(String[] args) {
        int nums[] = { 100, 4, 200, 1, 3, 2 };
        System.out.println("The longest Streak is: " + longestStreak(nums));
    }
}
