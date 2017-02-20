package e2;

import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        int c = lg(a);
        String b[] = reverse(a);
        System.out.println(c);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }

    public static int lg(String a) {
        return a.length();
    }

    public static String[] reverse(String a) {
        String b[] = a.split("");
        String c[] = new String[b.length];
        int d = b.length - 1;
        for (int i = 0; i < b.length; i++) {
            c[d] = b[i];
            d--;
        }
        return c;
    }
}
