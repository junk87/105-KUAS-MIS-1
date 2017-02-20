/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        int c = scn.nextInt();
        String d = scn.next();
        String b[] = replace(a, c, d);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }

    public static String[] replace(String a, int c, String d) {
        String b[] = a.split("");
        b[c - 1] = d;
        return b;
    }
}
