public class Main {
    public static int mostConsecutiveOne(int arr[]) {
        int currCount = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currCount++;
            } else {
                currCount = 0;
            }
            maxCount = Math.max(currCount, maxCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 };
        System.out.println("The length of most consecutive one's is: " + mostConsecutiveOne(arr));
    }
}
