/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m19;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class M19 {

    /**
     * @param args the command line arguments   
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int ans = 0;
        int con = n - 1;
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
            System.out.println(a[i]);
        }
        for (int i = 0; i < n; i++) {
            b[i] = scn.nextInt();
            System.out.println(b[i]);
        }
        for (int i = 0; i < n; i++) {
            ans += a[i] * b[(n - 1) - i];
        }
        System.out.println(ans);
    }

}
