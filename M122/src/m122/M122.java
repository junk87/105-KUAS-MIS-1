/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m122;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class M122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        float m = 0;
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            m += 1.0f / power(2, i);
        }
        System.out.println(m);
    }

    public static float power(int a, int n) {
        if (n!= 1) {
            a *= 2;
            return power(a, n - 1);
        } else {
            System.out.println(a);
            return a;
        }
    }
}
