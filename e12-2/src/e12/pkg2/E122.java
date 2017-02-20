package e12.pkg2;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class E122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String se[] = s.split(",");
        int c[] = new int[se.length];
        for (int i = 0; i < se.length; i++) {
            c[i] = Integer.valueOf(se[i]);
        }
        int d[] = new int[se.length];
        int a[] = tr(c, c.length - 1, d, 0);
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ",");
            }
        }
    }

    public static int[] tr(int[] a, int b, int d[], int e) {
        if (b != 0) {
            d[e] = a[b];
            e++;
            b -= 1;
            return tr(a, b, d, e);
        } else {
            d[e] = a[b];
            return d;
        }
    }
}
