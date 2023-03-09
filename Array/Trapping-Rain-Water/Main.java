
public class Main {
    public static int water(int arr[]) {
        int lMax[] = new int[arr.length];
        int rMax[] = new int[arr.length];
        int res = 0;

        lMax[0] = arr[0];
        for (int idx = 1; idx < arr.length; idx++) {
            lMax[idx] = Math.max(lMax[idx - 1], arr[idx]);
        }

        rMax[arr.length - 1] = arr[arr.length - 1];
        for (int idx = arr.length - 2; idx >= 0; idx--) {
            rMax[idx] = Math.max(rMax[idx + 1], arr[idx]);
        }

        for (int idx = 1; idx < arr.length - 1; idx++) {
            res += Math.min(lMax[idx], rMax[idx]) - arr[idx];
        }
        return res;

    }

    public static int water2(int arr[]) {
        int left = 0, right = arr.length - 1;
        int lMax = 0, rMax = 0, sum = 0;

        while (left <= right) {
            lMax = Math.max(lMax, arr[left]);
            rMax = Math.max(rMax, arr[right]);

            if (lMax < rMax) {
                sum += lMax - arr[left];
                left++;
            } else {
                sum += rMax - arr[right];
                right--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println("Total water trapped = " + water2(arr));
    }
}
