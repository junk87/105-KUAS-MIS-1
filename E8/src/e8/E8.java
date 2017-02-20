/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e8;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a >= 1 && a <= 30) {
            int b[] = new int[a];
            for (int i = 0; i < b.length; i++) {
                b[i] = scn.nextInt();
            }
            for (int i = 1; i <= b.length - 1; i++) {
                for (int j = 1; j < b.length; j++) {
                    if (b[j - 1] > b[j]) {
                        int c = b[j];
                        b[j] = b[j - 1];
                        b[j - 1] = c;
                    }
                }
            }
            for (int i = 0; i < b.length; i++) {
             System.out.print(b[i] + " ");
            }
        }
    }
}
