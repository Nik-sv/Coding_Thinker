package Arrays;

public class Target {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 6, 9};
        int target = 8;
        int count = 0;

        int left = 0;
        int right = arr.length - 1; // Fix: right should start at last index

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                count++;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Number of pairs with target sum: " + count);
    }
}
