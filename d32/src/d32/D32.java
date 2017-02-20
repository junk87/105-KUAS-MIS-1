/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d32;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class D32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        String b = scn.nextLine();
        String c[] = a.split(" ");
        String d[] = b.split(" ");
        boolean h = false;
        int e[] = new int[c.length];
        int f[] = new int[d.length];
        int big = e.length;
        if (e.length < f.length) {
            big = f.length;
            h = true;
        }
        int g[] = new int[big];
        for (int i = 0; i < c.length; i++) {
            e[i] = Integer.valueOf(c[i]);
        }
        for (int i = 0; i < d.length; i++) {
            f[i] = Integer.valueOf(d[i]);
        }
        for (int i = 0; i < big; i++) {
            if (h) {
                if (i >= f.length - e.length) {
                    g[i] = f[i] + e[i - (f.length - e.length)];
                } else {
                    g[i] = f[i];
                }
            } else {
                if (i >= e.length - f.length) {
                    g[i] = e[i] + f[i - (e.length - f.length)];
                } else {
                    g[i] = e[i];
                }
            }
            if (i != big - 1) {
                if (g[i] != 1) {
                    System.out.print(g[i] + "x^" + (big - i - 1) + "+");
                } else {
                    System.out.print( "x^" + (big - i - 1) + "+");
                }
            } else {
                System.out.println(g[i]);
            }
        }
    }
}
