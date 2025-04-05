package Arrays;

import java.util.Scanner;

public class Maximum_Element {
    public static void main(String[] args) {

//        int Max = 0;
        int[] array = {1 , 2 , 3, 4 , 5 ,6 ,7};
        int Max = 0;
        for (int i = 1; i < array.length; i++) {

            if ( Max < array[i]) {
                Max = array[i];
                System.out.println(Max);
                break;
            }
        }
    }
}
