import java.util.*;

public class RecursionTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Input: ");
        int n = scn.nextInt();
        scn.close();

        System.out.println(n + "! = " + fact(n));

        }

    static long fact(long x){
        if (x != 1) {
            return x * fact(--x);
        } else return 1;
    }
}
