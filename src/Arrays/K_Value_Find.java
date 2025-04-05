package Arrays;

public class K_Value_Find {
    public static void main(String[] args) {

        int k = 4;
        int[] array = {1 , 2 , 3, 4 , 5 ,6 ,7};
        for (int i = 0; i < array.length; i++) {
            if (k == array[i]){
                System.out.println(k);
                break;
            }
        }
    }
}
