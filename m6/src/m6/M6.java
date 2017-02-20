/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class M6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        float f = 1 + ((30 * 2.54f) / 100);
        float t = m / f;
        int c = 0;
        if ((int) t - 1 < t && t < (int) t + 1) {
            c = (int) t + 1;
        } else {
            c = (int) t;
        }
        System.out.println(c + "秒");
        if (c >= 3600) {
            System.out.print((c/3600) + "時");
            c %= 3600;
        }
        if (c >= 60) {
            System.out.print((c/60) + "分");
            c %= 60;
        }
        System.out.print(c + "秒");

    }

}
