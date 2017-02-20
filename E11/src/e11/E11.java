/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e11;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class E11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        boolean b = true;
        for (int i = 2; i <= a / 2; i++) {
            if (a == 2) {
                break;
            }
            if (a % i == 0) {
                b = false;
            }
        }
        if (b) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }
    }

}
