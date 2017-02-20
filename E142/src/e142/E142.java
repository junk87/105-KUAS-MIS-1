/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e142;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class E142 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        for (int i = 0; i <= a; i++) {
            if (b == i * 2 + (a - i) * 4) {
                System.out.print(i+" "+(a-i));
                break;
            }
        }
    }
}
