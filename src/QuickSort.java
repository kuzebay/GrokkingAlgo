import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[50];
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(a.length);
            System.out.print(a[i] + " ");
        }
        System.out.println();


    }

}
