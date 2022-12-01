import java.util.*;

public class Dec2BinOctHex {
    static public void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input dec: ");
        int n = scn.nextInt();
        scn.close();

        System.out.println("Bin: " + toBin(n));
        System.out.println("Oct: " + toOct(n));
        System.out.println("Oct: " + toHex(n));
    }

    static String toBin(int x) {
        String s = "";
        while (x > 0) {
            int b = x % 2;
            s = b + s;
            x = x / 2;
        }
        return s;
    }

    static String toOct(int x) {
        String s = new String("");
        while (x > 0) {
            int b = x % 8;
            s = b + s;
            x = x / 8;
        }
        return s;
    }

    static String toHex(int x) {
        String s = new String("");
        char[] hexArr = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (x > 0) {
            int b = x % 16;
            s = hexArr[b] + s;
            x = x / 16;
        }
        return s;
    }
}
