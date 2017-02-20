/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e12;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class E12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b[] = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = scn.nextInt();
        }
        int c[] = turn(b, 0);
        for (int i = 0; i < a; i++) {
            System.out.print(c[i] + " ");
        }
    }

    public static int[] turn(int b[], int c) {
        if (c > (b.length - 1) / 2) {
            return b;
        } else {
            int e = b[c];
            b[c] = b[b.length - 1 - c];
            b[b.length - 1 - c] = e;
            System.out.println(b[c] + " " + b[b.length - 1 - c]);
            return turn(b, c + 1);
        }
    }
}
