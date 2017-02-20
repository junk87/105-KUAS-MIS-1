package d3;

import java.util.Scanner;

public class D3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n + 2];
        int b[] = new int[n + 2];
        for (int i = n; i >= 0; i--) {
            a[i] = scn.nextInt();
        }
        for (int i = n; i >= 0; i--) {
            b[i] = scn.nextInt();
        }
        for (int i = n; i >= 0; i--) {
            if (i != 0 && i != 1) {
                System.out.print((a[i] + b[i]) + "x^" + i + "+");
            } else {
                if (i == 1) {
                    System.out.print((a[i] + b[i]) + "x" + "+");
                }
                else{
                System.out.print((a[i] + b[i]));
                }
            }
        }
    }

}
