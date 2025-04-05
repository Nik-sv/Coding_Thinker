package Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] array = {1 , 2, 3, 4, 5, 6 ,7};

        // How to access array
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
            System.out.println(sum);
        }

    }
}
