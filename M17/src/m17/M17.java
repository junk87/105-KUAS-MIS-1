/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m17;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class M17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        int tax = 0;
        if (i >= 3720000) {
            tax += (i - 3720000) * 0.4;
            i = 3720000;
        }
        if (i >= 1980000) {
            tax += (i - 1980000) * 0.3;
            i = 1980000;
        }
        if (i >= 990000) {
            tax += (i - 990000) * 0.21;
            i = 990000;
        }
        if (i >= 370000) {
            tax += (i - 370000) * 0.13;
            i = 370000;
        }
        tax +=i*0.06;
        System.out.println(tax);
    }
}
